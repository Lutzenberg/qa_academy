package exercicio_instancia_metodo;

public class MetodoComParametros {
    public static void metodoUmSemRetorno(String nome) {
        System.out.println(nome);
    }

    public static void metodoDoisSemRetorno(String sobrenome) {
        System.out.println(sobrenome);
    }

    public static void metodoTresSemRetorno(double salario) {
        System.out.println(salario);
    }

    public static void metodoQuatroSemRetorno(int idade) {
        System.out.println(idade);

    }

    public static void metodoCincoSemRetorno(int cep) {
        System.out.println(cep);
    }
    // Com Retorno

    public static String metodoUmComRetorno(String nome) {
        return nome;
    }

    public static String metodoDoisComRetorno(String sobrenome) {
        return sobrenome;
    }

    public static double metodoTresComRetorno(double salario) {
        return salario;
    }

    public static String metodoQuatroComRetorno(int idade) {
        return "O parametro enviando é idade: " + idade;
    }

    public static int metodoCincoComRetorno(int cep) {
        return cep;
    }

    public static void main(String[] args) {
        metodoUmSemRetorno("Lut");
        metodoDoisSemRetorno("Machado");
        metodoTresSemRetorno(Double.parseDouble("1500"));
        metodoQuatroSemRetorno(Integer.parseInt("35"));
        metodoCincoSemRetorno(Integer.parseInt("24140005"));
        System.out.println();
        System.out.println("Metodos com retorno");
        System.out.println();
        System.out.println(metodoUmComRetorno("Miguel"));
        System.out.println(metodoDoisComRetorno("Afonso"));
        System.out.println(metodoTresComRetorno(Double.parseDouble("2000")));
        System.out.println(metodoQuatroComRetorno(Integer.parseInt("33")));
        System.out.println(metodoCincoComRetorno(Integer.parseInt("24140005")));

    }

}
