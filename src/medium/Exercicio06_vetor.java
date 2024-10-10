package medium;

import javax.swing.*;

public class Exercicio06_vetor {
    public static void main(String[] args) {

        int numeroFatorialDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
        int[] vetorFatorial = new int[numeroFatorialDigitado];
        int fatorial = numeroFatorialDigitado;

        for (int i = numeroFatorialDigitado; i >= 1; i--) {
            vetorFatorial[i - 1] = i;
        }
        for (int i = numeroFatorialDigitado - 1; i >= 1; i--) {
            fatorial = fatorial * vetorFatorial[i - 1];

        }
        System.out.println("O fatorial de: " + numeroFatorialDigitado + " é igual: " + fatorial);
    }
}

