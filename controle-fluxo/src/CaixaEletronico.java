public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double saque = 17.0;

        if(saque < saldo){ 
            saldo = saldo - saque;
            System.out.println("novo saldo"+saldo);
        } else
            System.out.println("saldo insuficiente");
    }
}
