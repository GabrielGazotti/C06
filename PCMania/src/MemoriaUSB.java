public class MemoriaUSB {
    private String nome;
    private int capacidade;  // Em GB

    public MemoriaUSB(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public String exibirinformacoes() {
        return "Memória USB: " + nome + " (" + capacidade + " GB)";
    }
}
