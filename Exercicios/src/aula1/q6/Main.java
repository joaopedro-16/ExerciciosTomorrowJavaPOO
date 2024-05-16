package aula1.q6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de elementos na sequência:");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            long fatorial = calcularFatorial(i);
            System.out.println(i +"!" + " = " + fatorial);
        }

        scanner.close();
    }

    public static long calcularFatorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        }

        long fatorial = 1;

        for (int i = 2; i <= numero; i++) {
            fatorial *= i;
        }

        return fatorial;
    }
}
