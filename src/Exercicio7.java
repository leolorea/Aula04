import java.util.Scanner;

public class Exercicio7 {
	public static void main (String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		String numeroEscolhido = "";
		
		System.out.println("Escolha um numero!");
		
		
		while (!numeroEscolhido.equals("1238")) {
			
			System.out.println("Voc� n�o acertou, escolha um novo numero!");
			numeroEscolhido = scanner.next();
			
			
		}System.out.println("Voc� acertou!");
			
		
	}

}
