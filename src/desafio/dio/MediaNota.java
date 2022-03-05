package desafio.dio;

import java.util.Scanner;

public class MediaNota {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A, B, media;
        
        System.out.println("informe o valor :");

        A = sc.nextDouble();
        
        B = sc.nextDouble();
        
        sc.close();
        
        media = (  A   * 3.5 +  B   * 7.5)/11; 
        
        System.out.printf("MEDIA = %.5f\n", media);
       
    }

}
