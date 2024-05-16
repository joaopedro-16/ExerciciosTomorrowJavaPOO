package aula4.q1;

class Retangulo extends ObjetoGeometrico {
    double lado1, lado2;

    public void inicializar(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    // Método para mostrar os dados do retângulo
    public void mostrarDados() {
        System.out.println("Retângulo:");
        System.out.println("Lado 1: " + lado1);
        System.out.println("Lado 2: " + lado2);
    }

    // Método para calcular e retornar a área do retângulo
    public double calcularArea() {
        return lado1 * lado2;
    }

    // Método para calcular e retornar o perímetro do retângulo
    public double calcularPerimetro() {
        return 2 * (lado1 + lado2);
    }
}
