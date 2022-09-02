package Vetor;
import java.util.Scanner;
public class Exercicio14 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int[] n = new int[30];
		int[] a = new int[30];
		int j = 0; 
		float media = 0;
		
		for(int i = 0; i < 4; i++){
			System.out.print("Digite a idade do aluno " + (i + 1) + ": ");
		    n[i] = entrada.nextInt();
		
			System.out.print("Digite a altura do aluno " + (i + 1) + ": ");
		    a[i] = entrada.nextInt();	   
		    media += (a[i]);
		}
		
		media /= 4;
		
		for(int i = 0; i < 4; i++){
		    if(n[i] > 13 && a[i] < media)
			    j ++;
		}
		System.out.println("\nQuantidade de alunos com altura inferior a média da classe: " + j);
			
		 entrada.close();
	 
		 }
	}