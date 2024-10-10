package easy;

import javax.swing.*;

public class ExecucaoExercicios {
    public static void main(String[] args) {

        Exercicio2_easy objExercicio2_easy = new Exercicio2_easy();
        System.out.println(objExercicio2_easy.exibirPalavra("O tempo de estudo nunca é um tempo perdido! "));

        Exercicio3_easy objExercicio3_easy = new Exercicio3_easy();
        String primeiroValor = JOptionPane.showInputDialog("Digite o primeiro valor: ");
        String segundoValor = JOptionPane.showInputDialog("Digite o segundo valor: ");
        System.out.println(objExercicio3_easy.trocaValoresDigitados(primeiroValor, segundoValor));
    }
}
