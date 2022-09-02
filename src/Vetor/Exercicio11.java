package Vetor;
import java.util.Arrays;
import java.util.Scanner;
public class Exercicio11 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
	     System.out.print("Insira um texto aqui: ");
			String t = entrada.next();
		
				String vet[] = t.split(";");
			
			System.out.println(Arrays.toString(vet));
			
	        entrada.close();
	}
}