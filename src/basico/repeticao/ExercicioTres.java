package basico.repeticao;

import java.util.Scanner;

public class ExercicioTres {
	public static void main(String[] args) {

//		Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
//		um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
//		4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
//		que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
//		mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
//		exemplo.

		Scanner sc = new Scanner(System.in);

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		System.out.println("Digite o codigo de 1 a 4 :");
		int codigo = sc.nextInt();

		while (codigo != 4) {

			System.out.println("Digite a opcao desejada: 1-Alcool,2-Gasolina,3-Diesel");
			codigo = sc.nextInt();

			switch (codigo) {
			case 1:
				alcool = alcool + 1;
				break;
			case 2:
				gasolina = gasolina + 1;
				break;
			case 3:
				diesel = diesel + 1;
				break;
			default:
				System.out.println("escolha uma opcao valida");
				break;

			}

			System.out.println("MUITO OBRIGADO");
			System.out.println("Alcool: " + alcool);
			System.out.println("Gasolina: " + gasolina);
			System.out.println("Diesel: " + diesel);

		}

		sc.close();
	}
}
