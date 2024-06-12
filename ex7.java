package ph;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

        int contador = 0;

        
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            int idade = ler.nextInt();
            if (idade >= 18) {
                contador++;
            }
        }

      
      ler.close();

        
        System.out.println("O número de pessoas maiores de idade é: " + contador);
    }


	}


