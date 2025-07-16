package curso_programa5;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
	
		double raio = sc.nextDouble();
		double pi = 3.14159;
		double area = (pi*(Math.pow(raio, 2)));
		
		System.out.printf("Area = %.4f%n",area);
		
		sc.close();
	}

}
