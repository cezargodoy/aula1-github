package Exercicios;

import java.util.Scanner;

public class ExercicioIF1 {
	
	public static void main (String []args){
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		System.out.println("Digite um número:");
		a = sc.nextInt();
		
		if (a >=0)		
		
		System.out.println("Número Positivo");
		else {
			System.out.println("Número Negativo");
		}
		
		sc.close();
	}
	

}
