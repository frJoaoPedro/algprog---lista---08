import java.util.Scanner;

public class Exercicio6 {

    public static char calcularPeriodo(int hora) {
        if (hora < 12) {
            return 'A';
        } else {
            return 'P';
        }
    }

    public static int converterHora(int hora) {
        if (hora == 0) {
            return 12;
        } else if (hora <= 12) {
            return hora;
        } else {
            return hora - 12;
        }
    }

    public static void exibirHorario(int hora, int minuto, char periodo) {
        String sufixo = (periodo == 'A') ? "A.M." : "P.M.";
        System.out.printf("Horário convertido: %d:%02d %s%n", hora, minuto, sufixo);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resposta;

        do {
            System.out.print("Digite a hora (0-23): ");
            int hora = sc.nextInt();
            System.out.print("Digite os minutos (0-59): ");
            int minuto = sc.nextInt();

            char periodo = calcularPeriodo(hora);
            int horaConvertida = converterHora(hora);
            exibirHorario(horaConvertida, minuto, periodo);

            System.out.print("Deseja converter outro horário? (s/n): ");
            resposta = sc.next();
        } while (resposta.equalsIgnoreCase("s"));

        System.out.println("Programa encerrado.");
        sc.close();
    }
}