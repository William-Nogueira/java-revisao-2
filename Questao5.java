
public class Questao5 {
	
	public static void main(String[] args) {
		
		int[] vetor = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }; 

		for (int i = 0; i < vetor.length; i++) {
			
			System.out.print("Os divisores do numero " + (vetor[i]) + " sao: ");
			
			for (int j = 1; j <= vetor[i]; j++) {
				if (vetor[i] % j == 0) {
					System.out.print(j + " ");
				}
			}
			
			System.out.println(" ");
		}
	}
}
