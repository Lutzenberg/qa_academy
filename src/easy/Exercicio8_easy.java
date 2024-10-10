package easy;

import javax.swing.*;
import java.text.DecimalFormat;

public class Exercicio8_easy {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00");

        double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario: "));
        double ir = 0.0;
        double aliquota = 0.0;
        double deducaoImposto = 0.0;

        if (salario <= 2112.00) {
            ir = 0;
        }
        if (salario >= 2112.01 && salario <= 2826.65) {
            aliquota = 0.075;
            deducaoImposto = 158.40;
            ir = (salario * aliquota) - deducaoImposto;
            if (salario == 2112.01) {
                ir = 0.0;
            }
        }
        if (salario >= 2826.66 && salario <= 3751.05) {
            aliquota = 0.15;
            deducaoImposto = 370.40;
            ir = (salario * aliquota) - deducaoImposto;
        }
        if (salario >= 3751.06 && salario <= 4664.68) {
            aliquota = 0.225;
            deducaoImposto = 651.73;
            ir = (salario * aliquota) - deducaoImposto;
        }
        if (salario >= 4664.69) {
            aliquota = 0.275;
            deducaoImposto = 884.96;
            ir = (salario * aliquota) - deducaoImposto;
        }
        System.out.println("Salario bruto R$= " + df.format(salario));
        System.out.println("Imposto de renda sera R$= " + df.format(ir));
        System.out.println("Salario liquido R$= " + df.format(salario - ir));
    }
}
