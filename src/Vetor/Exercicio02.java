package Vetor;
import java.util.Scanner;
public class Exercicio02 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		float[] vet = new float[10];
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite um número na posição " + (i + 1) + ": ");
			vet[i] = entrada.nextFloat();
		}
		
		System.out.println("\nMostrando o vetor na ordem inversa:");
		for (int i = 9; i >= 0; i--) {
			System.out.print(vet[i] + "|");
		}
		
		entrada.close();
	}
}
