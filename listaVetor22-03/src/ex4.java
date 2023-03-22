import java.util.Random;

public class ex4 {

	public static void main(String[] args) {
		int[] vetor1 = new int[10];
		int[] vetor2 = new int[10];
		Random random = new Random();

		for (int contador = 0; contador < vetor1.length; contador++) {
			vetor1[contador] = random.nextInt(15);
			vetor2[contador] = random.nextInt(15);
			System.out.println(vetor1[contador]);
			System.out.println(vetor2[contador]);
			if (vetor1[contador] == vetor2[contador]) {
				System.out.println("Número igual: " + vetor1[contador]);
			}
		}

	}

}
