package estruturasControle;

import java.util.Scanner;

public class desafioDoWhile {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		
		int quantidadeDeNotas=0;
		double nota=0;
		double total=0;
		
		while(nota!=-1) {
			System.out.print("Informe a nota");
			nota=entrada.nextDouble();
			
			if(nota<=10 && nota>=0) {
				total+=nota;
				quantidadeDeNotas++;
			}else if(nota !=-1) {
				System.out.println("Nota invalida !!");
			}
		}
		
		//calcula a media
		
		double media =total /quantidadeDeNotas;
		System.out.println("Media="+media);
		
		entrada.close();
	}

}
