public class Vilao extends Personagem implements Combater {

    public Vilao(String nome, int vida) {
        super(nome, vida);
    }

    @Override
    public void usarEspecial(Personagem personagem) {
        personagem.vida = 0;
        System.out.println(this.nome + " zerou a vida de " + personagem.nome + "!");
    }
}