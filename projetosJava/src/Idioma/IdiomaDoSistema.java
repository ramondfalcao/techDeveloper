package Idioma;


import java.util.Locale;

public class IdiomaDoSistema {
    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        System.out.println(loc.getDisplayLanguage());
        System.out.println(loc.getLanguage());
    }

}
