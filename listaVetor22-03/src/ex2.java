import java.util.Random;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		float[] preco = new float[10];
		String[] artigo = new String[10];
		int[] codigo = new int[10];
		float maior = 0;
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		for (int contador = 0; contador < 10; contador++) {
			System.out.println("Digite o nome do artigo:");
			artigo[contador] = sc.next();
			codigo[contador] = random.nextInt(20);
			preco[contador] = random.nextFloat() * 200;
			System.out.println(preco[contador]);
			System.out.println(codigo[contador]);
		}

		for (int contador = 0; contador < preco.length; contador++) {
			for (int contador2 = contador + 1; contador2 < preco.length; contador2++) {
				if (preco[contador] < preco[contador2]) {
					maior = preco[contador2];
					preco[contador2] = preco[contador];
					preco[contador] = maior;

					maior = codigo[contador2];
					codigo[contador2] = codigo[contador];
					codigo[contador] = (int) maior;
				}
			}
		}
		for (int contador = 0; contador < 3; contador++) {
			System.out.println("Preço: " + preco[contador] + " - código: " + codigo[contador]);
		}
	}

}
