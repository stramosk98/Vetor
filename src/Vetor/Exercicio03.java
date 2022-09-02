package Vetor;
import java.util.Scanner;
public class Exercicio03 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		float sum = 0;
		float[] vet = new float[4];
		
		for (int i = 0; i < 4; i++) {
			System.out.print("Digite a nota " + (i + 1) + ": ");
			vet[i] = entrada.nextFloat();
			sum += vet[i];
		}
		
		System.out.println("\nMostrando as quatro notas:");
		for (int i = 0; i < 4; i++) {
			System.out.print(vet[i] + "|");
		}
		
		System.out.println("\nMédia: " + (sum / 4));
		
		entrada.close();
	}
}
