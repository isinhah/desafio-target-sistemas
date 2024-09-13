package exercicio_1;

import java.util.Scanner;

/*
1) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...),
escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;
*/

public class SequenciaFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("****** SEQUÊNCIA DE FIBONACCI ******");
        System.out.println("Insira um número: ");
        int numeroEscolhido = sc.nextInt();

        if (pertenceFibonacci(numeroEscolhido, 0, 1)) {
            System.out.println(numeroEscolhido + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numeroEscolhido + " não pertence à sequência de Fibonacci.");
        }

        sc.close();
    }

    public static boolean pertenceFibonacci(int numeroEscolhido, int a, int b) {
        if (numeroEscolhido == a || numeroEscolhido == b) {
            return true;
        }

        int proximoNumero = a + b;
        if (proximoNumero > numeroEscolhido) {
            return false;
        }

        return pertenceFibonacci(numeroEscolhido, b, proximoNumero);
    }
}