package Pacote1;

import java.util.Scanner;

public class Exercicio_Java_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int num1, num2, num3;
	Scanner leia = new Scanner(System.in);
	
	System.out.println("\nEntre com o primeiro n�mero inteiro: ");
	num1 = leia.nextInt();
	System.out.println("\nEntre com o segundo n�mero inteiro: ");
	num2 = leia.nextInt();
	System.out.println("\nEntre com o terceiro n�mero inteiro: ");
	num3 = leia.nextInt();
	
	if (num1 > num2 && num1 > num3) {
		System.out.println("\nO maior n�mero �: " + num1);
	}
	else if(num1 <num2 && num2 > num3) {
		System.out.println("\nO maior n�mero �: " + num2);
	}	
	else
	{
		System.out.println("\nO maior n�mero �: "+ num3);
	}
	
	

	}

}
