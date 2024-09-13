public class SistemaOperacional {
    private String nome;
    private int tipo;

    public SistemaOperacional(String nome, int tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String exibirinformacoes() {
        return "Sistema Operacional: " + nome + " (" + tipo + " bits)";
    }
}
