package Vetor;
import java.util.Scanner;
public class Exercicio06 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int cont = 0;
		float sum = 0;
		float[] nota = new float[4];
		float[] media = new float[10];
		
		for (int j = 0; j < 10; j++) {
			for (int i = 0; i < 4; i++) {
				System.out.print("Digite a nota " + (i + 1) + " do aluno " + (j + 1) + ": ");
				nota[i] = entrada.nextFloat();
				sum += nota[i];
			}
		
			media[j] = (sum / 4);
			
			if(media[j] >= 7) {
				cont++;
			}
		}
		
		System.out.print("Número de alunos com média 7 ou mais: " + cont);
		
		entrada.close();
	}
}
