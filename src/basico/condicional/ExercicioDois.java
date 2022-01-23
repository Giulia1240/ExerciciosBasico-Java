package basico.condicional;

public class ExercicioDois {
	
	public static void main(String[] args) {
		
//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
//Exemplos:
//
//Entrada: 
//12 
//Saída:
//PAR
//
//Entrada: 
//-27 
//Saída:
//IMPAR
//
//Entrada: 
//0
//Saída:
//PAR
		
		int a= 12,b= -27,c= 0;
		
		if ((a % 2) == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
		if ((b % 2) == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
		if ((c % 2) == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
		
	}	

}
