package Exercicio0;

public class Cantina {

    String nome;
    Salgado[] salgados = new Salgado[5];

    void addSalgado(Salgado novoSalgado){
        for (int i = 0; i < salgados.length; i++) {
            if (salgados[i] == null) {
                salgados[i] = novoSalgado;
                break;
            }
        }
    }

    void mostraInfo(){
        System.out.println("Cardápio da Cantina " + this.nome);
        for (Salgado s : salgados) {
            if (s != null) {
                System.out.println("- " + s.nome);
            }
        }
    }
}
