
public class Questao4 {

	public static void main(String[] args) {
		
		int[] X = new int[10];
        int numero = 101;
        int contador = 0;
        int qtdDivisores;
        
        while (contador < 10) {
        	qtdDivisores = 0;
        	
            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                	qtdDivisores++;
                }
            }
            
            if (qtdDivisores == 2) {
                X[contador] = numero;
                contador++;
            }
            
            numero++;
        }
        
        System.out.println("10 numeros primos depois do 100:");
        for (int i = 0; i < 10; i++) {
            System.out.print(X[i] + " ");
            
        }
	}

}
