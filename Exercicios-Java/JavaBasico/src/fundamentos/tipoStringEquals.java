package fundamentos;

import java.util.Scanner;

public class tipoStringEquals {
	public static void main(String[] args) {
		
		System.out.println("2"=="2"); //Aqui diz que � igual por que s�o simples iguais
		
		// Mas o correto a se usar seria colocar o operador terminario EQUALS
		
		System.out.println("2".equals("2"));
		
		// No caso podemos usar o TRIM() Que retira os espa�os da String
		
		Scanner entrada = new Scanner(System.in);
		
		String b=entrada.nextLine();
		
		System.out.println("2".equals(b.trim()));
		entrada.close();
	}

}