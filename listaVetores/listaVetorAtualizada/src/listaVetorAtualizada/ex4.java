package listaVetorAtualizada;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de alunos: ");
		int quantidadeAlunos = sc.nextInt();
		System.out.println("Digite quantas provas cada aluno fez?");
		int quatidadeProvas = sc.nextInt();

		int[] pesoNotas = new int[quatidadeProvas];
		double[] notas = new double[quatidadeProvas];
		double[] provas = new double[quatidadeProvas];

		double mediaPonderada = 0, mediaAritmetica = 0, totalNotas = 0;
		int pesoTotal = 0;

		for (int contador = 0; contador < pesoNotas.length; contador++) {
			System.out.println("Digite o peso da prova:");
			pesoNotas[contador] = sc.nextInt();
			pesoTotal += pesoNotas[contador];
		}

		for (int contador = 0; contador < quantidadeAlunos; contador++) {
			for (int contador2 = 0; contador2 < quatidadeProvas; contador2++) {
				System.out.println("Digite a nota " + contador2);
				notas[contador2] = sc.nextDouble();
				provas[contador2] += notas[contador2];
				notas[contador2] = notas[contador2] * pesoNotas[contador2];
				totalNotas += notas[contador2];

			}
			mediaPonderada = totalNotas / pesoTotal;
			totalNotas = 0;

			System.out.println("Média ponderada: " + mediaPonderada);
		}
		
		for (int contador = 0; contador < provas.length; contador++) {
			mediaAritmetica = provas[contador] / quantidadeAlunos;
			System.out.println("Média aritmética da prova " + contador + " = " + mediaAritmetica);
		}
	}

}
