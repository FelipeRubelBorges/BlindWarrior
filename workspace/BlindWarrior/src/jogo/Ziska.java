package jogo;

import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Ziska {

	private int x;
	private int y;
	private int dx;
	private int dy;
	private Image imagem;

	public Ziska() {

		ImageIcon referencia = new ImageIcon("res\\ziska.jpeg");
		imagem = referencia.getImage();

		this.x = 100;
		this.y = 100;

	}

	//metodo pra fazer o gif se mecher 
	public void mexer() {

		System.out.println(x + ", " + y);

		x += dx;
		y += dy;

		if (this.x < -3) {
			x = -3;
		}

		if (this.x > 596) {
			x = 596;
		}

		if (this.y < -13) {
			y = -13;
		}

		if (this.y > 317) {
			y = 317;
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

	public int getDx() {
		return dx;
	}

	public void setDx(int dx) {
		this.dx = dx;
	}

	public int getDy() {
		return dy;
	}

	public void setDy(int dy) {
		this.dy = dy;
	}

	public Image getImagem() {
		return imagem;
	}

	public void setImagem(Image imagem) {
		this.imagem = imagem;
	}

	public void keyPressed(KeyEvent tecla) {

		int codigo = tecla.getKeyCode();

		switch (codigo) {
		case KeyEvent.VK_UP:
			dy = -1;
			break;
		case KeyEvent.VK_DOWN:
			dy = 1;
			break;
		case KeyEvent.VK_LEFT:
			dx = -1;
			break;
		case KeyEvent.VK_RIGHT:
			dx = 1;
			break;
		}

	}

	public void keyReleased(KeyEvent tecla) {

		int codigo = tecla.getKeyCode();

		switch (codigo) {
		case KeyEvent.VK_UP:
			dy = 0;
			break;
		case KeyEvent.VK_DOWN:
			dy = 0;
			break;
		case KeyEvent.VK_LEFT:
			dx = 0;
			break;
		case KeyEvent.VK_RIGHT:
			dx = 0;
			break;
		}

	}

}
