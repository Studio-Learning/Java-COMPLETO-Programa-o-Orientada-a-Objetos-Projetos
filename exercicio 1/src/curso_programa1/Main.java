package curso_programa1;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Olá, mundo!");
		System.out.println("Boa noite");
		int y = 32;
		Locale.setDefault(Locale.US); //para usar . e nao , nos numeros
		double x = 10.35784;
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		System.out.println(x);
		System.out.println("resultado = "+x+ " metros"); //println
		System.out.printf("resultado = %.2f metros%n", x);;
		System.out.println(y);
	}

}
