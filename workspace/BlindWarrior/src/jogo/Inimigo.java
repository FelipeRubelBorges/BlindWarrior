package jogo;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

//Classe dos Inimigos

public class Inimigo {

	private int x, y;
	private Image imagem;
	private int largura, altura;
	private boolean visivel;

	private static final int LARGURA_TELA = 800;
	private static final int VELOCIDADE = 1;

	private static int contador = 0;
          
	public Inimigo(int x, int y) {
		
		this.x = x;
		this.y = y;
		ImageIcon referencia;

		if (contador++ % 3 == 0) {
			referencia = new ImageIcon("res\\inimigo1.gif");
		} else {
			referencia = new ImageIcon("res\\inimigo2.gif");
		}

		imagem = referencia.getImage();

		this.largura = imagem.getWidth(null);
		this.altura = imagem.getHeight(null);

		visivel = true;
	}

	public void mexer() {

		if (this.x < 0) {
			this.x = LARGURA_TELA;
		} else {
			this.x -= VELOCIDADE;
		}

	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Image getImagem() {
		return imagem;
	}

	public void setImagem(Image imagem) {
		this.imagem = imagem;
	}

	public boolean isVisivel() {
		return visivel;
	}

	public void setVisivel(boolean visivel) {
		this.visivel = visivel;
	}

	public Rectangle getBounds() {

		return new Rectangle(x, y, largura, altura);

	}

}
