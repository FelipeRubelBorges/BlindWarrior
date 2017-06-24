import java.util.Scanner;

import javax.swing.JOptionPane;

public class Game {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String nomeJogador = "";
		

		Player jogador = new Player();
		jogador.setNomeJogador(nomeJogador);
		

	
		System.out.println("Qual seu Nome ? : ");
		nomeJogador = in.nextLine();
		
		System.out.println(nomeJogador);
		
		System.out.println("======= ** Iniciando Jogo ** =======");

	}

}
