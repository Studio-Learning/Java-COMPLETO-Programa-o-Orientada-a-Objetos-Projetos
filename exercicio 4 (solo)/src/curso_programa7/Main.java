package curso_programa7;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
	
		int num = sc.nextInt();
		int horas = sc.nextInt();
		double valor = sc.nextDouble();
		
		double salario = valor*horas;
		
		System.out.println("NUMBER = "+num);
		System.out.printf("SALARY = %.2f",salario);
		
		sc.close();
	}

}
