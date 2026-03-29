public class Plataforma01 implements Plataforma {
    private String ultimoTitulo;
    private String ultimaQualidade;
    private int chamadas = 0;

    @Override
    public void entregar(String titulo, String qualidade) {
        this.ultimoTitulo = titulo;
        this.ultimaQualidade = qualidade;
        this.chamadas++;
    }

    public String getUltimoTitulo()    { return ultimoTitulo; }
    public String getUltimaQualidade() { return ultimaQualidade; }
    public int getChamadas()           { return chamadas; }
}