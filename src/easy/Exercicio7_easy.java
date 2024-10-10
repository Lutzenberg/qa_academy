package easy;

import javax.swing.*;
import java.text.DecimalFormat;

public class Exercicio7_easy {
    public static void main(String[] args) {

        double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario: "));
        double inss = 0;
        DecimalFormat df = new DecimalFormat("0.00");

        if (salario <= 1320.00) {
            inss = salario * 0.075;
        }
        if (salario >= 1320.01 && salario <= 2571.29) {
            inss = salario * 0.09;
        }
        if (salario >= 2571.30 && salario <= 3856.94) {
            inss = salario * 0.12;
        }
        if (salario >= 3856.95 && salario <= 7507.49) {
            inss = salario * 0.14;
        }
        if (salario > 7507.49) {
            inss = 1051.84;
        }

        System.out.println("O valor do inss a ser pago é de R$= " + df.format(inss) );
    }
}
