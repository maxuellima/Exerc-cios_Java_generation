package Pacote1;

import java.util.Scanner;

public class RepeticaoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	int numero, conteNumero = 0; //Conte número é para saber quantas vezes vou digitar algo, é um contador
	Scanner ler = new Scanner(System.in);
	
	System.out.println("\nEntre com o primeiro número: ");
	numero = ler.nextInt();
	
	while(numero != -99) {
		conteNumero ++;
		System.out.println("\nEntre com outro número:");
		numero = ler.nextInt();		
	}
	System.out.println("\nA quantidade de número digitados foi de " + conteNumero);

	}

}
