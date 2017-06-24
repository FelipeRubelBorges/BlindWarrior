package jogo;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

//Classe da flecha usado no jogo

public class Flecha {

	private int x, y;
	private int largura, altura;
	private Image imagem;
	private boolean visivel;

	private static final int LARGURA_TELA = 800;
	private static final int VELOCIDADE = 4;

	public Flecha(int x, int y) {
		this.x = x;
		this.y = y;

		ImageIcon referencia = new ImageIcon("res\\flecha.jpg");
		imagem = referencia.getImage();

		this.largura = imagem.getWidth(null);
		this.altura = imagem.getHeight(null);

		visivel = true;
	}

	public void mexer() {

		this.x += VELOCIDADE;
		if (this.x > LARGURA_TELA) {
			visivel = false;
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
