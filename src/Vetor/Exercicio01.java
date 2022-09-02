package Vetor;
import java.util.Scanner;
public class Exercicio01 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int[] vet = new int[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Digite um número na posição " + (i + 1) + ": ");
			vet[i] = entrada.nextInt();
		}
		System.out.println("\nMostrando o vetor:");
		for (int i = 0; i < 5; i++) {
			System.out.print(vet[i] + "|");
		}
		
		entrada.close();
	}
}
