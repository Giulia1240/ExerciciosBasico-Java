package basico.repeticao;

import java.util.Scanner;

public class ExercicioQuatro {

//	Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
//	X, se for o caso.
//	Exemplo:
//	
//	Entrada: 
//	8 
//	
//	Saída:
//	1
//	3
//	5
//	7
	
public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Digite um valor para x:");
	
	int x = sc.nextInt();
	
	for(int i=1; i <= x && x <= 1000;i++){
		
		if(i%2 !=0) {
			System.out.println(i);
		}	
	}
	
	sc.close();
}
	
	
}
