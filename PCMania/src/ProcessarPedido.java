public class ProcessarPedido {
    public static void enviarPedido(Computador[] computadores, int qtd) {
        if (qtd > 0){
            System.out.println("\nPedidos enviados");
        } else {
            System.out.println("\nNnehum pedido realizado");
        }
    }
}
