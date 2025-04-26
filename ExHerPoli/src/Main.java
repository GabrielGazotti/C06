public class Main {
    public static void main(String[] args) {

        Arma garra = new Arma("Bat-Garra", 25, 1);
        Arma smoke = new Arma("Bat-Smoke", 10, 1);
        Arma pistola = new Arma("Pistola de Bang!", 30, 1);
        Arma gas = new Arma("Gás do Riso", 20, 1);

        Heroi heroi = new Heroi("Batman", 100);
        Vilao vilao = new Vilao("Coringa", 120);

        heroi.addArma(garra);
        heroi.addArma(smoke);
        vilao.addArma(pistola);
        vilao.addArma(gas);

        System.out.println("Armas do Herói:");
        heroi.mostrarArmas();
        System.out.println("Armas do Vilão:");
        vilao.mostrarArmas();

        heroi.atacar(0, vilao);
        vilao.atacar(1, heroi);

        heroi.usarEspecial(vilao);
        vilao.usarEspecial(heroi);
    }
}