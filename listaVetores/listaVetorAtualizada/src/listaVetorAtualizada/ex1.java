package listaVetorAtualizada;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] nota = new double[10];
		double media = 0.0, maior = 0;
		int acimaMedia = 0, contador, posicaoMaiorNota = 0;

		for (contador = 0; contador < 5; contador++) {
			System.out.println("Digite a nota de um aluno:");
			nota[contador] = sc.nextDouble();

			media += nota[contador];

			if (nota[contador] > maior) {
				maior = nota[contador];
				posicaoMaiorNota = contador;
			}
		}
		media = media / contador;
		for (contador = 0; contador < 10; contador++) {
			if(nota[contador]>=media) {
				acimaMedia++;
			}
		}
		System.out.println("A m�dia da turma �: " + media);
		System.out.println("Quantidade de alunos acima da m�dia: " + acimaMedia);
		System.out.println("A maior nota foi: " + maior);
		System.out.println("A posi��o do vetor que est� a maior nota �: " + posicaoMaiorNota);
	}

}
