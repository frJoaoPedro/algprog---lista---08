import java.util.Scanner;

public class Exercicio5 {

    public static double somaImposto(double taxaImposto, double custo) {
        custo = custo + (custo * taxaImposto / 100.0);
        return custo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o custo do item: ");
        double custo = sc.nextDouble();
        System.out.print("Digite a taxa de imposto (%): ");
        double taxa = sc.nextDouble();

        double custoFinal = somaImposto(taxa, custo);
        System.out.printf("Custo com imposto: R$ %.2f%n", custoFinal);
        sc.close();
    }
}