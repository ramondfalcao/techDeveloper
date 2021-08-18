package estudos;

public class EstudandoMetodos {
    public static void main(String[] args) {
        imprimir("Ola Turma");
        int resultado = somar(3,7);

        System.out.println(resultado);

        int numeroPassado = 0;
        boolean expectativa= validarNumero(numeroPassado);

        System.out.println("Passando o valor " + numeroPassado
                + " Logo terei " +  expectativa);
    }
    static boolean validarNumero(int numero){
        if(numero==1)
            return true;
        else
            return false;
    }
    static int somar(int n1, int n2) {
        int resultado = n1+n2;
        return resultado;
    }
    static void imprimir(String mensagem){
        System.out.println(mensagem);
    }
}