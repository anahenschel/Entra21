package arrayEspc;

import java.util.ArrayList;
import java.util.Scanner;

public class ativi {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Digite um valor: ");
		int v= input.nextInt();
		System.out.println("Digite uma posi��o: ");
		int p= input.nextInt();
		
		ArrayList<Integer>array= new ArrayList<Integer>();
		
		for(int i=0; i<5; i++) {
			array.add(i+10);
		} 
		System.out.println(array);
	
		if(p<0 || p>4) {
			throw new IllegalArgumentException("Posi��o inv�lida");
		}
		array.set(p, v);
		System.out.println(array);
	}

}
