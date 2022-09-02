package Vetor;
import java.util.Scanner;

public class Exercicio12 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int tot = 0, maior = 0, menor = 0, cont = 0;
		int[] idade = new int [5];
		int[] alt = new int [5];
		float media = 0;
		
		for (int i = 0; i < 5; i++) {
			
				
				System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
				idade[i] = entrada.nextInt();
				
				System.out.print("Digite a altura da pessoa " + (i + 1) + ": ");
				alt[i] = entrada.nextInt();
	

			if(i == 0) {
				maior = alt[i];
				menor = alt[i];
			}else {
				
			if(alt[i] > maior) {
				maior = alt[i];
			} 
			if(alt[i] < menor) {
				menor = alt[i];
			}
		}
			cont++;
		}
		
		System.out.println("\nMostrando a idade na ordem inversa:");
				for (int x = 4; x >= 0; x--) {
					System.out.print(idade[x] + "|");
				}
				System.out.println("\nMostrando a altura na ordem inversa:");
				for (int x = 4; x >= 0; x--) {
					System.out.print(alt[x] + "|");
				}
		media = tot / ((float)(cont));
		System.out.println("\nSoma total: " + tot + "\nMédia: " + media + "\nMaior: " + maior + "\nMenor: " + menor);
		
		entrada.close();
	}
}