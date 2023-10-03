import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        try {
        Scanner imprimir = new Scanner(System.in).useLocale(Locale.US);
            System.out.println("Digite seu nome: ");
            String nome = imprimir.next();

            System.out.println("Digite seu sobrenome: ");
            String sobrenome = imprimir.next();

            System.out.println("Digite sua idade: ");
            int idade = imprimir.nextInt();

            System.out.println("Digite sua altura: ");
            Double altura = imprimir.nextDouble();

            System.out.println("olá meu nome é: " + nome + " " + sobrenome + "\n" + "tenho " + idade + " anos"
                    + ", e tenho " + altura + "cm de altura");
        } catch (InputMismatchException e) {
            System.err.println("Os campos de idade e altura precisam ser do tipo int");
        }
    }
}