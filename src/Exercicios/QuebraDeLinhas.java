package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class QuebraDeLinhas {
	
	public static void main (String[]args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in); 
		
		int x;
		String a, b, c;
		
		x = sc.nextInt();
		sc.nextLine();  // Esse nextLine adicional serve para consumir a linha do int
		a = sc.nextLine();
		b = sc.nextLine();
		c = sc.nextLine();
		
		System.out.println(x);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
	}

}
