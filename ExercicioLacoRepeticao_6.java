package Pacote1;

import java.util.Scanner;

public class ExercicioLacoRepeticao_6 {

	public static void main(String[] args) {
		/* Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
		final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
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
				System.out.println("Voc� digitou zero, o sistema ser� encerrado!");
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
		System.out.println("A m�dia dos n�meros divis�veis por 3 foi: " + media);
	}

}
