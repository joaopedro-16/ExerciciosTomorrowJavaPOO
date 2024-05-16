package aula2.q2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base do triângulo: ");
        double base = scanner.nextDouble();
        System.out.print("Digite a altura do triângulo: ");
        double altura = scanner.nextDouble();

        Triangulo triangulo = new Triangulo();

        triangulo.setBase(base);
        triangulo.setAltura(altura);

        System.out.println("Área do triângulo: " + triangulo.calcularArea());
        System.out.println("Perímetro do triângulo: " + triangulo.calcularPerimetro());

        scanner.close();
    }
}