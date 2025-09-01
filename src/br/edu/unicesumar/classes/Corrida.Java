
public class Corrida {
    private Pista pista;
    private List<Veiculo> veiculos;
    public Corrida(Pista pista, List<Veiculo> veiculos) {
        this.pista = pista;
        this.veiculos = veiculos;
    }
    public Corrida(Pista pista, List<Veiculo> veiculos) {
        this.pista = pista;
        this.veiculos = veiculos;
    }
    public void iniciar() {
        System.out.println(" Corrida iniciada!");
        boolean corridaAtiva = true;
        Veiculo vencedor = null;
        while (corridaAtiva) {
            for (Veiculo v : veiculos) {
                v.correr();
                System.out.println(v.getPiloto().getNome() + " (" + v.getNome() + ") percorreu " +
                        v.getDistanciaPercorrida() + "/" + pista.getComprimento() + " metros.");
                if (v.getDistanciaPercorrida() >= pista.getComprimento()) {
                    vencedor = v;
                    corridaAtiva = false;
                    break;
                }
            }

            System.out.println("---------------------------");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    System.out.println(" Vencedor: " + vencedor.getPiloto().getNome() + " com o " + vencedor.getNome() + "!");
  }
}


