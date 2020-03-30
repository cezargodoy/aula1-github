package Exercicios;

import java.util.Scanner;

public class If {
	
	public static void main (String [] args) {

		Scanner sc = new Scanner (System.in);
		
		double hora;
		
		System.out.println("Quanta horas?");
		hora = sc.nextDouble();		
		
		if (hora <= 12){
				System.out.println("bom dia");
		}
		else if (hora < 18){
				System.out.println("bom tarde");
		}
		else {
				System.out.println("bom noite");
		}		
		
		sc.close();
	}

}
