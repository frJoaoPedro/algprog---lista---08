import java.util.Scanner;

public class Exercicio2 {

    public static void imprimirSequencia(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                if (j < i) System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor de n: ");
        int n = sc.nextInt();
        imprimirSequencia(n);
        sc.close();
    }
}