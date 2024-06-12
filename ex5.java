package ph;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);

	        int soma = 0;
	        
	        
	        for (int i = 0; i < 20; i++) {
	            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
	            int idade = ler.nextInt();
	            soma += idade;
	        }

	        
	        ler.close();

	       
	        System.out.println("A soma das idades das 20 pessoas é: " + soma);
	    }
	

	}


