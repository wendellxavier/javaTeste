package pratica;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int palpite;
        int valorCorreto = 300;

        System.out.println("Digite quantidade de espartanos lutaram: ");
        palpite = teclado.nextInt();

        while (palpite != valorCorreto) {
            if (palpite > valorCorreto){
                System.out.println("Um pouco menos");
            }
            else {
                System.out.println("Um pouco mais");
            }
           System.out.println("Digite outro palpite: ");
           palpite = teclado.nextInt();
 
        }

        System.out.println("Parabéns, você acertou");
        
    }

    
}