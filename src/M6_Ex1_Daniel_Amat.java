import java.util.Scanner;

public class M6_Ex1_Daniel_Amat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		float num1 = 0f;
		float num2 = 0f;
		char operChar = ' ';
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Escriu una xifra: ");
		num1 = entrada.nextFloat();
		System.out.print("Escriu una altra xifra: ");
		num2 = entrada.nextFloat();
		System.out.print("Ara escriu un operador entre els següents (+,-,*,/,%) : ");
		//oper = entrada.nextln();
		operChar = entrada.next().charAt(0);
		
		if(operChar == '+') {
			System.out.print("El resultat de la suma del primer i segon nombre es: " + sumatorio(num1,num2));
		
		} else if (operChar == '-') {
			System.out.print("El resultat de la resta del primer i segon nombre es: " + restatorio(num1,num2));
			
		}else if (operChar == '*') {
			System.out.print("El resultat de la resta de la multiplicacio del primer i segon nombre es: " + multiplicatorio (num1,num2));
			
		}else if (operChar == '/') {
			System.out.print("El resultat de la divisio del primer i segon nombre es: " + divisorio(num1,num2));
		
		}else if (operChar == '%') {
			System.out.print("El modul del primer i segon nombre es: " + modulorio(num1,num2));
	} else {
		System.out.print("L´operador es incorrecte");
	}
	}
		public static int sumatorio(float num1, float num2) {
		
			int suma = (int)(num1 + num2);
			return suma;
		}
			
		public static int restatorio(float num1, float num2) {
			
			int resta = (int)(num1 - num2);
			return resta;
		}
		public static int multiplicatorio(float num1, float num2) {
			
			int multiplicacio = (int)(num1 * num2);
			return multiplicacio;
		}
		public static float divisorio(float num1, float num2) {
			
			float divisio = (float)(num1 / num2);
			return divisio;
		}
		public static int modulorio(float num1, float num2) {
			 
			int modul = (int)(num1 % num2);
			return modul;
		}
	}


