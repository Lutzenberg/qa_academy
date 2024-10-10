package easy;

import javax.swing.*;

public class Exercicio11_easy {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro: "));
        for (int i = 0; i <= 100; i++) {
            numero = numero + 2;
            System.out.println(numero);
        }
        System.out.println("Fim das interações! ");
    }
}
