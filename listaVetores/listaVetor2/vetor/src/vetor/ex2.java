package vetor;

import java.util.Random;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		int[] vetor = new int[10];

		for (int contador = 0; contador < 10; contador++) {
			vetor[contador] = random.nextInt(20) + 1;
		}

		System.out.println("Digite um número:");
		int numero = sc.nextInt();

		for (int contador = 0; contador < 10; contador++) {
			if (numero == vetor[contador]) {
				System.out.println("Acertou ah mizeravi");
				System.out.println("Posição: " + contador);
				break;
			} else if (contador == vetor.length - 1) {
				System.out.println("Tu é burro");
			}

		}
		for (int contador = 0; contador < 10; contador++) {
			System.out.println(vetor[contador]);
		}

	}

}
