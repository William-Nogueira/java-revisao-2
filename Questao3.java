import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {

		String[] nomeClientes = new String[5];
		int[] quantidadeDVD = new int[5];

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < nomeClientes.length; i++) {
			System.out.println("Qual o nome do cliente? ");
			nomeClientes[i] = scan.next();

			System.out.println("Qual a quantidade de DVDs locado? ");
			quantidadeDVD[i] = scan.nextInt();

		}

		for (int i = 0; i < nomeClientes.length; i++) {
			System.out.println("Cliente " + nomeClientes[i] + " locou " + quantidadeDVD[i] + " DVDs");
			if (quantidadeDVD[i] > 10) {
				System.out.println("O cliente " + nomeClientes[i] + " tem direito a " + (int) (quantidadeDVD[i] / 10)
						+ " locacoes gratis!");
			}
			System.out.println(" ");

		}
		
		scan.close();
	}

}
