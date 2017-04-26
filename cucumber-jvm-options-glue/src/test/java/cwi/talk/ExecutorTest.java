package cwi.talk;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(glue = { "cwi/talk/compermissao" } )
// glue = { "classpath:cwi.talk.compermissao" }
// glue = { "cwi.talk.compermissao" }
// glue = { "cwi/talk/compermissao" }
public class ExecutorTest {

}
