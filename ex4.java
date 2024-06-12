package ph;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner ler  = new Scanner(System.in);

        int soma = 0;

        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int numero = ler.nextInt();
            soma += numero;
        }

       
        ler.close();

        
        System.out.println("A soma dos 10 números é: " + soma);
    }
}
