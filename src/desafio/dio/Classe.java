package desafio.dio;

import java.util.Scanner;

public class Classe {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double area;
		double raio;
		
		System.out.println("Informe o valor do raio");
		raio =scan.nextDouble();
		scan.close();		

		area = 3.14159 * (Math.pow(raio,2));

		System.out.printf("A=%.4f\n", area);

	}

}
