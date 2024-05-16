package aula1.q5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número natural:");
        int n = scanner.nextInt();

        boolean encontrado = false;

        for (int i = 1; i <= n / 3; i++) {
            int produto = i * (i + 1) * (i + 2);
            if (produto == n) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println(n + " é um número triangular.");
        } else {
            System.out.println(n + " não é um número triangular.");
        }

        scanner.close();
    }
}