package listaVetorAtualizada;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeroQuantidadeVetor, par = 0, impar = 0, maior = 0;

		System.out.println("Digite a quantidade de números:");
		numeroQuantidadeVetor = sc.nextInt();

		int[] numero = new int[numeroQuantidadeVetor];

		for (int contador = 0; contador < numeroQuantidadeVetor; contador++) {
			System.out.println("Digite um número:");
			numero[contador] = sc.nextInt();

			if (numero[contador] % 2 == 0) {
				par++;
			} else {
				impar++;
			}

		}

		int[] pares = new int[par];
		int[] impares = new int[impar];

		par = 0;
		impar = 0;

		for (int contador = 0; contador < numero.length; contador++) {
			if (numero[contador] % 2 == 0) {
				pares[par] = numero[contador];
				par++;

			} else {
				impares[impar] = numero[contador];
				impar++;
			}

		}

		for (int contador = 0; contador < pares.length; contador++) {
			for (int contador2 = contador+1; contador2 < pares.length; contador2++) {
				if (pares[contador] > pares[contador2]) {
					maior = pares[contador];
					pares[contador] = pares[contador2];
					pares[contador2] = maior;
				}
			}
		}
		
		for (int contador = 0; contador < impares.length; contador++) {
			for (int contador2 = contador+1; contador2 < impares.length; contador2++) {
				if (impares[contador] < impares[contador2]) {
					
					maior = impares[contador2];
					impares[contador2] = impares[contador];
					impares[contador] = maior;
				}
			}
		}

		for (int contador = 0; contador < pares.length; contador++) {
			System.out.println(pares[contador]);
		}

		for (int contador = 0; contador < impares.length; contador++) {
			System.out.println(impares[contador]);
		}
	}

}
