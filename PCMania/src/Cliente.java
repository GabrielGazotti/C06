public class Cliente {
    public String nome;
    public long cpf;
    public Computador[] compra;
    public int contadorComputadores;

    public Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.compra = new Computador[100];
        this.contadorComputadores = 0;
    }

    public void adicionarComputador(Computador computador) {
        if (contadorComputadores < compra.length) {
            compra[contadorComputadores] = computador;
            contadorComputadores++;
        } else {
            System.out.println("Limite de computadores atingido para o cliente.");
        }
    }

    public float calculaTotalCompra() {
        float total = 0;
        for (int i = 0; i < contadorComputadores; i++) {
            total += compra[i].getPreco();
        }
        return total;
    }

    public void exibirResumoCompra() {
        System.out.println("Cliente: " + nome + " (CPF: " + cpf + ")");
        System.out.println("PC's adquiridos:");
        for (int i = 0; i < contadorComputadores; i++) {
            compra[i].mostraPCConfig();
        }
        System.out.println("Total da compra: R$ " + calculaTotalCompra());
    }
}
