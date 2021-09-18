package codigo;

public class Cliente {
    private Telefone[] telefones;
    private Endereco contato;
    private Endereco correspondencia;

    public Telefone[] getTelefones() {
        return telefones;
    }

    public void setTelefones(Telefone[] telefones) {
        this.telefones = telefones;
    }

    public Endereco getContato() {
        return contato;
    }

    public void setContato(Endereco contato) {
        this.contato = contato;
    }

    public Endereco getCorrespondencia() {
        return correspondencia;
    }

    public void setCorrespondencia(Endereco correspondencia) {
        this.correspondencia = correspondencia;
    }
}
