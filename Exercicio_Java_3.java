package Pacote1;

import java.util.Scanner;

public class Exercicio_Java_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int idade;
	Scanner ler = new Scanner(System.in);

	System.out.println("\nDigite sua idade: ");
	idade = ler.nextInt();
	
	if(idade > 10 && idade <14) {
		System.out.println("\nA sua categoria é Infantil");
	}
	else if(idade > 15 && idade < 17) {
		System.out.println("\nA sua categoria é Juvenil");
	}
	else{
		System.out.println("\nA sua categoria é Adulta");
	}
	}

}
