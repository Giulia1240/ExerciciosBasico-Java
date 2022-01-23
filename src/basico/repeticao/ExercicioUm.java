package basico.repeticao;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {

//		Exercício 01
//
//		Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
//		incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
//		impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
//		Exemplo:
//		
//		Entrada: 
//		2200
//		1020
//		2022
//		2002
//		
//		Saída:
//		Senha Invalida
//		Senha Invalida
//		Senha Invalida
//		Acesso Permitido

		Scanner sc = new Scanner(System.in);

		int senhaCorreta = 2002, senhaUsuario;

		System.out.println("Digite a senha:");
		senhaUsuario = sc.nextInt();

		while (senhaUsuario != senhaCorreta) {

			System.out.println("SenhaIncorreta");
		}

		System.out.println("Senha Correta");

		sc.close();

	}

}
