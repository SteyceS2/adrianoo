package ph;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		 
        Scanner ler = new Scanner(System.in);

        
        System.out.print("Digite o seu nome: ");
        String nome = ler.nextLine();

        
        ler.close();

        
        for (int i = 0; i < 10; i++) {
            System.out.println(nome);
        }
    }


	}


