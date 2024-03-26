import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Cliente cliente = new Cliente();

        cliente.nome = "Gustavo Gago ";
        cliente.cpf = 348465100;



        HardwareBasico[] hb1 = new HardwareBasico[3];

        MemoriaUSB musb1 = new MemoriaUSB("Pen-Drive", 16);

        hb1[0] = new HardwareBasico("Pentium Core i3", 2200);
        hb1[1] = new HardwareBasico("Memória RAM",8);
        hb1[2] = new HardwareBasico("HD", 500);

        Computador prom1 = new Computador("Positivo", 3300.00f, new SistemaOperacional(" Linux Ubuntu", 32),hb1);

        prom1.addMemoriaUSB(musb1);

        HardwareBasico[] hb2 = new HardwareBasico[3];

        MemoriaUSB musb2 = new MemoriaUSB("Pen-Drive", 32);

        hb2[0] = new HardwareBasico("Pentium Core i5", 3370);
        hb2[1] = new HardwareBasico("Memória RAM",16);
        hb2[2] = new HardwareBasico("HD", 1000);

        Computador prom2 = new Computador("Acer", 8800f, new SistemaOperacional("Windows 8", 64), hb2);

        prom2.addMemoriaUSB(musb2);

        HardwareBasico[] hb3 = new HardwareBasico[3];

        MemoriaUSB musb3 = new MemoriaUSB("HD Externo ", 1000);

        hb3[0] = new HardwareBasico("Pentium Core i7", 4500);
        hb3[1] = new HardwareBasico("Memória RAM",32);
        hb3[2] = new HardwareBasico("HD", 2000);

        Computador prom3 = new Computador("Vaio",4800, new SistemaOperacional("Windows 10",64), hb3 );

        prom3.addMemoriaUSB(musb3);

        System.out.println("Digite qual promocao voce deseja comprar:");
        System.out.println(" ");
        System.out.println("Digite 1 para promocao 1");
        System.out.println("Digite 2 para promocao 2");
        System.out.println("Digite 3 para promocao 3");
        System.out.println("Digite 0 para finalizar a compra");

        int n = 23123;

        do {

            n = scanner.nextInt();

            switch (n) {
                case 1:

                    for (int i = 0; i < cliente.computadores.length; i++) {
                        if (cliente.computadores[i] == null) {
                            cliente.computadores[i] = prom1;
                            break;
                        }
                    }
                    break;

                case 2:
                    for (int i = 0; i < cliente.computadores.length; i++) {
                        if (cliente.computadores[i] == null) {
                            cliente.computadores[i] = prom2;
                            break;
                        }

                    }
                    break;
                case 3:
                    for (int i = 0; i < cliente.computadores.length; i++) {
                        if (cliente.computadores[i] == null) {
                            cliente.computadores[i] = prom3;
                            break;
                        }
                    }
                    break;

                case 0:
                    System.out.println(" ");
                    break;

                default:
                    System.out.println("Promocao nao encontrada, digite novamente");


            }



        }while (n!= 0);

        System.out.println("Resumo da compra:");

        System.out.println("Cliente: " + cliente.nome);
        System.out.println("CPF: " + cliente.cpf);


        for (int i = 0; i < cliente.computadores.length; i++) {
            if (cliente.computadores[i]!= null){
                cliente.computadores[i].mostraPCConfigs();
            }

        }

        System.out.println(" ");

        System.out.println("Valor total: " + cliente.calculaTotalCompra());

    }
}