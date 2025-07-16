package curso_programa4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int soma = num1 + num2;
		
		System.out.println(soma);
		
		sc.close();
		
	}

}
