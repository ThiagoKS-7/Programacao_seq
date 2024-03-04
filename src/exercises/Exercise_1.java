package exercises;

import interfaces.Exercise;

import java.util.Scanner;

/*
* Construa programa em Java que leia (via teclado)
* dois números do tipo inteiro,
* calcule o produto entre eles e mostre o resultado.
* */
public class Exercise_1 implements Exercise {
    private Scanner r;
    private int numbers,scanI, scanII,prod;
    private int MAX_NUMBERS = 2;
    private String NAME = "Exercise_1";

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
        }
        if(numbers < MAX_NUMBERS) {
            handleInputs();
        }
    }
    @Override
    public void execute() {
        r = new Scanner(System.in);
        System.out.printf("[%s] Digite dois numeros e calcule o produto \n\n", NAME);
        handleInputs();
        System.out.printf("Produto: %d\n", prod=scanI*scanII);
    }
}
