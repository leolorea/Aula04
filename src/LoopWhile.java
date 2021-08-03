import java.util.Scanner;

public class LoopWhile {
	int idade;
	
	

	

	public static void main(String[] args) {
		/*Imagine que uma ONG precise saber a média de idades dos alunos de uma escola.
		 * Sabendo de antemão quantos alunos existem e sem a necessidade de armazenar permanentemente a idade de cada um desses alunos, qual é a melhor forma de calcular essa média?*/
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o numero de alunos");
		int numeroAlunos = scanner.nextInt();
	
        
        double media = 0;
        int i = 0;
       
        
     while (  i < numeroAlunos ) {
    	 System.out.println("Digite a idade dos alunos");
    	 int idade = scanner.nextInt();
    	 media = media + idade;
    	 
    	 
    	 
    	 i++;
    	 
    	 
    	 
     }
     System.out.println("A média das idades dos alunos é : " + (media/numeroAlunos));
     
	}

}
