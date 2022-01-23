package basico.sequencial;

public class exerciciodois {

	public static void main(String[] args) {

		/*
		 * Exercício 02 Faça um programa para ler o valor do raio de um círculo, e
		 * depois mostrar o valor da área deste círculo com quatro casas decimais
		 * conforme exemplos. Fórmula da área: area = π . raio2 Considere o valor de π =
		 * 3.14159
		 * 
		 * Exemplos: Entrada: 2.00 Saída: A=12.5664
		 * 
		 * Entrada: 100.64 Saída: A=31819.3103
		 * 
		 * Entrada: 150.00 Saída: A=70685.7750
		 */

		Double pi = 3.14159;
		Double a = 100.64, b = 150.00, x = 2.00, y = 2.00;
		Double area = pi * (Math.pow(x, y));
		Double areaDois = pi * (Math.pow(a, y));
		Double areaTres = pi * (Math.pow(b, y));

		System.out.println(area);
		System.out.println(areaDois);
		System.out.println(areaTres);

	}

}
