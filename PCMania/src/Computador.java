public class Computador {
    private String marca;
    private float preco;
    private HardwareBasico processador;
    private HardwareBasico memoria;
    private HardwareBasico hd;
    private SistemaOperacional sistemaOperacional;
    private MemoriaUSB memoriaUSB;

    public Computador(String marca, float preco, HardwareBasico processador, HardwareBasico memoria, HardwareBasico hd, SistemaOperacional so) {
        this.marca = marca;
        this.preco = preco;
        this.processador = processador;
        this.memoria = memoria;
        this.hd = hd;
        this.sistemaOperacional = so;
        this.memoriaUSB =  memoriaUSB;
    }

    public void addMemoriaUSB(MemoriaUSB musb){
        this.memoriaUSB = musb;
    }

    public float getPreco() { return preco;}

    public void mostraPCConfigs() {
        System.out.println("\nMarca: " + marca);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Processador: " + processador.getNome() +  " (" + processador.getCapacidade() + " Mhz)");
        System.out.println("Memoria RAM: " + memoria.getNome() + memoria.getCapacidade() + " Gb");
        System.out.println("HD " + hd.getCapacidade() + " Gb");
        System.out.println("Sistema Operacional: " + sistemaOperacional.getNome() + " (" + sistemaOperacional.getTipo() + " bits)");
        if (memoriaUSB != null) {
            System.out.println("Acompanha: " + memoriaUSB.getNome() + " de " + memoriaUSB.getCapacidade() + " Gb");
        } else {
            System.out.println("Não acompanha nenhuma memória USB");
        }
    }
}
