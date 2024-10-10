package medium;

import javax.swing.*;

public class Exercicio06 {
    public static void main(String[] args) {

        int numeroFatorialDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));

        for (int i = numeroFatorialDigitado; i > 1; i--) {
            numeroFatorialDigitado = numeroFatorialDigitado * (i - 1);
        }
        if (numeroFatorialDigitado == 0) {
            System.out.println("O numero digitado e: 1");

        } else {
            System.out.println("O fatorial do numero digitado é: " + numeroFatorialDigitado);
        }
    }
}
