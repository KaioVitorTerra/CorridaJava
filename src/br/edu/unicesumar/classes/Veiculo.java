package src.br.edu.unicesumar.classes;

public abstract class Veiculo {

    private String nome;
    private Piloto piloto;
    private int velocidadeBase;

    public Veiculo(String nome, Piloto piloto, int velocidadeBase) {
        this.nome = nome;
        this.piloto = piloto;
        this.velocidadeBase = velocidadeBase;
    }

    public String getNome() {
        return nome;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public int getVelocidadeBase() {
        return velocidadeBase;
    }
}
