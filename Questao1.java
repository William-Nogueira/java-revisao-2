
public class Questao1 {

	public static void main(String[] args) {
		
		int[] vetorA = {1, 2, 3, 4, 5, 4, 3, 2, 1}; 
        boolean palindromo = true;
        
        for (int i = 0; i < vetorA.length / 2; i++) {
            if (vetorA[i] != vetorA[vetorA.length - i - 1]) {
                palindromo = false;
                break;
            } else {
            	palindromo = true;
            }
        }
        
        if (palindromo == true) {
            System.out.println("O vetor A e um palindromo");
            
        } else {
            System.out.println("O vetor A nao e um palindromo");
        }

	}

}
