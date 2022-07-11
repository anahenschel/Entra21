import java.text.DecimalFormat;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("Digite um número: ");
		int num = input.nextInt();
		System.out.println("Quer converter Temperatura(1), Peso(2), Comprimento(3) ou Volume(4) ");
		int escolha = input.nextInt();
		if (escolha<1 || escolha> 4) {
			System.out.println("Número não identificado");
		}
		switch (escolha) {
		case 1: {

			System.out.println(
					"Escolha as opções:Celsius para Fahrenheit(1), Fahrenheit para Celsius(2), Celsius para Kelvin(3),Fahrenheit para Kelvin(4),Kelvin para Fahrenheit (5) ou Kelvin para Celsius(6) ");
			int escTe = input.nextInt();
			if(escTe<1 || escTe>6) {
				System.out.println("Número não identificado!");
			}
			else if (escTe == 1) {
				System.out.println("De Celsius para Fahrenheit:  " + df.format((num * 1.80) + 32));
			} else if (escTe == 2) {
				System.out.println("De Fahrenheit para Celsius: " + df.format((num - 32) / 1.80));
			} else if (escTe == 3) {
				System.out.println("De Celsius para Kelvin: " + df.format((num * 1.00) + 273.15));
			} else if (escTe == 4) {
				System.out.println("De Fahrenheit para Kelvin: " + df.format((num - 32) / 1.80 + 273.15));
			} else if (escTe == 5) {
				System.out.println("De Kelvin para Fahrenheit: " + (df.format((num - 273.15) * 1.80 + 32)));
			} else {
				System.out.println("De Kelvin para Celsius: " + df.format(num - 273.15));
			}

			break;

		}
		case 2: {
			System.out.println(
					"Escolha as opções: Quilos para Libras(1), Libras para Quilos(2), Quilos para Onças(3), Onças para Libras(4), Onças para Quilos(5) ou Libra para Onças(6) ");
			int escolhaQ = input.nextInt();
			if(escolhaQ<1 || escolhaQ>6) {
				System.out.println("Número não identificado!");
			}

			else if (escolhaQ == 1) {
				System.out.println("De Quilos para Libras: " + df.format(num * 2.2046));
			} else if (escolhaQ == 2) {
				System.out.println("De Libras para Quilos: " + df.format(num / 2.2046));
			} else if (escolhaQ == 3) {
				System.out.println("De Quilos para Onças: " + df.format(num * 35.274));
			} else if (escolhaQ == 4) {
				System.out.println("De Onças para Libras:  " + df.format(num * 0.062500));
			} else if (escolhaQ == 5) {
				System.out.println("De Onças para Quilos: " + df.format(num / 35.274));
			} else {
				System.out.println("De Libra para Onças: " + df.format(num * 16.000));
				break;
			}
		}
		case 3: {
			System.out.println(
					"Escolhas as opções: Metros para pés(1), Metros para Polegadas(2), Pés para Metros(3), Pés para polegadas(4), Polegadas para Metros(5) ou Polegas para pés(6) ");
			int escolhaM = input.nextInt();
			
			if(escolhaM<1 || escolhaM>6) {
				System.out.println("Número não identificado!");
			}
			
			else if (escolhaM == 1) {
				System.out.println("De Metros para pés:  " + df.format(num * 3.2808));
			} else if(escolhaM==2) {
				System.out.println("De Metros para Polegadas: "+ df.format(num* 39.370));
			}else if(escolhaM==3) {
				System.out.println("De Pés para Metros: "+ df.format(num/3.2808));
			}else if(escolhaM==4) {
				System.out.println("De Pés para polegadas: "+ df.format(num* 12.000));
			}else if(escolhaM==5) {
				System.out.println("De Polegadas para Metros: "+ df.format(num/39.370));
			}else {
				System.out.println("De Polegas para pés: "+ df.format(num* 0.083333));
			}
			break;
		}case 4: {
			System.out.println("Escolha as opções: Litros para Galão(1),Litros para Onças Líquidas(2), Galão para Litros(3), Galão para Onças Líquidas(4), Onças Líquidas para Litro(5), Onças Líquidas para Galão(6)");
			int escolhaV= input.nextInt();
			if(escolhaV<1 || escolhaV>6) {
				System.out.println("Número não identificado!");
			}
			else if(escolhaV==1) {
				System.out.println("De Litros para Galão: "+ df.format(num* 0.21997));
			} else if(escolhaV==2) {
				System.out.println("De Litros para Onças Líquidas: "+ df.format(num* 33.814));
			}else if(escolhaV==3) {
				System.out.println("De Galão para Litros:  "+ df.format(num/0.21997));
			}else if(escolhaV==4) {
				System.out.println("De Galão para Onças Líquidas: "+ df.format(num* 128.00));
			}else if(escolhaV==5) {
				System.out.println("De Onças Líquidas para Litro: "+ df.format(num/33.814));
			}else {
				System.out.println("De Onças Líquidas para Galão:  "+ df.format(num* 0.0078125));
			}
			}
			
		
		}
		input.close();
	}
		
	}


