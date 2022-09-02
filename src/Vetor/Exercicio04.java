package Vetor;
import java.util.Scanner;
public class Exercicio04 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int c = 0;
		String cons = "";
		String[] vet = new String[10];
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite o character " + (i + 1) + ": ");
			vet[i] = entrada.nextLine();			
			if(vet[i].equals("a") || vet[i].equals("e") || vet[i].equals("i") || vet[i].equals("o") || vet[i].equals("u")) {			
		}else {
			c++;
			cons += vet[i] + " ";
			
		}
	}
		System.out.println("\nQuantas consoantes foram digitadas: " + c + "\nQuais foram: " + cons);
		
		entrada.close();
	}
}
