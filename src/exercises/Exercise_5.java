package exercises;

import interfaces.Exercise;

import java.util.Scanner;

/***
 * Construa um programa em Java para ler (via teclado) o raio de um círculo,
 * calcular a área deste círculo e mostrar o resultado. (DICA: Cálculo da área = (PI * (raio * raio)).
 * Usar dados do tipo float para ter precisão nos resultados (%.2f). Usar pi = 3.141592).
 */
public class Exercise_5 implements Exercise {
    protected  String NAME = "Exercise_5";
    private float raio;
    private Scanner r;
    @Override
    public void execute() {
        r = new Scanner(System.in);
        do {
            System.out.printf("[%s] Digite um valor para o raio: ", NAME);
            raio = r.hasNextFloat() ? r.nextFloat() : 0F;
        } while (raio == 0);
        System.out.printf("Área do círculo é: %.2f\n", Math.PI * Math.pow(2,raio));
    }
}
