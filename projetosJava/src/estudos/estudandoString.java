package estudos;

public class estudandoString {
    public static void main(String[] args) {
        String nome = "GLEYSON 00654 30061984";
        System.out.println(nome.toLowerCase());
        System.out.println(nome.concat("OLIVEIRA"));

        String [] palavras = nome.split(" ");
        String name = palavras[0];
        String cpf = palavras[1];
        String niver = palavras[2];

    }
}