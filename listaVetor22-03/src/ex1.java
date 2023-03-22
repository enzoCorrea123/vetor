import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		double[] temperaturaMes = new double[12];
		String[] meses = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
				"Outubro", "Novembro", "Dezembro" };
		double maiorTemperatura = 0, menorTemperatura = 99;
		String mesMaior = "", mesMenor = "";
		Scanner sc = new Scanner(System.in);

		for (int contador = 0; contador < temperaturaMes.length; contador++) {
			System.out.println("Digite a temperatura média do " + (contador + 1) + "° mês:");
			temperaturaMes[contador] = sc.nextDouble();

			if (temperaturaMes[contador] > maiorTemperatura) {
				maiorTemperatura = temperaturaMes[contador];
				mesMaior = meses[contador];
			}

			if (temperaturaMes[contador] < menorTemperatura) {
				menorTemperatura = temperaturaMes[contador];
				mesMenor = meses[contador];
			}

		}

		System.out.println("A maior temperatura média foi no mês de " + mesMaior + " com " + maiorTemperatura
				+ "\nA menor temperatura média foi no mês de: " + mesMenor + " com " + menorTemperatura);

	}

}
