package Pacote1;

import java.util.Scanner;

public class RepeticaoFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	float n1, n2, n3, media, somaMedia = 0, mg;
	int x;
	Scanner leia = new Scanner(System.in);
	
	for(x=1; x<= 3; x++)
	{
		System.out.println("\nEntre com a primeira nota: ");
		n1 = leia.nextFloat();
		System.out.println("\nEntre com a segunda nota: ");
		n2 = leia.nextFloat();
		System.out.println("\nEntre com a terceira nota: ");
		n3 = leia.nextFloat();
		
		media = (n1 + n2 + n3) / 3;
		System.out.printf("\nMedia aritmética: %2.2f e a primeira nota foi de:%2.2f ",media, n1);
		somaMedia =+ media;	
		
	}
	mg = somaMedia / 3;
	System.out.printf("\nA Média geral foi %2.2f " + mg);
	}

}
