package Exercicios;

import java.util.Scanner;

public class Circulo {

	public static void main(String[]args){

		Scanner sc = new Scanner (System.in);
		
		double area, raio ; 
		
		raio = sc.nextDouble();
		
		area = Math.PI * (raio*raio);
		
		System.out.printf("A �rea do circulo � %.4f%n", area);
				
	}
	
	
}
