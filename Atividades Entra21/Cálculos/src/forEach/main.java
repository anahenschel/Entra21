package forEach;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		ArrayList<Integer> lista= new ArrayList<Integer>();
		
		lista.add(12);
		lista.add(89);
		lista.add(45);
		lista.add(23);
		lista.add(7);
	
		double soma=0;
		double media;
		for(Integer val: lista) {
			System.out.println(val);
			soma+=val;
		
		
		}
			media=soma/lista.size();
			System.out.println("Média: "+ media);
			
			
			for(Integer val2: lista) {
		if(val2>media) {
			System.out.println("maior que media: " + val2);
		}
		
			}
	}
}	
			
			
			
		
		


