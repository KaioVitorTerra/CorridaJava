package src.br.edu.unicesumar.classes;

public class Main {
    public static void main(String[] args) { 
        Piloto piloto = new Piloto("Senna", 90);
        Carro carro = new Carro("F1", piloto, 300);
        System.out.println("Velocidade final: " + carro.calcularVelocidadeFinal());
    }
}
