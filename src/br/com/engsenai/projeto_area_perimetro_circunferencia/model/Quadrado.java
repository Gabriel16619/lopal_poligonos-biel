package br.com.engsenai.projeto_area_perimetro_circunferencia.model;

public class Quadrado {
	
	private double lado;
	
	public void setLado(double lado) {
		if(lado < 0 ) {
			this.lado = 1;
		} else {
			this.lado = lado;
		}
		
	}
	
	private double calcularArea() {
		double area = Math.pow(lado, 2);
		return area;
	}
	
	private double calcularPerimetro() {
		double perimetro = (4*lado);
		return(perimetro);
	}
	
	public void mostrarDados() {
		System.out.println("----------------");
		System.out.println("DADOS DO QUADRADO ");
		System.out.println("----------------");
		System.out.println("LADO " + lado);
		System.out.println("ÁREA " + calcularArea());
		System.out.println("Perímetro " + calcularPerimetro());
		System.out.println("----------------");
	}
	
	
}
