package impressora;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        Date data = new Date("20/08/1990") ;
        Impressora impressora = new Impressora("Epson", "wifi", data);
        impressora.setFolhasDisponiveis(100);
        impressora.imprimir("OlÃ¡ Mundo");

    }
}