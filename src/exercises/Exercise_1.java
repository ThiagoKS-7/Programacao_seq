package exercises;

import interfaces.Exercise;

import java.util.Scanner;

/**
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
                scanI = validateInput(scanI, "primeiro");
                break;
            case 2:
                scanII =validateInput(scanII, "segundo");
                break;
        }
        if(numbers < MAX_NUMBERS) {
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
        System.out.printf("\n[%s] Digite dois numeros e calcule o produto \n\n", NAME);
        handleInputs();
        System.out.printf("Produto: %d\n", prod=scanI*scanII);
    }
}
