import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Computador promocao1 = criarPromocao1();
        Computador promocao2 = criarPromocao2();
        Computador promocao3 = criarPromocao3();

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        System.out.print("Digite o CPF do cliente: ");
        long cpfCliente = scanner.nextLong();
        Cliente cliente = new Cliente(nomeCliente, cpfCliente);

        boolean flag = true;

        while (flag == true) {
            System.out.println("Escolha uma promoção para comprar (ou digite 0 para sair):");
            System.out.println("1 - Promoção 1");
            System.out.println("2 - Promoção 2");
            System.out.println("3 - Promoção 3");
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 0:
                    flag = false;
                    break;
                case 1:
                    cliente.adicionarComputador(promocao1);
                    break;
                case 2:
                    cliente.adicionarComputador(promocao2);
                    break;
                case 3:
                    cliente.adicionarComputador(promocao3);
                    break;
                default:
                    System.out.println("Promoção inválida.");
            }
            cliente.exibirResumoCompra();
        }
        scanner.close();
    }

    public static Computador criarPromocao1() {
        SistemaOperacional so = new SistemaOperacional("Linux Ubuntu", 32);
        Computador pc = new Computador("Apple", 473, so);
        pc.adicionarHardwareBasico(new HardwareBasico("Pentium Core i3", 2200));
        pc.adicionarHardwareBasico(new HardwareBasico("Memória RAM", 8));
        pc.adicionarHardwareBasico(new HardwareBasico("HD", 500));
        pc.adicionarMemoriaUSB(new MemoriaUSB("Pen-drive", 16));
        return pc;
    }

    public static Computador criarPromocao2() {
        SistemaOperacional so = new SistemaOperacional("Windows 8", 64);
        Computador pc = new Computador("Samsung", 473+1234, so);
        pc.adicionarHardwareBasico(new HardwareBasico("Pentium Core i5", 3370));
        pc.adicionarHardwareBasico(new HardwareBasico("Memória RAM", 16));
        pc.adicionarHardwareBasico(new HardwareBasico("HD", 1000));
        pc.adicionarMemoriaUSB(new MemoriaUSB("Pen-drive", 32));
        return pc;
    }

    public static Computador criarPromocao3() {
        SistemaOperacional so = new SistemaOperacional("Windows 10", 64);
        Computador pc = new Computador("Dell", 473+5678, so);
        pc.adicionarHardwareBasico(new HardwareBasico("Pentium Core i7", 4500));
        pc.adicionarHardwareBasico(new HardwareBasico("Memória RAM", 32));
        pc.adicionarHardwareBasico(new HardwareBasico("HD", 2000));
        pc.adicionarMemoriaUSB(new MemoriaUSB("HD Externo", 1000));
        return pc;
    }
}
