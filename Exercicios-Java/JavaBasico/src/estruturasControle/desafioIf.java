package estruturasControle;

import java.util.Scanner;

public class desafioIf {
	public static void main(String[] args) {
		//Promograma que mostra qual o dia da semana em numeral
		
		Scanner entrada= new Scanner(System.in);
		System.out.println("Digite um dia da Semana!");
		
		String diaDaSemana=entrada.next();
		
		if(diaDaSemana.equalsIgnoreCase("segunda")) {
			System.out.println("Segunda � dia 1");
		} else if(diaDaSemana.equalsIgnoreCase("ter�a")){
			System.out.println("Ter�a � dia 2");
		} else if(diaDaSemana.equalsIgnoreCase("quarta")) {
			System.out.println("Quarta � dia 3");
		}  else if(diaDaSemana.equalsIgnoreCase("quinta")) {
			System.out.println("Quinta � dia 4");
		}  else if(diaDaSemana.equalsIgnoreCase("sexta")) {
			System.out.println("sexta � dia 5");
		}  else if(diaDaSemana.equalsIgnoreCase("sabado")) {
			System.out.println("Sabado � dia 6");
		} else {
			System.out.println("Domingo � dia 7");
		}
	
		
		entrada.close();
	}

}
