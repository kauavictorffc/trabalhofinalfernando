public class DAODemo {
    public static void main(String[] args) {
        ClienteDAO clienteDAO = new ClienteDAOImpl();

        Cliente cliente1 = new Cliente("Kauã", "Rua Exemplo 1", "1111-1111");
        Cliente cliente2 = new Cliente("Nathany", "Rua Exemplo 2", "2222-2222");

        clienteDAO.addCliente(cliente1);
        clienteDAO.addCliente(cliente2);

        System.out.println("Clientes adicionados:");
        for (Cliente cliente : clienteDAO.getAllClientes()) {
            System.out.println(cliente);
        }

        cliente1.setEndereco("Rua Atualizada 3");
        clienteDAO.updateCliente(cliente1);

        System.out.println("\nCliente atualizado:");
        System.out.println(clienteDAO.getCliente("Kauã"));

        clienteDAO.deleteCliente("Nathany");

        System.out.println("\nClientes após remoção:");
        for (Cliente cliente : clienteDAO.getAllClientes()) {
            System.out.println(cliente);
        }
    }
}
