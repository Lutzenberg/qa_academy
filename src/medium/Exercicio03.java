package medium;

public class Exercicio03 {
    public static void main(String[] args) {

        int soma = 0;
        int interacao = 1500;

        for (int i = 0; i <= 1000; i++) {
            soma = i + soma;
            System.out.println("Interacao: " + i + " Soma= " + soma);

            if (soma >= interacao) {
                break;
            }
        }
        System.out.println("Fim da soma. ");
    }
}
