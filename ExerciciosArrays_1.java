package Pacote1;


public class ExerciciosArrays_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] A = {1,0,5, -2, -5, 7};
		int somaAs, x;
		somaAs = A[0] + A[1] + A[5];
		A[3] = 100;
		
		for(x= 0; x<6; x++)
		{
			System.out.println("\nArray A: " + A[x]);
		}
		System.out.println("\nResultado da soma igual a " + somaAs);			
				
	}
	

}
