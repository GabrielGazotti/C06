public class MemoriaUSB {
    public String nome;
    public int capacidade;

    public MemoriaUSB(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public String exibirinformacoes() {
        return "Memória USB: " + nome + " (" + capacidade + " GB)";
    }
}
