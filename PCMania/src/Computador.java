public class Computador {
    public String marca;
    public float preco;
    public SistemaOperacional sistemaOperacional;
    public MemoriaUSB memoriaUSB;
    public HardwareBasico[] hardwaresBasicos;
    public int contadorHardwares;

    public Computador(String marca, float preco, SistemaOperacional so, MemoriaUSB musb) {
        this.marca = marca;
        this.preco = preco;
        this.sistemaOperacional = so;
        this.hardwaresBasicos = new HardwareBasico[100];
        this.contadorHardwares = 0;
        this.memoriaUSB = musb;
    }

    public float getPreco() {
        return preco;
    }

    public void adicionarHardwareBasico(HardwareBasico hardware) {
        if (contadorHardwares < hardwaresBasicos.length) {
            hardwaresBasicos[contadorHardwares] = hardware;
            contadorHardwares++;
        } else {
            System.out.println("Limite de hardwares básicos atingido.");
        }
    }

    public void mostraPCConfig() {
        System.out.println("Marca: " + marca + " - Preço: R$ " + preco);
        System.out.println(sistemaOperacional.exibirinformacoes());
        System.out.println(memoriaUSB.exibirinformacoes());
        System.out.println("Hardwares básicos:");
        for (int i = 0; i < contadorHardwares; i++) {
            System.out.println("- " + hardwaresBasicos[i].exibirinformacoes());
        }
        System.out.println();
    }
}
