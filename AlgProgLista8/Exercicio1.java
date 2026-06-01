import java.util.Scanner;

public class Exercicio1 {

    public static void imprimirTriangulo(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                if (j < i) System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor de n: ");
        int n = sc.nextInt();
        imprimirTriangulo(n);
        sc.close();
    }
}