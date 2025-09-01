package src.br.edu.unicesumar.classes;

public class Carro extends Veiculo {

    public Carro(String nome, Piloto piloto, int velocidadeBase) {
        super(nome, piloto, velocidadeBase);
    }
    public int calcularVelocidadeFinal() {
    
        return getVelocidadeBase() + (getPiloto().getHabilidade() / 10);
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + getNome() + '\'' +
                ", piloto=" + getPiloto() +
                ", velocidadeBase=" + getVelocidadeBase() +
                ", velocidadeFinal=" + calcularVelocidadeFinal() +
                '}';
    }
}

