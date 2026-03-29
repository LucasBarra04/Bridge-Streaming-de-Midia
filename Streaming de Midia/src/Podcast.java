public class Podcast extends Midia {
    private String apresentador;

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    @Override
    public void reproduzir() {
        System.out.println("Podcast com " + apresentador + " — iniciando...");
        plataforma.entregar(titulo, "Áudio 320kbps");
    }
}