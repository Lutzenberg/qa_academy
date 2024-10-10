package exercicio_instancia;

public class Execucao {
    public static void main(String[] args) {

        Instancia obj_instacia = new Instancia();
        System.out.println(obj_instacia.pais + " | " + obj_instacia.cidade);
        obj_instacia.nome();
        System.out.println(obj_instacia.calcularDobro(2));
        System.out.println(obj_instacia.metodo());

    }
}
