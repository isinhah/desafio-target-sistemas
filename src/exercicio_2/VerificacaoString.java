package exercicio_2;

import java.util.Scanner;

/*
Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre.
IMPORTANTE: Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
*/

public class VerificacaoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = sc.nextLine();

        int resultado = verificarLetraA(frase);

        System.out.println("Frase: " + frase);
        System.out.println("Quantidade de letras A ou a: " + resultado);

        sc.close();
    }

    public static int verificarLetraA(String frase) {
        int contagem = 0;

        frase = frase.toLowerCase();

        for (char letra : frase.toCharArray()) {
            if (letra == 'a') {
                contagem++;
            }
        }
        return contagem;
    }
}