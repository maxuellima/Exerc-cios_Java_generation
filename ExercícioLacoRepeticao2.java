package Pacote1;

import java.util.Scanner;

public class Exerc�cioLacoRepeticao2 {

	public static void main(String[] args) {
		// Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
		
		int numero, contPar = 0, contImpar = 0, x;
		Scanner leitor = new Scanner (System.in) ;
		
		
		for(x = 1; x <= 2; x++)
		{
			System.out.println("\nEntre com o " + x + "� n�mero: ");
			numero = leitor.nextInt();
			
			if (numero%2== 0) {
				contPar++;
			}
			else
			{ contImpar++;
		}
			
		}
			System.out.println("\nVoc� digitou " + contPar + " n�meros pares!");
			System.out.println("\nVoc� digitou " + contImpar + " n�meros �mpares!");
			
	}
}
