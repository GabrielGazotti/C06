import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private long cpf;
    private List<Computador> compra;

    public Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.compra = new ArrayList<>();
    }

    public void adicionarComputador(Computador computador) {
        compra.add(computador);
    }

    public float calculaTotalCompra() {
        float total = 0;
        for (Computador pc : compra) {
            total += pc.getPreco();
        }
        return total;
    }

    public void exibirResumoCompra() {
        System.out.println("Cliente: " + nome + " (CPF: " + cpf + ")");
        System.out.println("PC's adquiridos:");
        for (Computador pc : compra) {
            pc.mostraPCConfig();
        }
        System.out.println("Total da compra: R$ " + calculaTotalCompra());
    }
}
