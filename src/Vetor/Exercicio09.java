package Vetor;
import java.util.Scanner;
public class Exercicio09 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
	     System.out.print("Insira um texto aqui: ");
			String t = entrada.next();
				char[] vet = new char[t.length()];	
				
			for(int i = 0; i < t.length(); i++) {
				vet[i] = t.charAt(i);
			}
			
			for(int i = 0; i < t.length(); i++) {
				System.out.println(vet[i]);;
			}
			
	        entrada.close();
	}
}