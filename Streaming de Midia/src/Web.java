public class Web implements Plataforma {
    @Override
    public void entregar(String titulo, String qualidade) {
        System.out.println("[Web] Reproduzindo '" +titulo + "' no navegador em " + qualidade + ".");
    }
}
