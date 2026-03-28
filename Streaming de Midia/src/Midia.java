public abstract class Midia {
    protected Plataforma plataforma;
    protected String titulo;

    public void setPlataforma(Plataforma plataforma0) {
        this.plataforma = plataforma;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public abstract void reproduzir();
}