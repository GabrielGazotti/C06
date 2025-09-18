public class Cliente {
    private String nome;
    private String cpf;
    public Computador[] compra;
    public int contadorComputadores;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {return nome;}

    public float calculaTotalCompra() {
        float total = 0;
        for (int i = 0; i < contadorComputadores; i++) {
            total += compra[i].getPreco();
        }
        return total;
    }
}
