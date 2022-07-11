
public class Main {

	public static void main(String[] args) {

		
		
	
		
		
		Mercado unidadeDeBlumenau= new Mercado(800, 5.50, 1200, 6.90);
		Mercado unidadeDeJoinville= new Mercado(3000, 8.90, 1200,8.90);
		Mercado unidadeDeFlorianopolis= new Mercado(2300, 2.40, 7000, 6.30);
		
		
		if(unidadeDeBlumenau.ReceitaL()> unidadeDeFlorianopolis.ReceitaL() && unidadeDeBlumenau.ReceitaL()> unidadeDeJoinville.ReceitaL()) {
			System.out.println("Blumenau teve a maior receita em Laranjas");
		} else if (unidadeDeFlorianopolis.ReceitaL()> unidadeDeBlumenau.ReceitaL()&& unidadeDeFlorianopolis.ReceitaL()>unidadeDeJoinville.ReceitaL()) {
			System.out.println( "Florianopolis teve a maior receita em Laranjas");
		} else {
			System.out.println("Joinville teve a maior receita de Laranjas");
		}
		
		
		
		if(unidadeDeBlumenau.ReceitaM()> unidadeDeFlorianopolis.ReceitaM() && unidadeDeBlumenau.ReceitaM()> unidadeDeJoinville.ReceitaM()) {
			System.out.println("Blumenau teve a maior receita em Maças");
		} else if (unidadeDeFlorianopolis.ReceitaM()> unidadeDeBlumenau.ReceitaM()&& unidadeDeFlorianopolis.ReceitaM()>unidadeDeJoinville.ReceitaM()) {
			System.out.println( "Florianopolis teve a maior receita em Maças");
		} else {
			System.out.println("Joinville teve a maior receita de Maças");
		}
		

		if(unidadeDeBlumenau.ReceitaAno()> unidadeDeFlorianopolis.ReceitaAno() && unidadeDeBlumenau.ReceitaAno()> unidadeDeJoinville.ReceitaAno()) {
			System.out.println("Blumenau teve a maior receita do ano");
		} else if (unidadeDeFlorianopolis.ReceitaAno()> unidadeDeBlumenau.ReceitaAno()&& unidadeDeFlorianopolis.ReceitaAno()>unidadeDeJoinville.ReceitaAno()) {
			System.out.println( "Florianopolis teve a maior receita do ano");
		} else {
			System.out.println("Joinville teve a maior receita do ano");
		}
		
		
		if(unidadeDeBlumenau.ReceitaAno()> unidadeDeFlorianopolis.ReceitaAno()&& unidadeDeBlumenau.ReceitaAno()<unidadeDeJoinville.ReceitaAno()) {
			System.out.println("Blumenau esteve no meio nos termos de receita");
		} else if (unidadeDeFlorianopolis.ReceitaAno()>unidadeDeBlumenau.ReceitaAno()&& unidadeDeFlorianopolis.ReceitaAno()<unidadeDeJoinville.ReceitaAno()) {
			System.out.println("Floripa esteve no meio nos termos de receita");
		} else {
			System.out.println("Joinville esteve no meio nos termos de receita");
		}
	
			if((unidadeDeBlumenau.ReceitaL()+ unidadeDeFlorianopolis.ReceitaL()+ unidadeDeJoinville.ReceitaL())> (unidadeDeBlumenau.ReceitaM()+unidadeDeFlorianopolis.ReceitaM()+ unidadeDeJoinville.ReceitaM())) {
				System.out.println("A franquia teve a maior receita vendendo Laranjas");
			} else {
				System.out.println("A franquia teve a maior receita vendendo maça ");
			
		}
	}
	
	

}
