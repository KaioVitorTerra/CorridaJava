package src.br.edu.unicesumar.classes;
    public class Piloto {
    private String nome;
    private int habilidade;

    public Piloto(String nome,int habilidade){
        this.nome = nome;
        this.habilidade = habilidade;
    
    }
    
    public String getNome(){
        return nome;
    }

    public int getHabilidade(){
        return habilidade;
    }
}
