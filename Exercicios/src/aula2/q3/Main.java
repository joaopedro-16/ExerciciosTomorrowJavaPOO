package aula2.q3;


public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Camiseta", 29.99, 50);
        produto1.aumentarEstoque(10);
        produto1.diminuirEstoque(5);
        System.out.println("Informações do Produto 1:");
        produto1.exibirInformacoes();
    }
}