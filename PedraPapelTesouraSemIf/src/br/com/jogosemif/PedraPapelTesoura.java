package br.com.jogosemif;

import java.util.Scanner;

public class PedraPapelTesoura {

	public static void main(String[] args) {

		Integer jogador;
		Scanner mao = new Scanner(System.in);
		System.out.println("_____Pedra Papel Tesoura______");
		System.out.println("______________________________");
		System.out.println("1 - Pedra");
		System.out.println("2 - Papel");
		System.out.println("3 - Tesoura");
		System.out.println("Escolha qual objeto deseja jogar");

		jogador = mao.nextInt();
		
		switch (jogador) {
		case 1:
			System.out.println("Jogador escolheu Pedra");
			break;
		case 2:
			System.out.println("Jogador escolheu Papel");
			break;
		case 3:
			System.out.println("Jogador escolheu Tesoura");
			break;
		default:
			System.out.println("Opçao Invalida");
			break;
		}
		
		
		int computador = (int) (Math.random()*3+1);
		
		switch (computador) {
		case 1:
			System.out.println("Computador escolheu Pedra");
			break;
		case 2:
			System.out.println("Computador escolheu Papel");
			break;
		case 3:
			System.out.println("Computador escolheu Tesoura");
			break;
		default:
			System.out.println("Opçao Invalida");
			break;
		}

	}

}
