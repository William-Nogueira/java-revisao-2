
public class Questao2 {

	public static void main(String[] args) {

		int[] vetorB = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		int[] vetorA = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] vetorC = new int[20];

		for (int i = 0; i < vetorA.length; i++) {
			vetorC[i] = vetorA[i];
		}

		for (int i = 10; i < vetorC.length; i++) {
			vetorC[i] = vetorB[i - 10];
		}
		
		System.out.print("VetorC = ");
		for (int i = 0; i < vetorC.length; i++) {
			System.out.print(vetorC[i] + " ");
		}

	}

}
