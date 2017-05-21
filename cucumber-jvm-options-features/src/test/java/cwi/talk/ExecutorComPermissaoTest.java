package cwi.talk;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( features = "classpath:cwi/talk/compermissao" )
// features = "classpath:cwi/talk/compermissao"
// features = "src/test/resources/cwi/talk/compermissao"
public class ExecutorComPermissaoTest {

    @Before
    public void beforeJunit() {
        System.out.println("Preparação para testes com permissão de acesso!");
    }

    @After
    public void afterJunit() {
        System.out.println("Finalização para testes com permissão de acesso!");
    }
}
