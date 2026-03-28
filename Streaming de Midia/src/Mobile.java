public class Mobile implements Plataforma {
    @Override
    public void entregar(String titulo, String qualidade) {
        System.out.println("[Mobile] Reproduzindo '" + titulo + "' no app mobile em " + qualidade + ".");
    }
}