package easy;

import javax.swing.*;

public class Exercicio5_easy {
    public static void main(String[] args) {

        int primeiroValor = Integer.parseInt(JOptionPane.showInputDialog("Digite o primerio valor: "));
        int segundoValor = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
        int terceiroValor = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor: "));

        int soma = primeiroValor + segundoValor + terceiroValor;
        int subtracao = segundoValor - primeiroValor;
        int multiplicacao = primeiroValor * segundoValor * terceiroValor;
        int media = (primeiroValor * segundoValor * terceiroValor) / 3; // ou int media = multiplicaçao / 3

        System.out.println("Resultado da soma= " + soma +
                "\nResultado da subtração= " + subtracao +
                "\nResultado da multiplicação= " + multiplicacao +
                "\nResultado da média: " + media);

    }
}
