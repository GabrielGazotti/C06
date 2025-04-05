public class Computador {
    public String marca;
    public float preco;
    public SistemaOperacional sistemaOperacional;
    public MemoriaUSB memoriaUSB;
    public HardwareBasico[] hardwaresBasicos;
    public int contadorHardwares;

    public Computador(String marca, float preco, SistemaOperacional so) {
        this.marca = marca;
        this.preco = preco;
        this.sistemaOperacional = so;
        this.hardwaresBasicos = new HardwareBasico[100];
        this.contadorHardwares = 0;
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

    public void adicionarMemoriaUSB(MemoriaUSB musb) {
        this.memoriaUSB = musb;
    }

    public void mostraPCConfig() {
        System.out.println("Marca: " + marca + " - Preço: R$ " + preco);
        System.out.println(sistemaOperacional.exibirinformacoes());
        System.out.println("Hardwares básicos:");
        for (int i = 0; i < contadorHardwares; i++) {
            System.out.println("- " + hardwaresBasicos[i].exibirinformacoes());
        }
        if (memoriaUSB != null) {
            System.out.println(memoriaUSB);
        } else {
            System.out.println("Sem memória USB.");
        }
        System.out.println();
    }
}
