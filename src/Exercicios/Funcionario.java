package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Funcionario {
	
	public static void main (String[]args){
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo, horas; 
		double valorHora, salario;
		
		
		codigo = sc.nextInt();
		horas = sc.nextInt();
		valorHora = sc.nextDouble();
		
		salario = horas * valorHora;
		
		System.out.printf("O Funcion�rio c�digo: "+ codigo + "%n" );
		System.out.printf("Valor do s�lario: R$ %.2f%n ", salario );
		
		sc.close();
	}

}
