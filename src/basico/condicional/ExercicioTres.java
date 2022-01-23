package basico.condicional;

public class ExercicioTres {

	public static void main(String[] args) {

//		Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
//		Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
//		ordem crescente ou decrescente.
//		Exemplos:
//		
//		Entrada: 
//		6 24 
//		Saída:
//		Sao Multiplos
//		
//		Entrada: 
//		6 25
//		Saída:
//		Nao sao Multiplos
//		
//		Entrada: 
//		24 6
//		Saída:
//		Sao Multiplos

		int a = 6, b = 6, c = 24;
		int restoA = 24, restoB = 25, restoC = 6;

		String resultadoA = a % restoA == 0 || restoA % a == 0 ? "Sao Multiplo" : "Nao sao Multiplos";
		String resultadoB = b % restoB == 0 || restoB % b == 0 ? "Sao Multiplo" : "Nao sao Multiplos";
		String resultadoC = c % restoC == 0 || restoC % c == 0 ? "Sao Multiplo" : "Nao sao Multiplos";

	}

}
