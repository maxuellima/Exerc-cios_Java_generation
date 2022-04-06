package Pacote1;

import java.util.Scanner;

public class ExercicioLacoRepeticao_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade = 0, pMenor = 0, pMaior = 0;
		Scanner leia = new Scanner (System.in);
		
		
		while(idade != 99) {
			System.out.println("\nDigite a sua idade:");
			idade = leia.nextInt();
			
			if(idade < 21) {
				pMenor++;
			}
			else if(idade >50) {
				pMaior++;
			}
		}
		System.out.println("\nA quantidade de pessoas com a idade menor que 21 anos foi de " + pMenor);
		System.out.println("\nA quantidade de pessoas com idade maior que 50 anos foi de " + pMaior);

	}
	

}
