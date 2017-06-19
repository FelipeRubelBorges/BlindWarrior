package jogo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.FormatFlagsConversionMismatchException;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Fase extends JPanel implements ActionListener {

	private Image fundo;
	private Ziska ziska;
	private Timer timer;

	private boolean emJogo;

	private List<Inimigo> inimigos;

	private int[][] coordenadas = { { 2380, 29 }, { 2600, 59 }, { 1380, 89 }, { 780, 109 }, { 580, 139 }, { 880, 239 },
			{ 790, 259 }, { 760, 50 }, { 790, 150 }, { 1980, 209 }, { 560, 45 }, { 510, 70 }, { 930, 159 }, { 590, 80 },
			{ 530, 60 }, { 940, 59 }, { 990, 30 }, { 920, 200 }, { 900, 259 }, { 660, 50 }, { 540, 90 }, { 810, 220 },
			{ 860, 20 }, { 740, 180 }, { 820, 128 }, { 490, 170 }, { 700, 30 }, { 920, 300 }, { 856, 328 },
			{ 456, 320 } };

	public Fase() {

		setDoubleBuffered(true);
		setFocusable(true);
		addKeyListener(new TecladoAdapter());
		ImageIcon referencia = new ImageIcon("res\\fundo.png");
		fundo = referencia.getImage();

		ziska = new Ziska();

		emJogo = true;

		inicializaInimigos();

		timer = new Timer(5, this);
		timer.start();

	}

	public void inicializaInimigos() {

		inimigos = new ArrayList<Inimigo>();

		for (int i = 0; i < coordenadas.length; i++) {
			inimigos.add(new Inimigo(coordenadas[i][0], coordenadas[i][1]));

		}
	}

	public void paint(Graphics g) {

		Graphics2D graficos = (Graphics2D) g;
		graficos.drawImage(fundo, 0, 0, null);

		if (emJogo) {

			graficos.drawImage(ziska.getImagem(), ziska.getX(), ziska.getY(), this);

			List<Flecha> flechas = ziska.getFlechas();

			for (int i = 0; i < flechas.size(); i++) {

				Flecha m = (Flecha) flechas.get(i);
				graficos.drawImage(m.getImagem(), m.getX(), m.getY(), this);
			}

			for (int i = 0; i < inimigos.size(); i++) {

				Inimigo in = inimigos.get(i);
				graficos.drawImage(in.getImagem(), in.getX(), in.getY(), this);
			}
			
			graficos.setColor(Color.BLACK);
			graficos.drawString("INIMIGOS: " + inimigos.size(), 5, 15);
			

		}else{
			
			
			ImageIcon fimJogo = new ImageIcon("res\\Gameover.jpg");
			
			graficos.drawImage(fimJogo.getImage(), 0,0, null);
		}
		g.dispose();

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		if (inimigos.size() == 0) {
			emJogo = false;
		}

		List<Flecha> flechas = ziska.getFlechas();

		for (int i = 0; i < flechas.size(); i++) {

			Flecha m = (Flecha) flechas.get(i);

			if (m.isVisivel()) {
				m.mexer();

			} else {
				flechas.remove(i);
			}

		}

		for (int i = 0; i < inimigos.size(); i++) {

			Inimigo in = inimigos.get(i);

			if (in.isVisivel()) {
				in.mexer();

			} else {
				inimigos.remove(i);
			}

		}

		ziska.mexer();
		checarColisoes();
		repaint();

	}

	public void checarColisoes() {

		Rectangle formaZiska = ziska.getBounds();
		Rectangle formaInimigo;
		Rectangle formaFlecha;

		for (int i = 0; i < inimigos.size(); i++) {

			Inimigo tempInimigo = inimigos.get(i);
			formaInimigo = tempInimigo.getBounds();

			if (formaZiska.intersects(formaInimigo)) {

				ziska.setVisivel(false);
				tempInimigo.setVisivel(false);
				emJogo = false;
			}

		}

		List<Flecha> flechas = ziska.getFlechas();

		for (int i = 0; i < flechas.size(); i++) {

			Flecha tempFlechas = flechas.get(i);
			formaFlecha = tempFlechas.getBounds();

			for (int j = 0; j < inimigos.size(); j++) {

				Inimigo tempInimigo = inimigos.get(j);
				formaInimigo = tempInimigo.getBounds();

				if (formaFlecha.intersects(formaInimigo)) {

					tempInimigo.setVisivel(false);
					tempFlechas.setVisivel(false);
				}

			}

		}

	}

	private class TecladoAdapter extends KeyAdapter {

		@Override
		public void keyPressed(KeyEvent e) {
			
			if(e.getKeyCode() == KeyEvent.VK_ENTER){
				emJogo = true;
				ziska = new Ziska();
				inicializaInimigos();
						
			}
			
			ziska.keyPressed(e);
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			ziska.keyReleased(e);
		}

	}

}
