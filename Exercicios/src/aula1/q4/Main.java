package aula1.q4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de n:");
        int n = scanner.nextInt();
        System.out.println("Digite o valor de i:");
        int i = scanner.nextInt();
        System.out.println("Digite o valor de j:");
        int j = scanner.nextInt();

        int contador = 0;
        int numero = 0;

        System.out.println("Os primeiros " + n + " números naturais múltiplos de " + i + " ou " + j + " são:");

        while (contador < n) {
            if (numero % i == 0 || numero % j == 0) {
                System.out.print(numero + " ");
                contador++;
            }
            numero++;
        }

        scanner.close();
    }
}