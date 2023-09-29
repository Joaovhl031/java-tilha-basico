public class App {
    public static void main(String[] args) throws Exception {
        double salario = 1500;
        String nome = "Joao";
        System.out.println("Meu nome é "+ nome+"\n salario: "+salario);
        short numeroCurto =1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        System.out.println(numeroCurto2);
        int numero = 20;

        numero =25;
        numero = - numero;
        System.out.println(numero* -1);


        final double PI = 3.14;
        System.out.println(PI);
        
        int numero2 = 5;
        numero2 = numero2 + 5;
        System.out.println(numero2);

        int numeroIncrement = 7;
        System.out.println(++ numeroIncrement);

        int numeroDecrement = numeroIncrement;
        System.out.println(-- numeroDecrement);

        Boolean verificacao = true;
        System.out.println(verificacao);

        int a, b;

        a= 5;
        b=3;

        String resultado = "";
        if (a==b) 
            resultado = "verdadeiro";
        else
            resultado ="Falso";
            System.out.println(resultado);


        String result = a==b ? "verdadeiro" : "False";
        System.out.println(result);


        boolean deMaior, estaAcompanhado;

        deMaior= false;
        estaAcompanhado= true;

        if(deMaior || estaAcompanhado)
            System.out.println("Pode entar");
        else
            System.out.println("acesso negado");

        if(deMaior && estaAcompanhado)
            System.out.println("Pode entar");
        else
            System.out.println("acesso negado");
    }
}
