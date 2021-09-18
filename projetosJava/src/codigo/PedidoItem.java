package codigo;

public class PedidoItem {
    private Integer id;
    private Integer quantidade;
    private Integer valorVenda;
    private Integer subTotal;
    private Item item;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Integer getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Integer valorVenda) {
        this.valorVenda = valorVenda;
    }

    public Integer getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Integer subTotal) {
        this.subTotal = subTotal;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
