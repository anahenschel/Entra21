package estacoes;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class estacoes {
	

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		estacao e = new estacao();
		
		System.out.println("Digite um número de 1 a 4: ");
		int num= input.nextInt();
		
		if(num<1 || num>4) {
			throw new IllegalArgumentException("Número inválido, insera de 1 a 4");
		}
	
		if(num==1) {
			e.verao();
			
		}
		else if(num==2) {
			e.inverno();
		}else if(num==3) {
			e.outono();
		}else {
			e.primavera();
		}
		
	}

}
