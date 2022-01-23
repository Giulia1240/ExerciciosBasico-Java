package basico.sequencial;

public class exerciciocinco {
	public static void main(String[] args) {
		/*
		 * Exercício 06 Fazer um programa que leia três valores com ponto flutuante de
		 * dupla precisão: A, B e C. Em seguida, calcule e mostre: a) a área do
		 * triângulo retângulo que tem A por base e C por altura. b) a área do círculo
		 * de raio C. (pi = 3.14159) c) a área do trapézio que tem A e B por bases e C
		 * por altura. d) a área do quadrado que tem lado B. e) a área do retângulo que
		 * tem lados A e B.
		 * 
		 * Exemplos:
		 * 
		 * Entrada: 3.0 4.0 5.2 Saída: TRIANGULO: 7.800 CIRCULO: 84.949 TRAPEZIO: 18.200
		 * QUADRADO: 16.000 RETANGULO: 12.000
		 */

		// TRIANGULO
		float baseA = 3;
		float baseB = 4;
		float alturaC = (float) 5.2;
		float areaTriangulo = baseA * alturaC / 2;
		System.out.printf("TRIANGULO = %.3f %n", areaTriangulo);

		// TRAPEZIO
		float areaTrapezio = (alturaC * (baseB + baseA) / 2);
		System.out.printf("TRAPEZIO = %.3f %n", areaTrapezio);

		// QUADRADO
		float areaQuadrado = (baseB * 4);
		System.out.printf("QUADRADO = %.3f %n", areaQuadrado);

		// RETANGULO
		float areaRetangulo = (baseA * baseB);
		System.out.printf("RETANGULO = %.3f %n", areaRetangulo);

		// CIRCULO
		Double raioC = 5.2;
		Double pi = 3.14159;
		Double areaCirculo = pi * (raioC * raioC);
		System.out.printf("CIRCULO = %.3f %n", areaCirculo);

	}

}
