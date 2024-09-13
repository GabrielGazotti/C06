public class HardwareBasico {
    private String nome;
    private int capacidade;  // Em MHz ou GB

    public HardwareBasico(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public String exibirinformacoes() {
        return nome + " com capacidade de " + capacidade;
    }
}
