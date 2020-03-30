package Exercicios;

import java.util.Scanner;
import java.util.Locale;

public class FormasGeometrica {
	
	public static void main (String[]args){
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Double A,B,C, triangulo, circulo, trapezio, quadrado, retangulo;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		//TrianguloRetangulo area
		
		triangulo = A*C/2;
		circulo = Math.PI * C*C; 
		trapezio =  (A+B)/2 * C;
		quadrado = (B*B);
		retangulo = (A*B);
		
		
		System.out.printf("Área do retângulo:%.3f%n", triangulo);
		System.out.printf("Área do retângulo:%.3f%n", circulo);
		System.out.printf("Área do retângulo:%.3f%n", trapezio);
		System.out.printf("Área do retângulo:%.3f%n", quadrado);
		System.out.printf("Área do retângulo:%.3f%n", retangulo);
		
		
		sc.close();
	}

}
