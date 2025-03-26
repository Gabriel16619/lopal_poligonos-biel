package br.com.engsenai.projeto_area_perimetro_circunferencia.model.ui;

import java.util.Scanner;

public class Menu {

	public void criarMenu() { 
		System.out.println("--------------------------");
		System.out.println("CALCULADORA DE POÍGONOS");
		System.out.println("--------------------------");
		System.out.println("1 - Quadrado");
		System.out.println("2 - Triângulo");
		System.out.println("3 - Traézio");
		System.out.println("4 - Retângulo");
		System.out.println("5 - Circuferência");
		System.out.println("6 - Sair");
		System.out.println("--------------------------");
		System.out.println("Escolha uma opção (1 - 6): ");
		
		Scanner leitor = new Scanner(System.in);
		int opção = leitor.nextInt();
		
		System.out.println("A opção selecionada foi: " + opção);

	}
}
