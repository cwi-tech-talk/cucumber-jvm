package cwi.talk;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( features = "classpath:cwi/talk/sempermissao" )
// features = "classpath:cwi/talk/sempermissao"
// features = "src/test/resources/cwi/talk/sempermissao"
public class ExecutorTest {

}
