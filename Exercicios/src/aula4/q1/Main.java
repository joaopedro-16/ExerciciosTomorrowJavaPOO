package aula4.q1;

public class Main {
    public static void main(String[] args) {

        Circulo circulo = new Circulo();
        circulo.inicializar(0, 0, 5);

        Retangulo retangulo = new Retangulo();
        retangulo.inicializar(4, 6);

        Triangulo triangulo = new Triangulo();
        triangulo.inicializar(3, 4, 5);

        circulo.mostrarDados();
        System.out.println("Área do círculo: " + circulo.calcularArea());
        System.out.println("Perímetro do círculo: " + circulo.calcularPerimetro());

        retangulo.mostrarDados();
        System.out.println("Área do retângulo: " + retangulo.calcularArea());
        System.out.println("Perímetro do retângulo: " + retangulo.calcularPerimetro());

        triangulo.mostrarDados();
        System.out.println("Área do triângulo: " + triangulo.calcularArea());
        System.out.println("Perímetro do triângulo: " + triangulo.calcularPerimetro());
    }
}
