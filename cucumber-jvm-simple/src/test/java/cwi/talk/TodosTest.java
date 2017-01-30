package cwi.talk;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true/*,
		glue = { "cwi.talk" },
		features = {"src/test/resources/cwi/talk/"} */)
public class TodosTest {

}
