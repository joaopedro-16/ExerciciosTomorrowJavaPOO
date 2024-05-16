package aula2.q2;

public class Triangulo {
    private double base;
    private double altura;

    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularArea() {
        return (base * altura) / 2;
    }

    public double calcularPerimetro() {
        // Como não é possível encontrar o perímetro somente com altura e base considerei que o triângulo é equilátero.
        return 3 * base;
    }
}
