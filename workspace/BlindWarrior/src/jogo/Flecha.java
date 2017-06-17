package jogo;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Flecha {

	private int x;
	private int y;
	private Image imagem;
	private boolean visivel;

	private static final int LARGURA_TELA = 800;
	private static final int VELOCIDADE = 2;

	public Flecha(int x, int y) {
		this.x = x;
		this.y = y;

		ImageIcon referencia = new ImageIcon("res\\flecha.png");
		imagem = referencia.getImage();

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

}
