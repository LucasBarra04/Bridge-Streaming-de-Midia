public class Serie extends Midia {
    private int temporada;
    private int episodio;

    public void setTemporada(int temporada) { this.temporada = temporada; }
    public void setEpisodio(int episodio)   { this.episodio = episodio; }

    @Override
    public void reproduzir() {
        System.out.println("Série — T" + temporada + "E" + episodio + " — iniciando...");
        plataforma.entregar(titulo, "Full HD");
    }
}