package medium;

import javax.swing.*;
import java.util.Random;

public class Exercicio09_vetor {
    public static void main(String[] args) {

        String[] nomesAlunos = new String[6];
        int[] numerosAlunos = new int[6];
        Random random = new Random();

        for (int i = 0; i < nomesAlunos.length; i++) {
            nomesAlunos[i] = JOptionPane.showInputDialog("Digite um nome para o " + (i + 1) + " aluno: ");
            numerosAlunos[i] = random.nextInt(100);
        }
        if (nomesAlunos[0] == null || nomesAlunos[0].isEmpty()) {
            System.out.println("Não ha alunos para serem mostrados.");
        } else {
            for (int i = 0; i < nomesAlunos.length; i++) {
                System.out.println("Nome do aluno: " + nomesAlunos[i] + "  Numero: " + numerosAlunos[i]);

            }
        }
    }
}
