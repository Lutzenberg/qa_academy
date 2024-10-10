package medium;

import javax.swing.*;

public class Exercicio05_vetor {
    public static void main(String[] args) {

        int i = 0;
        int numeroDigitado = 0;
        int menorNumero = 0;
        int[] vetorNumero = new int[5];

        while (i <= 4) {
            vetorNumero[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um numeros inteiros"));
            System.out.println("Numero digitado= " + vetorNumero[i]);
            i++;
        }
        menorNumero = vetorNumero[0];

        for (i = 1; i < vetorNumero.length; i++) {
            if (vetorNumero[i] < menorNumero) {
                menorNumero = vetorNumero[i];
            }
        }
        System.out.println("O menor numero digitado é: " + menorNumero);
    }
}
