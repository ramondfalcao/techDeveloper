package codigo;

public class Pedido {
    private String data;
    private Double valor;
    private Cliente cliente;

    private PedidoItem [] itens;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public PedidoItem[] getItens() {
        return itens;
    }

    public void setItens(PedidoItem[] itens) {
        this.itens = itens;
    }
}
