package easy;

import javax.swing.*;

public class Exercicio10_easy {
    public static void main(String[] args) {

        double valorInvetido = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do investimento: "));
        double taxaJuros = 0.12;
        int tempoInvestido = 10;

        taxaJuros = taxaJuros * tempoInvestido;
        double valorTotal = (valorInvetido * taxaJuros) + valorInvetido;

        System.out.println("Valor de juros = " + valorInvetido +
                "\nValor Invertido = " + (taxaJuros * 100) + "%" +
                "\nValor Total = " + valorTotal);
    }
}
