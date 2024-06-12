package ph;

import java.util.Scanner;

public class ex7while {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

        int contador = 0;
        int totalPessoas = 20;

        
        while (totalPessoas > 0) {
            System.out.print("Digite a idade da pessoa: ");
            int idade = ler.nextInt();
            
            if (idade >= 18) {
                contador++;
            }
            
            totalPessoas--;
        }

        
        ler.close();

        
        System.out.println("O número de pessoas maiores de idade é: " + contador);
    }

	}


