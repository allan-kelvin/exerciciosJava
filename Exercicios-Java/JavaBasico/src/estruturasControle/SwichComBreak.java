package estruturasControle;

import java.util.Scanner;

public class SwichComBreak {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String conceito ="";
		System.out.println("Informe a nota:");
		int nota= entrada.nextInt();
		
		
		switch (nota) {
		case 10: case 9:
			conceito="A";			
			break;
		case 8: case 7:{
			conceito="B";
			break;
		}
		
		case 6: case 5: {
			conceito="C";
			break;
		}
		
		case 4: case 3: case 2: case 1:{
			conceito= "D";
			break;
		}

		default:
			System.out.println("Conceito N�o Informado");
			break;
		}
		System.out.println("Conceito �: " + conceito);
		entrada.close();
	}

}
