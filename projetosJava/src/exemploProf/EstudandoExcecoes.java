package exemploProf;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class EstudandoExcecoes {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("c://");
        } catch (FileNotFoundException e) {
            System.out.println("Não foi localizado o arquivo no" +
                    "diretorio informado");
        }

    }
    private void metodoOne(){
        String input = "1";
        int dividendo = 1;
        try {
            Integer number = Integer.valueOf(input);
            System.out.println(number / dividendo);
            String mininome = "JOSE".substring(0,7);
            System.out.println(mininome);
        } catch (NumberFormatException ne) {
            System.err.println("Este método só é permitido números");
        } catch (ArithmeticException ne) {
            System.err.println("O valor do dividendo não pode ser zero");
        } catch (Exception ne) {
            System.err.println("Erro generico");
            System.out.println(ne.getMessage());
            System.out.println(ne.getCause());
            ne.printStackTrace();
        }
    }
}
