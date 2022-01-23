package basico.sequencial;

public class exerciciotres {

	public static void main(String[] args) {

		/*
		 * Exercício 03
		 * 
		 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
		 * calcule e mostre a diferença do produto de A e B pelo produto de C e D
		 * segundo a fórmula: DIFERENCA = (A * B - C * D). Exemplos:
		 * 
		 * Entrada: 5 6 7 8 Saída: DIFERENCA = -26
		 * 
		 * Entrada: 5 6 -7 8 Saída: DIFERENCA = 86
		 */

		int a = 5, b = 6, c = 7, d = 8, e = -7;
		int diferenca = (a * b - c * d);
		int diferencaDois = (a * b - d * e);
		System.out.println(diferenca);
		System.out.println(diferencaDois);

	}

}
