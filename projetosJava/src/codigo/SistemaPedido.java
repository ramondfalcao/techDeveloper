package codigo;

public class SistemaPedido {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Endereco endContato = new Endereco();
        endContato.setLogradouro("RUA ALVARES 325, CENTRO, SP");
        cliente.setContato(endContato);

        Endereco endCorrespondencia = new Endereco();
        endCorrespondencia.setLogradouro("RUA ALVARES 325, CENTRO, SP");
        cliente.setCorrespondencia(endContato);

        Telefone[] telefones = new Telefone[2];

        Telefone telCel = new Telefone();
        telCel.setTipo(TelefoneTipo.CELULAR);
        telefones[0]= telCel;

        Telefone telWhats = new Telefone();
        telWhats.setTipo(TelefoneTipo.WHATSAPP);
        telefones[1]= telWhats;

        cliente.setTelefones(telefones);



        Item coca = new Item();
        coca.setNome("COCA COLA");


        PedidoItem item1 = new PedidoItem();
        item1.setId(1);
        item1.setItem(coca);
        item1.setQuantidade(10);
        item1.setValorVenda(3);
        item1.setSubTotal(30);

        PedidoItem[] itens = new PedidoItem[1];
        itens[0] = item1;

        Pedido pedido = new Pedido();
        pedido.setCliente(cliente);
        pedido.setData("12/08/21");
        pedido.setValor(30.0);
        pedido.setItens(itens);


    }
    static void metodo(){

    }
}
