package Pacote1;

import java.util.Scanner;

public class exercicio_extra_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int num;
	double res;
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("\nEntre com o valor do número: ");
	num = leia.nextInt();
	
	if(num % 2 == 0)
	{
		res = Math.sqrt(num);
	}
	else
	{
		res = Math.pow(num,2);
	}
	System.out.println("\nResultado é igual a: " + res);

	}

}
