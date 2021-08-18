package LojaDeCarros;

public class Veiculo {
    private Integer ano;
    private String chassi;
    private Double valorVenda;
    private Integer estoque;

    public Veiculo(){

    }
    public void adicionarEstoque(Integer novoEstoque){
        estoque = estoque + novoEstoque;
    }
    public Veiculo(Integer ano, String chassi) {
        this.ano = ano;
        this.chassi = chassi;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public Double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer e) {
        this.estoque = e;
    }

    public void setAno(Integer ano){
        this.ano = ano;
    }

    public Integer getAno(){
        return ano;
    }
}