package aula4.q1;

class Triangulo extends ObjetoGeometrico {
    double lado1, lado2, lado3;

    // Método para inicializar o triângulo com os lados
    public void inicializar(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    // Método para mostrar os dados do triângulo
    public void mostrarDados() {
        System.out.println("Triângulo:");
        System.out.println("Lado 1: " + lado1);
        System.out.println("Lado 2: " + lado2);
        System.out.println("Lado 3: " + lado3);
    }

    // Método para calcular e retornar a área do triângulo usando a fórmula de Heron
    public double calcularArea() {
        double s = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }
}
