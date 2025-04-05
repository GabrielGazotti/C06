public class HardwareBasico {
    public String nome;
    public int capacidade;

    public HardwareBasico(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public String exibirinformacoes() {
        return nome + " com capacidade de " + capacidade;
    }
}
