import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FilmeTest {

    private Filme criarFilme() {
        Plataforma01 p = new Plataforma01();
        Filme f = new Filme();
        f.setTitulo("Interestelar");
        f.setDuracaoMinutos(169);
        f.setPlataforma(p);
        return f;
    }

    @Test
    void reproduzirDeveAcionarPlataforma() {
        Plataforma01 p = new Plataforma01();
        Filme f = new Filme();
        f.setTitulo("Interestelar");
        f.setDuracaoMinutos(169);
        f.setPlataforma(p);
        f.reproduzir();
        assertEquals(1, p.getChamadas());
    }

    @Test
    void reproduzirDeveEnviarTituloCorreto() {
        Plataforma01 p = new Plataforma01();
        Filme f = new Filme();
        f.setTitulo("Interestelar");
        f.setDuracaoMinutos(169);
        f.setPlataforma(p);
        f.reproduzir();
        assertEquals("Interestelar", p.getUltimoTitulo());
    }

    @Test
    void reproduzirDeveEnviarQualidade4K() {
        Plataforma01 p = new Plataforma01();
        Filme f = new Filme();
        f.setTitulo("Interestelar");
        f.setDuracaoMinutos(169);
        f.setPlataforma(p);
        f.reproduzir();
        assertEquals("4K HDR", p.getUltimaQualidade());
    }

    @Test
    void deveEstenderMidia() {
        Filme f = new Filme();
        assertTrue(f instanceof Midia);
    }

    @Test
    void deveTrocarPlataformaSemAlterarConteudo() {
        Plataforma01 p1 = new Plataforma01();
        Plataforma01 p2 = new Plataforma01();
        Filme f = new Filme();
        f.setTitulo("Interestelar");
        f.setDuracaoMinutos(169);
        f.setPlataforma(p1);
        f.reproduzir();

        f.setPlataforma(p2);
        f.reproduzir();

        assertEquals("Interestelar", p2.getUltimoTitulo());
        assertEquals(1, p1.getChamadas());
        assertEquals(1, p2.getChamadas());
    }
}