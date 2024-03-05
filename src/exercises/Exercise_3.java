package exercises;

import interfaces.Exercise;

import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * Construa um programa em Java para ler (via teclado) quatro números do tipo
 * inteiro, calcule e mostre o resultado da média aritmética entre eles. Usar “float” para o tipo
 * de dado da variável que irá armazenar o resultado da média aritmética e imprimir o resultado
 * com duas casas decimais depois da vírgula (%.2f).
 */
public class Exercise_3 implements Exercise {
    protected String NAME = "Exercise_3";
    protected int MAX_NUMBERS = 4;
    private Scanner r;
    private int numbers = 0;
    private int   scanI, scanII, scanIII, scanIV;
    private void handleInputs() {
        numbers += 1;
        switch(numbers) {
            case 1:
                scanI = validateInput(scanI,  "primeiro");
                break;
            case 2:
                scanII = validateInput(scanI, "segundo");
                break;
            case 3:
                scanIII = validateInput(scanIII, "terceiro");
                break;
            case 4:
                scanIV = validateInput(scanIV, "quarto");
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

    private float calcAvg(IntStream numbersStream) {
        OptionalDouble res = numbersStream.average();
        return res.isPresent() ? (float) res.getAsDouble() : 0F;
    }

    @Override
    public void execute() {
        r = new Scanner(System.in);
        System.out.printf("\n[%s] Digite quatro inteiros e calcule a média \n\n", NAME);
        handleInputs();
        System.out.printf("A média é: %.2f\n" ,calcAvg(IntStream.of(scanI,scanII,scanIII,scanIV)));
    }
}
