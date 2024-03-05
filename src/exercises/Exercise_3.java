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
    private Scanner r;
    private int numbers = 0;
    private String NAME = "Exercise_3";
    private int MAX_NUMBERS = 4;
    private int   scanI, scanII, scanIII, scanIV;
    private float avg;

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
            case 4:
                do {
                    System.out.print("Digite o valor do quarto número: ");
                    scanIV = r.nextInt();
                } while (scanIV == 0);
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
        System.out.printf("A soma  é: %.2f\n" ,avg=calcAvg(IntStream.of(scanI,scanII,scanIII,scanIV)));
    }

    private float calcAvg(IntStream numbersStream) {
        OptionalDouble res = numbersStream.average();
        if(res.isEmpty()) {
            return 0F;
        }
        else {
            return (float) res.getAsDouble();
        }
    }
}
