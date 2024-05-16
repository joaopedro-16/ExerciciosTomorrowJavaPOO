package aula1.q2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo:");
        int numero = scanner.nextInt();

        String numeroString = String.valueOf(numero);
        boolean contemDigitosConsecutivos = false;

        for (int i = 0; i < numeroString.length() - 1; i++) {
            if (numeroString.charAt(i) == numeroString.charAt(i + 1)) {
                contemDigitosConsecutivos = true;
                break;
            }
        }
        if (contemDigitosConsecutivos) {
            System.out.println("O número " + numero + " contém dois dígitos consecutivos iguais.");
        } else {
            System.out.println("O número " + numero + " não contém dois dígitos consecutivos iguais.");
        }
        scanner.close();
    }
}