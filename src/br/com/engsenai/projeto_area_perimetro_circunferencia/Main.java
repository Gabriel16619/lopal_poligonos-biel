package br.com.engsenai.projeto_area_perimetro_circunferencia;

import java.util.Scanner;
import br.com.engsenai.projeto_area_perimetro_circunferencia.model.ui.Menu;
import br.com.engsenai.projeto_area_perimetro_circunferencia.model.Quadrado;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("digite seu nome: ");
		
		
		String nome = scanner.next();
		
		System.out.println(nome.length());
		System.out.println("olá, " + nome);
		System.out.println(nome.toUpperCase());
		
		Menu menu = new Menu();
		menu.criarMenu();
		
	}

}
