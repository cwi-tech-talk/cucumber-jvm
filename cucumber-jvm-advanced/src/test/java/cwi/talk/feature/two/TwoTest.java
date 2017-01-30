package cwi.talk.feature.two;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,
		glue = { "cwi.talk.feature.two" },
		features = { "src/test/resources/feature/two" })
public class TwoTest {

}
