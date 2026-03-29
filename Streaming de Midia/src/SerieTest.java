import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SerieTest {

    @Test
    void reproduzirDeveAcionarPlataforma() {
        Plataforma01 p = new Plataforma01();
        Serie s = new Serie();
        s.setTitulo("Breaking Bad");
        s.setTemporada(3);
        s.setEpisodio(7);
        s.setPlataforma(p);
        s.reproduzir();
        assertEquals(1, p.getChamadas());
    }

    @Test
    void reproduzirDeveEnviarTituloCorreto() {
        Plataforma01 p = new Plataforma01();
        Serie s = new Serie();
        s.setTitulo("Breaking Bad");
        s.setTemporada(3);
        s.setEpisodio(7);
        s.setPlataforma(p);
        s.reproduzir();
        assertEquals("Breaking Bad", p.getUltimoTitulo());
    }

    @Test
    void reproduzirDeveEnviarQualidadeFullHD() {
        Plataforma01 p = new Plataforma01();
        Serie s = new Serie();
        s.setTitulo("Breaking Bad");
        s.setTemporada(3);
        s.setEpisodio(7);
        s.setPlataforma(p);
        s.reproduzir();
        assertEquals("Full HD", p.getUltimaQualidade());
    }

    @Test
    void deveEstenderMidia() {
        Serie s = new Serie();
        assertTrue(s instanceof Midia);
    }

    @Test
    void mesmaTituloEmPlataformasDiferentes() {
        Plataforma01 mobile  = new Plataforma01();
        Plataforma01 smartTv = new Plataforma01();
        Serie s = new Serie();
        s.setTitulo("Breaking Bad");
        s.setTemporada(1);
        s.setEpisodio(1);

        s.setPlataforma(mobile);
        s.reproduzir();

        s.setPlataforma(smartTv);
        s.reproduzir();

        assertEquals("Breaking Bad", mobile.getUltimoTitulo());
        assertEquals("Breaking Bad", smartTv.getUltimoTitulo());
    }
}