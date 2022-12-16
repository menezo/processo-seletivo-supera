package application;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Double valor = sc.nextDouble();
		Double notas[] = {100.00, 50.00, 20.00, 10.00, 5.00, 2.00};
		Double moedas[] = {1.00, 0.50, 0.25, 0.10, 0.05, 0.01};
		
		System.out.println("NOTAS:");
		for (Double nota : notas) {
			int quantidade = (int) (valor / nota);
			valor -= quantidade * nota;
			System.out.println(quantidade + "\tnota(s)\t\tde\tR$" + String.format("%.2f", nota));
		}
		
		System.out.println("MOEDAS:");
		for (Double moeda : moedas) {
			int quantidade = (int) (valor / moeda);
			valor -= quantidade * moeda;
			valor = getDecimal(valor).doubleValue();
			System.out.println(quantidade + "\tmoeda(s)\tde\tR$" + String.format("%.2f", moeda));
		}
		sc.close();
	}
	
	public static BigDecimal getDecimal(Double num) { //Metodo para garantir a precisao das operacoes com numeros decimais
		BigDecimal totalValue = new BigDecimal(num);
		MathContext mathContext = new MathContext(2, RoundingMode.HALF_UP);
		return totalValue.round(mathContext);
	}

}
