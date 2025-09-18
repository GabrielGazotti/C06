import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HardwareBasico processador1 = new HardwareBasico("Pentium Core i3", 2200);
        HardwareBasico memoria1 = new HardwareBasico("Memoria RAM", 8);
        HardwareBasico hd1 = new HardwareBasico("HD", 500);

        HardwareBasico processador2 = new HardwareBasico("Pentium Core i5", 3370);
        HardwareBasico memoria2 = new HardwareBasico("Memoria RAM", 16);
        HardwareBasico hd2 = new HardwareBasico("HD", 1000);

        HardwareBasico processador3 = new HardwareBasico("Pentium Core i7", 4500);
        HardwareBasico memoria3 = new HardwareBasico("Memoria RAM", 32);
        HardwareBasico hd3 = new HardwareBasico("HD", 2000);

        SistemaOperacional so1 = new SistemaOperacional("macOS Sequoia", 64);
        SistemaOperacional so2 = new SistemaOperacional("Windows 8", 64);
        SistemaOperacional so3 = new SistemaOperacional("Windows 10", 64);

        MemoriaUSB usb1 = new MemoriaUSB("Pen-drive", 16);
        MemoriaUSB usb2 = new MemoriaUSB("Pen-drive", 32);
        MemoriaUSB usb3 = new MemoriaUSB("HD externo", 1000);

        Computador pc1 = new Computador("Apple", 473, processador1, memoria1, hd1, so1);
        Computador pc2 = new Computador("Samsung", 473+1234, processador2, memoria2, hd2, so2);
        Computador pc3 = new Computador("Dell", 473+5678, processador3, memoria3, hd3, so3);

        pc1.addMemoriaUSB(usb1);
        pc2.addMemoriaUSB(usb2);
        pc3.addMemoriaUSB(usb3);

        Computador[] computadoresDisponiveis = {pc1, pc2, pc3};

        Cliente cliente = new Cliente("Gabriel Teixeira Gazotti", "123.456.789-10");
        cliente.compra = new Computador[100];
        cliente.contadorComputadores = 0;

        System.out.print("Quantos computadores você deseja comprar? ");
        int quantidadeComprada = scanner.nextInt();
        if (quantidadeComprada < 0) {
            System.out.println("Quantidade inválida! Escolha um número maior que 0");
            scanner.close();
            return;
        }

        for (int i = 0; i < quantidadeComprada; i++) {
            System.out.print("Escolha o PC " + (i + 1) + " (0 para Mac, 1 para Samsung, 2 para Dell): ");
            int escolha = scanner.nextInt();
            if (escolha >= 0 && escolha < 3) {
                cliente.compra[i] = computadoresDisponiveis[escolha];
                cliente.contadorComputadores++;
            } else {
                System.out.println("Opção inválida! PC não adicionado.");
                i--;
            }
        }
        scanner.close();

        ProcessarPedido.enviarPedido(cliente.compra, cliente.contadorComputadores);

        System.out.println("\nInformações do Cliente:");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("\nPCs Comprados:");
        for (int i = 0; i < cliente.contadorComputadores; i++) {
            if (cliente.compra[i] != null) {
                cliente.compra[i].mostraPCConfigs();
            }
        }

        float totalCompra = cliente.calculaTotalCompra();
        System.out.println("\nTotal da compra: R$ " + totalCompra);
    }
}