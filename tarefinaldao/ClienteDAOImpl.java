import java.util.ArrayList;
import java.util.List;

public class ClienteDAOImpl implements ClienteDAO {
    private List<Cliente> clientes;

    public ClienteDAOImpl() {
        this.clientes = new ArrayList<>();
    }

    @Override
    public void addCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    @Override
    public Cliente getCliente(String nome) {
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equalsIgnoreCase(nome)) {
                return cliente;
            }
        }
        return null;
    }

    @Override
    public List<Cliente> getAllClientes() {
        return new ArrayList<>(clientes);
    }

    @Override
    public void updateCliente(Cliente cliente) {
        Cliente clienteExistente = getCliente(cliente.getNome());
        if (clienteExistente != null) {
            clienteExistente.setEndereco(cliente.getEndereco());
            clienteExistente.setTelefone(cliente.getTelefone());
        }
    }

    @Override
    public void deleteCliente(String nome) {
        Cliente cliente = getCliente(nome);
        if (cliente != null) {
            clientes.remove(cliente);
        }
    }
}
