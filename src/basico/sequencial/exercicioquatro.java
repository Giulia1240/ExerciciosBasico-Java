package basico.sequencial;

public class exercicioquatro {

	/*
	 * Fazer um programa que leia o número de um funcionário, seu número de horas
	 * trabalhadas, o valor que recebe por hora e calcula o salário desse
	 * funcionário. A seguir, mostre o número e o salário do funcionário, com duas
	 * casas decimais. Exemplos:
	 * 
	 * Entrada: 25 100 5.50 Saída: NUMBER = 25 SALARY = U$ 550.00
	 * 
	 * Entrada: 1 200 20.50 Saída: NUMBER = 1 SALARY = U$ 4100.00
	 * 
	 * Entrada: 6 145 15.55 Saída: NUMBER = 6 SALARY = U$ 2254.75
	 */

	public static void main(String[] args) {

		int numeroFuncionarioA = 25;
		int numeroFuncionarioB = 1;
		int numeroFuncionarioC = 6;

		@SuppressWarnings("deprecation")
		Integer totalHorasA = new Integer(100);
		@SuppressWarnings("deprecation")
		Integer totalHorasB = new Integer(200);
		@SuppressWarnings("deprecation")
		Integer totalHorasC = new Integer(145);

		float valorPorHoraA = (float) 5.50;
		float valorPorHoraB = (float) 20.50;
		float valorPorHoraC = (float) 15.55;

		float conversaoA = totalHorasA.floatValue();
		float conversaoB = totalHorasB.floatValue();
		float conversaoC = totalHorasC.floatValue();

		float ResultadoA = conversaoA * valorPorHoraA;
		float ResultadoB = conversaoB * valorPorHoraB;
		float ResultadoC = conversaoC * valorPorHoraC;

		System.out.println(ResultadoA);
		System.out.println(ResultadoB);
		System.out.println(ResultadoC);
	}

}
