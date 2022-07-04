import java.text.DecimalFormat;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("Digite um n�mero: ");
		int num = input.nextInt();
		System.out.println("Quer converter Temperatura(1), Peso(2), Comprimento(3) ou Volume(4) ");
		int escolha = input.nextInt();
		if (escolha<1 || escolha> 4) {
			System.out.println("N�mero n�o identificado");
		}
		switch (escolha) {
		case 1: {

			System.out.println(
					"Escolha as op��es:Celsius para Fahrenheit(1), Fahrenheit para Celsius(2), Celsius para Kelvin(3),Fahrenheit para Kelvin(4),Kelvin para Fahrenheit (5) ou Kelvin para Celsius(6) ");
			int escTe = input.nextInt();
			if(escTe<1 || escTe>6) {
				System.out.println("N�mero n�o identificado!");
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
					"Escolha as op��es: Quilos para Libras(1), Libras para Quilos(2), Quilos para On�as(3), On�as para Libras(4), On�as para Quilos(5) ou Libra para On�as(6) ");
			int escolhaQ = input.nextInt();
			if(escolhaQ<1 || escolhaQ>6) {
				System.out.println("N�mero n�o identificado!");
			}

			else if (escolhaQ == 1) {
				System.out.println("De Quilos para Libras: " + df.format(num * 2.2046));
			} else if (escolhaQ == 2) {
				System.out.println("De Libras para Quilos: " + df.format(num / 2.2046));
			} else if (escolhaQ == 3) {
				System.out.println("De Quilos para On�as: " + df.format(num * 35.274));
			} else if (escolhaQ == 4) {
				System.out.println("De On�as para Libras:  " + df.format(num * 0.062500));
			} else if (escolhaQ == 5) {
				System.out.println("De On�as para Quilos: " + df.format(num / 35.274));
			} else {
				System.out.println("De Libra para On�as: " + df.format(num * 16.000));
				break;
			}
		}
		case 3: {
			System.out.println(
					"Escolhas as op��es: Metros para p�s(1), Metros para Polegadas(2), P�s para Metros(3), P�s para polegadas(4), Polegadas para Metros(5) ou Polegas para p�s(6) ");
			int escolhaM = input.nextInt();
			
			if(escolhaM<1 || escolhaM>6) {
				System.out.println("N�mero n�o identificado!");
			}
			
			else if (escolhaM == 1) {
				System.out.println("De Metros para p�s:  " + df.format(num * 3.2808));
			} else if(escolhaM==2) {
				System.out.println("De Metros para Polegadas: "+ df.format(num* 39.370));
			}else if(escolhaM==3) {
				System.out.println("De P�s para Metros: "+ df.format(num/3.2808));
			}else if(escolhaM==4) {
				System.out.println("De P�s para polegadas: "+ df.format(num* 12.000));
			}else if(escolhaM==5) {
				System.out.println("De Polegadas para Metros: "+ df.format(num/39.370));
			}else {
				System.out.println("De Polegas para p�s: "+ df.format(num* 0.083333));
			}
			break;
		}case 4: {
			System.out.println("Escolha as op��es: Litros para Gal�o(1),Litros para On�as L�quidas(2), Gal�o para Litros(3), Gal�o para On�as L�quidas(4), On�as L�quidas para Litro(5), On�as L�quidas para Gal�o(6)");
			int escolhaV= input.nextInt();
			if(escolhaV<1 || escolhaV>6) {
				System.out.println("N�mero n�o identificado!");
			}
			else if(escolhaV==1) {
				System.out.println("De Litros para Gal�o: "+ df.format(num* 0.21997));
			} else if(escolhaV==2) {
				System.out.println("De Litros para On�as L�quidas: "+ df.format(num* 33.814));
			}else if(escolhaV==3) {
				System.out.println("De Gal�o para Litros:  "+ df.format(num/0.21997));
			}else if(escolhaV==4) {
				System.out.println("De Gal�o para On�as L�quidas: "+ df.format(num* 128.00));
			}else if(escolhaV==5) {
				System.out.println("De On�as L�quidas para Litro: "+ df.format(num/33.814));
			}else {
				System.out.println("De On�as L�quidas para Gal�o:  "+ df.format(num* 0.0078125));
			}
			}
			
		
		}
		input.close();
	}
		
	}


