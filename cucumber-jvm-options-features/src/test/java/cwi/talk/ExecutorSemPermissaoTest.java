package cwi.talk;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( features = "classpath:cwi/talk/sempermissao" )
// features = "classpath:cwi/talk/sempermissao"
// features = "src/test/resources/cwi/talk/sempermissao"
public class ExecutorSemPermissaoTest {


    @Before
    public void beforeJunit() {
        System.out.println("Preparação para testes sem permissão de acesso!");
    }

    @After
    public void afterJunit() {
        System.out.println("Finalização para testes sem permissão de acesso!");
    }
}
