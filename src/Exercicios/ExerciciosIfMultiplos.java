package Exercicios;

import java.util.Scanner;

public class ExerciciosIfMultiplos {
	
	public static void main (String []args) {
		
		Scanner sc = new Scanner (System.in);
			
		int a,b;
		
		System.out.println("Digite um número");
		a = sc.nextInt();
		System.out.println("Digite outro número");
		b = sc.nextInt();
		
		if(a % b == 0 || b % a == 0){
			System.out.println("Número multiplo");
			}
		else {
			System.out.println("Número não multiplo");
				
		}
			
		sc.close();	
	}
		

}
