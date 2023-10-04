import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ControleCandidatura {

    public static void main(String[] args) {
        String[] candidatos = { "joao", "Felipe", "mariana", "cleiton", "julio" };
        for (String candidato : candidatos) {
            entrarEmContato(candidato);
        }
    }

    static void entrarEmContato(String candidato) {
        int tentativaContato = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando)
                tentativaContato++;
            else
                System.out.println("Contato Realizado com sucesso!");

        } while (continuarTentando && tentativaContato < 3);
        if (atendeu) {
            System.out.println("Conseguimos contato com "+ candidato+ " na tentativa: "+tentativaContato);
        } else {
            System.out.println("nao conseguimos contato com "+candidato+ ", numero de tentativas: "+tentativaContato);
        }
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void imprimirCandidatos() {
        String[] candidatos = { "joao", "Felipe", "mariana", "cleiton", "julio" };
        System.out.println("Seleção de candidatos");
        System.out.println("========================");

        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("O candidato: " + candidatos[i] + " foi selecionado");
        }

        System.out.println("Usando syntax simplificada");

        for (String candidato : candidatos) {
            System.out.println("Candidatos selecionados: " + candidato);
        }
    }

    static void selecionarCandidato() {
        String[] candidatos = { "joao", "Felipe", "mariana", "cleiton", "julio", "pedro", "joana", "artur" };

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato" + candidato + " solicitou este valor de salário " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.print("O Candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    /**
     * @param salarioPretendido
     */
    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para candidato com contra proposta");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }
}