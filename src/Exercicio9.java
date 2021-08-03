import java.util.Scanner;

public class Exercicio9 {
	public static void main (String[] args) {
		int i = 1;
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int numerador = 1;
		int denominador = 1;
		int totalDenominador =0;
		int totalNominador =0;
		
		
		while (i < n) {
		 
	     
		numerador = i * (n);
		denominador = n * (n - i); 
		
		totalDenominador = totalDenominador + denominador;
		System.out.println((numerador/denominador));
		
		i++;
		
		
		}
		
	}

}
