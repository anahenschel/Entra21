import java.text.DecimalFormat;
import java.util.Scanner;

public class notas {
	 public static void main(String[] args)  {
		Scanner input= new Scanner(System.in);
		System.out.println("Digite a primeira nota: ");
		double nota1= input.nextDouble();
		System.out.println("Digite a segunda nota: ");
		double nota2= input.nextDouble();
		System.out.println("Digite a terceira nota: ");
		double nota3= input.nextDouble();
			
		DecimalFormat dc= new DecimalFormat("0.00");
		
		double media= (nota1+nota2+nota3)/3;
		System.out.println("A média é: "+ dc.format(media));
		if(nota1 <0 || nota2<0|| nota3<0) {
			throw new IllegalArgumentException("A nota não pode ser negativa!");
		}
	
	}
}
