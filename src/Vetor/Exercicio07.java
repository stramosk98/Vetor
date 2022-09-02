package Vetor;
import java.util.Scanner;
public class Exercicio07 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		float mult = 1;
		int sum = 0;
		int[] vet = new int[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Digite um número na posição " + (i + 1) + ": ");
			vet[i] = entrada.nextInt();
			sum += vet[i];
			mult *= vet[i];
		}
		
		System.out.println("\nMostrando o vetor:");
		for (int i = 0; i < 5; i++) {
			System.out.print(vet[i] + "|");
		}
		
		System.out.print("\nMostrando a soma: " + sum + "\nMostrando a multiplicação: " + mult);
		entrada.close();
	}
}
