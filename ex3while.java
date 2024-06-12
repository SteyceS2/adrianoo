package ph;

import java.util.Scanner;

public class ex3while {

	public static void main(String[] args) {
		
        Scanner ler = new Scanner(System.in);

       
        System.out.print("Digite o seu nome: ");
        String nome = ler.nextLine();

        
        ler.close();

        int contador = 0;
        
        while (contador < 10) {
            System.out.println(nome);
            contador++;
        }
    }

	}


