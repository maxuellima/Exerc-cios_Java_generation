package Pacote1;

import java.util.Scanner;

public class ExercícioLacoRepeticao2 {

	public static void main(String[] args) {
		// Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		
		int numero, contPar = 0, contImpar = 0, x;
		Scanner leitor = new Scanner (System.in) ;
		
		
		for(x = 1; x <= 2; x++)
		{
			System.out.println("\nEntre com o " + x + "º número: ");
			numero = leitor.nextInt();
			
			if (numero%2== 0) {
				contPar++;
			}
			else
			{ contImpar++;
		}
			
		}
			System.out.println("\nVocê digitou " + contPar + " números pares!");
			System.out.println("\nVocê digitou " + contImpar + " números ímpares!");
			
	}
}
