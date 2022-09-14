package ui;

import negocio.Circulo;
import negocio.FormaGeometrica;
import negocio.Ponto;
import negocio.Quadrado;

public class Principal {

	public static void main(String[] args) {
		FormaGeometrica quadrado = new Quadrado(new Ponto(0, 0), new Ponto(3,0), "Preto", "Branco");
		FormaGeometrica circulo = new Circulo(new Ponto(0,0), 10f, "Preto", "Branco");
		
		Quadrado quadrado2 = new Quadrado();
		Circulo circulo2 = new Circulo();
		
		System.out.println(quadrado.calcularArea());
		
	}

}
