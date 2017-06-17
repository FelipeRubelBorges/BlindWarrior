package jogo;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContainerDeJanelas extends JFrame {

	public ContainerDeJanelas() {

		add(new Fase());
		setTitle("Blind Warrior");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);

	}

	public static void main(String[] args) {

		new ContainerDeJanelas();

	}

}
