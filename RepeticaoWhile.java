package Pacote1;

import java.util.Scanner;

public class RepeticaoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	int numero, conteNumero = 0; //Conte n�mero � para saber quantas vezes vou digitar algo, � um contador
	Scanner ler = new Scanner(System.in);
	
	System.out.println("\nEntre com o primeiro n�mero: ");
	numero = ler.nextInt();
	
	while(numero != -99) {
		conteNumero ++;
		System.out.println("\nEntre com outro n�mero:");
		numero = ler.nextInt();		
	}
	System.out.println("\nA quantidade de n�mero digitados foi de " + conteNumero);

	}

}
