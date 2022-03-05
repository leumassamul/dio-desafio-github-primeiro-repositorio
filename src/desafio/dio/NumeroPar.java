package desafio.dio;

import java.io.IOException;
import java.util.Scanner;

public class NumeroPar {
	
	 public static void main(String[] args) throws IOException {
		 
		 Scanner scan = new Scanner(System.in);
		 int numero;
		 
		 System.out.println("Informe um número");
		 numero = scan.nextInt();
		 
		 for(int i = 1; i < numero; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}		 
		 } 
		 if(numero % 2 == 0) {
			 System.out.println(numero);
		 }
		 
		 scan.close();
	    	

 	}

}
