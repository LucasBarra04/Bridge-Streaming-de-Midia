public class Filme extends Midia {
    private int duracaoMinutos;

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    @Override
    public void reproduzir() {
        System.out.println("Filme de " + duracaoMinutos + " min — iniciando...");
        plataforma.entregar(titulo,  "4K HDR");
    }
}
