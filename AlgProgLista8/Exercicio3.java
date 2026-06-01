import java.util.Scanner;

public class Exercicio3 {

    public static double somarTres(double a, double b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double a = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double b = sc.nextDouble();
        System.out.print("Digite o terceiro número: ");
        double c = sc.nextDouble();

        double resultado = somarTres(a, b, c);
        System.out.println("Soma: " + resultado);
        sc.close();
    }
}