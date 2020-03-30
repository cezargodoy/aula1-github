package Exercicios;

import java.util.Scanner;

public class ExerciciosIfJogo {
	
	public static void main (String []args) {
		
		Scanner sc = new Scanner(System.in);
			
		int duracao;
		
		System.out.println("Digite um número");	
		int horaInicial = sc.nextInt();
		System.out.println("Digite outro número");	
		int horaFinal = sc.nextInt();
			
		if(horaInicial < horaFinal ) {
			duracao = horaFinal - horaInicial;

		}
		else {
				duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O jogo durou" + duracao + "Hora(s)");
		sc.close();
	}

}
