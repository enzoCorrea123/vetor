import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		int[] x = new int[15];
		Scanner sc = new Scanner(System.in);

		for (int contador = 0; contador < 15; contador++) {
			System.out.println("Digite um número:");
			x[contador] = sc.nextInt();

			if (x[contador] < 0) {
				x[contador] = 0;
			}
		}

		for (int contador = 0; contador < x.length; contador++) {
			System.out.println(x[contador]);
		}
	}

}
