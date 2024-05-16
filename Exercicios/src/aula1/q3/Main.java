package aula1.q3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo:");
        int numero = scanner.nextInt();

        String numeroString = String.valueOf(numero);

        if (numeroString.charAt(0) == numeroString.charAt(numeroString.length() - 1)) {
            System.out.println("O primeiro e o último dígitos do número " + numero + " são iguais.");
        } else {
            System.out.println("O primeiro e o último dígitos do número " + numero + " são diferentes.");
        }
        scanner.close();
    }
}