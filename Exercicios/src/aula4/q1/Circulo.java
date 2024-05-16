package aula4.q1;

public class Circulo extends ObjetoGeometrico {
    double centroX, centroY;
    double raio;

    public void inicializar(double centroX, double centroY, double raio) {
        this.centroX = centroX;
        this.centroY = centroY;
        this.raio = raio;
    }

    public void mostrarDados() {
        System.out.println("Círculo:");
        System.out.println("Centro: (" + centroX + ", " + centroY + ")");
        System.out.println("Raio: " + raio);
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}
