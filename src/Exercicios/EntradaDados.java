package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDados {
	
	public static void main (String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		int a;
		double b;
		char c;
		x = sc.next();
		a = sc.nextInt();
		b = sc.nextDouble();
		c = sc.next().charAt(0);
		
		System.out.println("Digite uma String:");
		System.out.println("Voc� digitou String:" + x);
		System.out.println("Voc� digitou Int:" + a);
		System.out.printf("Voc� digitou Double: %.2f%n", b);
		System.out.println("Voc� Digitou Double:" + b);
		System.out.println("Voc� Digitou Char:" + c);

		
		
		sc.close();
		
	}
		
	
	

}
