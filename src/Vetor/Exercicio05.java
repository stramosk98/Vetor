package Vetor;
import java.util.Scanner;
public class Exercicio05 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
	
		final int N = 20;
		int[] vet = new int[N];
		int[] impar = new int[N];
		int[] par = new int[N];
		
		for (int i = 0; i < N; i++) {
			System.out.print("Digite o valor " + (i + 1) + ": ");
			vet[i] = entrada.nextInt();
			if(vet[i] % 2 == 0) 
				par[i] = vet[i];
			
			else 
				impar[i] = vet[i];
			}
	
		System.out.println("\nMostrando os números:");
		for (int i = 0; i < N; i++) {
			System.out.print(vet[i] + "|");
		}
		
		System.out.println("\nMostrando os pares:");
		for (int i = 0; i < N; i++) {
			if(par[i] != 0) 
			System.out.print(par[i] + "|");
		}
		
		System.out.println("\nMostrando os ímpares:");
		for (int i = 0; i < N; i++) {
			if(impar[i] != 0) 
			System.out.print(impar[i] + "|");
		}
		
		entrada.close();
	}
}
