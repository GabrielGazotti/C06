public class Heroi extends Personagem implements Combater {

    public Heroi(String nome, int vida) {
        super(nome, vida);
    }

    @Override
    public void usarEspecial(Personagem personagem) {
        for (int i = 0; i < personagem.quantidadeArmas; i++) {
            personagem.armas[i] = null;
        }
        personagem.quantidadeArmas = 0;
        System.out.println(this.nome + " desarmou " + personagem.nome + "!");
    }
}