import java.util.Scanner;

public class ativiana {

	public static void maisVinte (int num) {
		
		for (int i=0; i<21; i++) {
			System.out.println(num);
			num += 1;
		}
		
		
		
	}
	
	
	
	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		System.out.println("Digite um número: ");
		int num = input.nextInt();
		
		maisVinte(num);
		
		
		
	}

}