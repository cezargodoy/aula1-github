import java.util.Locale;

public class Main {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		int y = 52;
		double c = 56.66;
		double r; 
		String nome = "maria";
		int idade = 31;
		double altura = 12.66;
		double salario = 2444.38;
				
		r = y + c;
		System.out.println("a variavel é: " + y * c + " " + "Numeros");
		System.out.println("a variavel é:"+ c);
		System.out.println(r);
		System.out.printf("%.2f%n", c );
		System.out.printf("Resultado = %.2f metros%n", r);
		System.out.printf("%n Nome:%s %n Idade:%d %n Altura:%.2f %n salario:%.2f %n ", nome, idade, altura, salario);
		Locale.setDefault(Locale.US);
		
		
		
		
	}

}
