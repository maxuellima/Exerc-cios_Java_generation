package Pacote1;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float nota1, nota2, nota3, media;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nEntre com a primeira nota: ");
		nota1 = leia.nextFloat();
		System.out.println("\nEntre com a segunda nota: ");
		nota2 = leia.nextFloat();
		System.out.println("\nEntre com a terceira nota: ");
		nota3 = leia.nextFloat();
		
		media = (nota1+nota2+nota3) / 3; //estamos calculando a m�dia
		System.out.println("\nA m�dia do aluno �: " + media);
		//printf() arredonda o numero
		
		if(media >=7 && media <=10)
		{
			System.out.println("nAlune aprovado!!!");
		}
		else if(media>=5 && media <=7)
		{
			System.out.println("alune de exame!!!");
		}
		else
		{
			System.out.println("reprovade!!!");
		}
;
	}

}
