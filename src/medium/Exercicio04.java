package medium;

public class Exercicio04 {
    public static void main(String[] args) {

        int resutado = 0;
        int multiplicacao = 1;

        for (int i = 1; i <= 1000; i++) {
            if (multiplicacao > 1000) {
                multiplicacao = 1;
            }
            multiplicacao = i * multiplicacao;
            System.out.println("Valor da interacao= " + i + " | Total da multiplicacao= " + multiplicacao);

        }
        System.out.println("Fim da multiplicacao.");
    }
}
