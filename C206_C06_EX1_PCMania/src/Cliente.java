public class Cliente {

    String nome;

    long cpf;

    Computador [] computadores = new Computador[10];


    float calculaTotalCompra(){

        float total = 0;

        for (int i = 0; i < computadores.length; i++) {
            if (computadores[i] != null) {
                total = total + computadores[i].preco;
            }
        }
        return total;
    }

}
