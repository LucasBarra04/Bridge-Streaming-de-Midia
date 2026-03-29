import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PodcastTest {

    @Test
    void reproduzirDeveAcionarPlataforma() {
        Plataforma01 p = new Plataforma01();
        Podcast pod = new Podcast();
        pod.setTitulo("Flow Games");
        pod.setApresentador("Davy Jones");
        pod.setPlataforma(p);
        pod.reproduzir();
        assertEquals(1, p.getChamadas());
    }

    @Test
    void reproduzirDeveEnviarTituloCorreto() {
        Plataforma01 p = new Plataforma01();
        Podcast pod = new Podcast();
        pod.setTitulo("Flow Games");
        pod.setApresentador("Davy Jones");
        pod.setPlataforma(p);
        pod.reproduzir();
        assertEquals("Flow Games", p.getUltimoTitulo());
    }

    @Test
    void reproduzirDeveEnviarQualidadeAudio() {
        Plataforma01 p = new Plataforma01();
        Podcast pod = new Podcast();
        pod.setTitulo("Flow Games");
        pod.setApresentador("Davy Jones");
        pod.setPlataforma(p);
        pod.reproduzir();
        assertEquals("Áudio 320kbps", p.getUltimaQualidade());
    }

    @Test
    void deveEstenderMidia() {
        Podcast pod = new Podcast();
        assertTrue(pod instanceof Midia);
    }
}