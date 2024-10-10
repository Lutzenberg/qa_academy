package easy;

import javax.swing.*;

public class Exercicio9_easy {
    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero entre 1 a 10: "));
        if (numero <= 0 || numero >= 10) {
            System.out.println("Numero invalido! ");
        } else {
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + "x" + i + " = " + (numero * i));
            }
        }
    }
}
