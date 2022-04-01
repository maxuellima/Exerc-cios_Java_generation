package Pacote1;

import java.util.Scanner;

public class Exercicio_extra_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int ano, mes, dias, idade;
	Scanner leia = new Scanner(System.in);
	System.out.println("\nQuantos anos você tem?");
	ano = leia.nextInt();
	System.out.println("\nQuantos meses você tem?");
	mes = leia.nextInt();
	System.out.println("\nQuantos dias você tem de vida?");
	dias = leia.nextInt();
	
	idade = (ano * 365) + (mes*30) + dias; 
	
	System.out.println("\nSua idade em dias é " + idade);

	}
	

}
