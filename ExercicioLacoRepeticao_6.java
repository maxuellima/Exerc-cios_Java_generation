package Pacote1;

import java.util.Scanner;

public class ExercicioLacoRepeticao_6 {

	public static void main(String[] args) {
		/* Escrever um programa que receba vários números inteiros no teclado. E no
		final imprimir a média dos números múltiplos de 3. Para sair digitar
		0(zero).(DO...WHILE)*/
		
		int numero, soma= 0, x = 0 ;
		float media = 0;
		
		Scanner ler = new Scanner (System.in);
		
		do
		{
			System.out.println("\nInsira um numero: ");
			numero = ler.nextInt();
			if(numero == 0)
			{
				System.out.println("Você digitou zero, o sistema será encerrado!");
			}
			else {
				if(numero %3 == 0 ) 
			{
					soma += numero;
					x++;
			}			
			
			}
		}
		while(numero !=0);
		media = soma / x; 
		System.out.println("A média dos números divisíveis por 3 foi: " + media);
	}

}
