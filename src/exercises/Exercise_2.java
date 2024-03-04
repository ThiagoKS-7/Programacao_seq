package exercises;

import interfaces.Exercise;

import java.util.Scanner;

/*
* Construa um programa em Java que leia (via teclado)
* três números do tipo inteiro,
* calcule e mostre o resultado da soma deles.
* */
public class Exercise_2 implements Exercise {
    private Scanner r;
    private int sum, numbers = 0;
    private String NAME = "Exercise_2 ";
    private int MAX_NUMBERS = 3;

    private int  current, scanI, scanII, scanIII;
    private void handleInputs() {
        numbers += 1;
        switch(numbers) {
            case 1:
                do {

                    System.out.print("Digite o valor do primeiro número: ");
                    scanI = r.nextInt();
                } while (scanI == 0);
                break;
            case 2:
                do {
                    System.out.print("Digite o valor do segundo número: ");
                    scanII = r.nextInt();
                } while (scanII == 0);
                break;
            case 3:
                do {
                    System.out.print("Digite o valor do terceiro número: ");
                    scanIII = r.nextInt();
                } while (scanIII == 0);
                break;
        }

    }
    @Override
    public void execute() {
        r = new Scanner(System.in);
        System.out.printf("[%s] Digite tres numeros e calcule a soma \n\n", NAME);
        while(numbers <  MAX_NUMBERS) {
            handleInputs();
        }
        System.out.printf("A soma  é: %d\n" ,sum=scanI+scanII+scanIII);
    }
}
