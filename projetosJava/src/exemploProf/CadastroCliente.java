package exemploProf;

import javax.swing.*;

public class CadastroCliente {
    public static void main(String[] args) {
        try {
            ValidadorCpf.validar("123");
        } catch (CpfInvalidoException e) {
            e.printStackTrace();
        }
    }
    private void metodo(){
        String nome = "GLEYSON SAMPAIO";
        if(nome==null)
            System.out.println("Nome é nulo");
        else {
            if(nome.length() <8){
                System.out.println("Nome inferior a 8");
                return;
            }
            try {
                String mininome = nome.substring(0, 8);
                System.out.println(mininome);
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }
}
