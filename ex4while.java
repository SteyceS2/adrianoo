package ph;

import java.util.Scanner;

public class ex4while {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

        int soma = 0;
        int contador = 0;

       
        while (contador < 10) {
            System.out.print("Digite o número " + (contador + 1) + ": ");
            int numero = ler.nextInt();
            soma += numero;
            contador++;
        }

       
        ler.close();

       
        System.out.println("A soma dos 10 números é: " + soma);
    }


	}


