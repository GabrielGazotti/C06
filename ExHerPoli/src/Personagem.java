public abstract class Personagem {
    protected String nome;
    protected int vida;
    protected Arma[] armas;
    protected int quantidadeArmas;

    public Personagem(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
        this.armas = new Arma[10];
        this.quantidadeArmas = 0;
    }

    public void addArma(Arma arma) {
        if (quantidadeArmas < armas.length) {
            armas[quantidadeArmas] = arma;
            quantidadeArmas++;
        } else {
            System.out.println("Limite de armas atingido!");
        }
    }

    public void mostrarArmas() {
        for (int i = 0; i < quantidadeArmas; i++) {
            System.out.println((i + 1) + ". " + armas[i]);
        }
    }

    public void atacar(int posicao, Personagem personagem) {
        if (posicao < 0 || posicao >= quantidadeArmas) {
            System.out.println("Posição de arma inválida!");
            return;
        }

        Arma arma = armas[posicao];

        if (arma.getDurabilidade() <= 0) {
            System.out.println("A arma está quebrada!");
            return;
        }

        if (personagem.vida <= 0) {
            System.out.println(personagem.nome + " já está derrotado!");
            return;
        }

        personagem.vida -= arma.getDano();
        arma.setDurabilidade(0);

        System.out.println(this.nome + " atacou " + personagem.nome + " causando " + arma.getDano() + " de dano.");
    }
}