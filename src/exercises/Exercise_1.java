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
    private short num1;
    private short num2;
    private int prod;
    @Override
    public void execute() {
        r = new Scanner(System.in);
        System.out.print("Digite dois numeros: ");
        System.out.printf("Numeros escolhidos: %d, %d\nProduto: %d",(num1 = r.nextShort()), (num2=r.nextShort()), (prod=num1*num2));
    }
}
