package ph;

import java.util.Scanner;

public class ex5while {

	public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);

	        int soma = 0;
	        int contador = 0;

	       
	        while (contador < 20) {
	            System.out.print("Digite a idade da pessoa " + (contador + 1) + ": ");
	            int idade = ler.nextInt();
	            soma += idade;
	            contador++;
	        }

	       
	        ler.close();

	       
	        System.out.println("A soma das idades das 20 pessoas é: " + soma);
	    }
	
	}


