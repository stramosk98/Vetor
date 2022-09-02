package Vetor;
import java.util.Scanner;
public class Exercicio13 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int[] n = new int[10];
		int[] m = new int[10];
		
		System.out.println("Números do 1° vetor: ");
		for(int i = 0; i < 10; i++){
			System.out.print("Digite o número " + (i + 1) + ": ");
			n[i] = entrada.nextInt();
		}
			System.out.println("\nNúmeros do 2° vetor: ");
			for(int j = 0; j < 10; j++){
			System.out.print("Digite o número " + (j + 1) + ": ");
			m[j] = entrada.nextInt();	
		}
		
			System.out.println("\nNúmeros do 3° vetor: ");
			for(int i = 0; i < 10; i++){	
			System.out.print(n[i] + "|" + m[i] + "|");
		}
			
		 entrada.close();
		 }
	}