package listaVetorAtualizada;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int[] vetor1 = new int[20];
		int[] vetor2 = new int[20];
		int[] vetor3 = new int[20];
		int[] vetor4 = new int[20];
		int[] vetor5 = new int[20];
		
		for(int contador = 0; contador<vetor1.length;contador++) {
			System.out.println("Digite um número pro primeiro vetor:");
			vetor1[contador] = sc.nextInt();
			System.out.println("Digite um número pro segundo vetor:");
			vetor2[contador] = sc.nextInt();
			
			vetor3[contador] = vetor1[contador] - vetor2[contador];
			vetor4[contador] = vetor1[contador] + vetor2[contador];
			vetor5[contador] = vetor1[contador] * vetor2[contador];
			
		}
		System.out.println("Vetor 3:");
		for(int contador = 0; contador<vetor1.length;contador++) {
			System.out.println(vetor3[contador]);
		}
		System.out.println("Vetor 4:");
		for(int contador = 0; contador<vetor1.length;contador++) {
			System.out.println(vetor4[contador]);
		}
		System.out.println("Vetor 5:");
		for(int contador = 0; contador<vetor1.length;contador++) {
			System.out.println(vetor5[contador]);
		}
	}

}
