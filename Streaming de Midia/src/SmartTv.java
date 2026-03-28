public class SmartTv implements Plataforma {
    @Override
    public void entregar(String titulo, String qualidade) {
        System.out.println("[SmartTv] Reproduzindo '" + titulo + "' na Smart TV em " + qualidade + ".");
    }
}