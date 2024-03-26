public class Computador {

    String marca;

    float preco;

    SistemaOperacional sistemaOperacional;

    HardwareBasico [] hardwareBasicos = new HardwareBasico[3];

    MemoriaUSB memoriaUSB = null;


    public Computador(String marca, float preco, SistemaOperacional sistemaOperacional, HardwareBasico[] hardwareBasicos) {
        this.marca = marca;
        this.preco = preco;
        this.sistemaOperacional = sistemaOperacional;
        this.hardwareBasicos = hardwareBasicos;
    }

    void addMemoriaUSB(MemoriaUSB musb){

        this.memoriaUSB = musb;

    }

    void mostraPCConfigs(){

        System.out.println(" ");
        System.out.println("Marca: " + this.marca);
        System.out.println("Preco: " + this.preco);
        System.out.println("Sistema Operacional: " + this.sistemaOperacional.nome + " " + this.sistemaOperacional.tipo);

        for (int i = 0; i < hardwareBasicos.length; i++) {

            if(hardwareBasicos[i] != null){
                System.out.println("Hardware basico: " + hardwareBasicos[i].nome + "  " + hardwareBasicos[i].capacidade);
            }
        }

        if (memoriaUSB != null)
            System.out.println("Acompanha memoria: " + memoriaUSB.nome + memoriaUSB.capacidade + "GB");
    }




}
