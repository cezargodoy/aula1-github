package Exercicios;

import java.util.Scanner;

public class ExercicioIfParouImpar {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		System.out.println("Digite um Número");
		a = sc.nextInt();
		
		if(a %2 == 0){
			System.out.println("Número Par");
		}
		else
			{
			System.out.println("Número Ímpar");
		}
		sc.close();
	}
	

}
