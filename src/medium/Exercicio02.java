package medium;

import javax.swing.*;
import java.text.DecimalFormat;

public class Exercicio02 {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00");

        double valorInvertimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do investimento: "));
        double taxaJuros = 0.12;
        int tempoInvertimeto = 10;
        double valorTotal = 0;
        valorTotal = valorInvertimento;

        for (int i = 0; i < tempoInvertimeto; i++) {
            valorTotal = (valorTotal * taxaJuros) + valorTotal;

        }
        System.out.println("O valor inveretido foi de R$= " + df.format(valorInvertimento) +
                "\nO valor do juros foi de R$= " + df.format(valorTotal - valorInvertimento)+
                "\nO valor total foi de R$= " + df.format (valorTotal));
    }
}
