package jogo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;

//Classe Para a Janela do Jogo

public class ContainerDeJanelas extends JFrame {

	public ContainerDeJanelas() {

		JMenuBar barraMenu = new JMenuBar();

		JMenu menu = new JMenu("Menu");

		JMenuItem sobre = new JMenuItem("Sobre");
		sobre.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, "Jogo do Felipe para Miere ;)", "Obrigado!", JOptionPane.INFORMATION_MESSAGE);
			}
		});

		JMenuItem sair = new JMenuItem("Sair");
		sair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		menu.add(sobre);
		menu.add(new JSeparator());
		menu.add(sair);
		
		barraMenu.add(menu);
		
		setJMenuBar(barraMenu);
		
		add(new Fase());
		setTitle("Blind Warrior");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 620);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);

	}

	public static void main(String[] args) {

		new ContainerDeJanelas();

	}

}
