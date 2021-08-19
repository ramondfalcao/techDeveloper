package impressora;

import java.util.Date;

public class Impressora {

    private String modelo;
    private String tipoConexao;
    private Date dataFabricacao;
    private int folhasDisponiveis;

    public Impressora(String modelo, String tipoConexao, Date dataFabricacao){
        this.modelo = modelo;
        this.tipoConexao = tipoConexao;
        this.dataFabricacao = dataFabricacao;
        this.folhasDisponiveis = 0;
    }

    public void setFolhasDisponiveis(int folhasDisponiveis) {
        this.folhasDisponiveis = folhasDisponiveis;
    }

    private boolean temPapel(){
        boolean estado;
        if(this.folhasDisponiveis == 0)
            estado = false;
        else
            estado = true;

        return estado;
    }


    public void imprimir(String texto){
        if(temPapel())
            System.out.println(texto);
        else
            System.out.println("Sem papel!");
    }
}


