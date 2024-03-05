package exercises;

import interfaces.Exercise;

import java.util.Scanner;

/**
* Construa um programa em Java que leia (via teclado)
* três números do tipo inteiro,
* calcule e mostre o resultado da soma deles.
* */
public class Exercise_2 implements Exercise {
    protected String NAME = "Exercise_2 ";
    protected final int MAX_NUMBERS = 3;
    private Scanner r;
    private int numbers = 0;

    private int  scanI, scanII, scanIII;
    private void handleInputs() {
        numbers += 1;
        switch(numbers) {
            case 1:
                scanI = validateInput(scanI, "primeiro");
                break;
            case 2:
                scanII = validateInput(scanI, "segundo");
                break;
            case 3:
                scanIII = validateInput(scanIII, "terceiro");
                break;
        }
        if(numbers <  MAX_NUMBERS) {
            handleInputs();
        }

    }
    private int validateInput(int num, String message) {
        do {
            System.out.print("Digite o valor do " +message + " número: ");
            return r.hasNextInt() ? r.nextInt() : 0;
        } while (num == 0);
    }
    @Override
    public void execute() {
        r = new Scanner(System.in);
        System.out.printf("\n[%s] Digite tres numeros e calcule a soma \n\n", NAME);
        handleInputs();
        System.out.printf("A soma  é: %d\n" ,scanI+scanII+scanIII);
    }
}
