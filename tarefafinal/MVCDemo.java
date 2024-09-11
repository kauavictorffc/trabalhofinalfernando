public class MVCDemo {
    public static void main(String[] args) {
        // Cria o Model
        Cliente cliente = new Cliente("Kauã", "Rua Exemplo, 123", "1234-5678");

        // Cria a View
        ClienteView view = new ClienteView();

        // Cria o Controller
        ClienteController controller = new ClienteController(cliente, view);

        // Atualiza a View
        controller.atualizarView();

        // Atualiza os dados através do Controller
        controller.setNomeCliente("Nathany");
        controller.atualizarView();
    }
}
