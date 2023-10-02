import java.util.Locale;
import java.util.Scanner;

public class minhaClasse {
    public static void main(String[] args) {
        try (Scanner print = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("digite seu nome: ");
            String nome = print.next();

            System.out.println("digite seu sobrenome: ");
            String sobrenome = print.next();

            System.out.println("sua idade: ");
            int idade = print.nextInt();

            System.out.println("digite sua altura: ");
            double altura = print.nextDouble();

            System.out.println("Ola, meu nome é "+nome+" "+sobrenome);
            System.out.println("Tenho "+idade+" anos");
            System.out.println("minha altura é "+altura);
        }

    }
}