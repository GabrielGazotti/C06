import java.util.ArrayList;
import java.util.List;

public class Computador {
    private String marca;
    private float preco;
    private SistemaOperacional sistemaOperacional;
    private MemoriaUSB memoriaUSB;
    private List<HardwareBasico> hardwaresBasicos;

    public Computador(String marca, float preco, SistemaOperacional so) {
        this.marca = marca;
        this.preco = preco;
        this.sistemaOperacional = so;
        this.hardwaresBasicos = new ArrayList<>();
    }

    public float getPreco() {
        return preco;
    }

    public void adicionarHardwareBasico(HardwareBasico hardware) {
        hardwaresBasicos.add(hardware);
    }

    public void adicionarMemoriaUSB(MemoriaUSB musb) {
        this.memoriaUSB = musb;
    }

    public void mostraPCConfig() {
        System.out.println("Marca: " + marca + " - Preço: R$ " + preco);
        System.out.println(sistemaOperacional.exibirinformacoes());
        System.out.println("Hardwares básicos:");
        for (HardwareBasico hb : hardwaresBasicos) {
            System.out.println("- " + hb.exibirinformacoes());
        }
        if (memoriaUSB != null) {
            System.out.println(memoriaUSB);
        } else {
            System.out.println("Sem memória USB.");
        }
        System.out.println();
    }
}
