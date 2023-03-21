package vetor;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] vetor = new double[10];

		for (int contador = 0; contador < 10; contador++) {
			System.out.println("Número:");
			vetor[contador] = sc.nextDouble();
		}

		for (int contador = 9; contador >= 0; contador--) {
			System.out.println(vetor[contador]);
		}

	}

}
