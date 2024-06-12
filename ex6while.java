package ph;

import java.util.Scanner;

public class ex6while {

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

	        double media = (double) soma / contador;

	       
	        System.out.println("A média das idades das 20 pessoas é: " + media);
	    }
	
	}


