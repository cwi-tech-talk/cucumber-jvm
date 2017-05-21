package cwi.talk;

import cucumber.api.junit.Cucumber;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class MeusTest {

    // Apenas os Hooks do JUnit de BeforeClass e AfterClassdentro do arquivo de Test serão chamados
    @Before
    public void beforeJunit() {
        System.out.println("\tBefore do JUnit que será ignorado dentro do arquivo 'MeuTest'!");
    }

    @After
    public void afterJunit() {
        System.out.println("\tAfter do JUnit que será ignorado dentro do arquivo 'MeuTest'!");
    }

    @BeforeClass
    public static void beforeClassJunit() {
        System.out.println("\tBefore Class do JUnit dentro do arquivo 'MeuTest'!");
    }

    @AfterClass
    public static void afterClassJunit() {
        System.out.println("\tAfter Class do JUnit dentro do arquivo 'MeuTest'!");
    }
}
