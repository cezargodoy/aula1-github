package Exercicios;

import java.util.Locale;

public class Cadastro_Dell {
	
	public static void main(String[] args){
		
	String product_1 = "Computer";
	String product_2 = "Office Desktop";
	
	int age = 30;
	int code = 5290;
	
	char gender = 'F';
	
	double price_1 = 2100.0;
	double price_2 = 650.50;
	double measure = 53.234567;
	
	System.out.println ("Products:");
	System.out.printf ("Computer with price is: = %.2f%n", price_1);
	System.out.printf ("Office Desktop with price is: = %.2f%n", price_2);	
	System.out.println (" ");
	System.out.printf ("Record: %d Code: %d Gender: %s %n", age , code , gender);
	System.out.printf ("Rouded three decimal places: %.8f%n", measure);
	System.out.printf ("Rouded three decimal places: %.3f%n", measure);
	Locale.setDefault(Locale.US);
	System.out.printf ("US decimal point: %.3f%n", measure );

		
	}

}