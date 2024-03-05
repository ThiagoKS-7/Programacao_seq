package exercises;

import interfaces.Exercise;

import java.util.Scanner;

/**
 * Construa um programa em Java que leia um número do tipo “inteiro” (via
 * teclado) e o guarde em uma variável X. Calcule e mostre: (1) o conteúdo de X, (2) o quadrado
 * de X, (3) o resto da divisão inteira de X por 3, (4) a metade de X, e (5) o resultado do produto
 * de X pela metade de X.
 * */
public class Exercise_4 implements Exercise {
    protected String NAME = "Exercise_4";
    private int X;
    Scanner r;
    @Override
    public void execute() {
        r = new Scanner(System.in);
        do {
            System.out.print("\n[%s] Digite um numero inteiro: ");
            X = r.nextInt();
            System.out.printf(
                    "Conteúdo de X: %d\n" +
                    "Quadrado de X: %.2f\n" +
                    "Resto da divisão inteira de X por 3: %d\n" +
                    "A metade de X: %d\n" +
                    "Produto de X pela metade de X: %d\n",
                    X, Math.pow(2, X), X % 3, X/2, X*(X/2));
        } while(X == 0);

    }
}
