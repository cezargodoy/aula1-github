package Exercicios;

import java.util.Scanner;

public class ExerciciosIfMultiplos {
	
	public static void main (String []args) {
		
		Scanner sc = new Scanner (System.in);
			
		int a,b;
		
		System.out.println("Digite um n�mero");
		a = sc.nextInt();
		System.out.println("Digite outro n�mero");
		b = sc.nextInt();
		
		if(a % b == 0 || b % a == 0){
			System.out.println("N�mero multiplo");
			}
		else {
			System.out.println("N�mero n�o multiplo");
				
		}
			
		sc.close();	
	}
		

}
