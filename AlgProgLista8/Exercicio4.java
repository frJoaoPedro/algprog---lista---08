import java.util.Scanner;

public class Exercicio4 {

    public static char verificarSinal(double numero) {
        if (numero > 0) {
            return 'P';
        } else {
            return 'N';
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double numero = sc.nextDouble();

        char resultado = verificarSinal(numero);
        System.out.println("Resultado: " + resultado);
        sc.close();
    }
}