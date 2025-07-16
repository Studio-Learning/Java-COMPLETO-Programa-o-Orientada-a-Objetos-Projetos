package curso_programa8;

//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o 
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int cod1, cod2, num1, num2;
		double valor1, valor2, tot, tot_valor1, tot_valor2;
		
		//produto 1
		cod1 = sc.nextInt();
		num1 = sc.nextInt();
		valor1 = sc.nextDouble();
		tot_valor1 = num1*valor1;
		
		//produto 2
		cod2 = sc.nextInt();
		num2 = sc.nextInt();
		valor2 = sc.nextDouble();
		tot_valor2 = num2*valor2;
		
		//total geral
		tot = tot_valor1+tot_valor2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", tot);
		
		sc.close();
	}

}
