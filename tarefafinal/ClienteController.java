public class ClienteController {
    private Cliente model;
    private ClienteView view;

    public ClienteController(Cliente model, ClienteView view) {
        this.model = model;
        this.view = view;
    }

    public void setNomeCliente(String nome) {
        model.setNome(nome);
    }

    public String getNomeCliente() {
        return model.getNome();
    }

    public void setEnderecoCliente(String endereco) {
        model.setEndereco(endereco);
    }

    public String getEnderecoCliente() {
        return model.getEndereco();
    }

    public void setTelefoneCliente(String telefone) {
        model.setTelefone(telefone);
    }

    public String getTelefoneCliente() {
        return model.getTelefone();
    }

    public void atualizarView() {
        view.exibirDetalhesCliente(model.getNome(), model.getEndereco(), model.getTelefone());
    }
}
