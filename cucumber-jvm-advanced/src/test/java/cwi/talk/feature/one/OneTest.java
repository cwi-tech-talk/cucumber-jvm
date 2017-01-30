package cwi.talk.feature.one;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,
		glue = { "cwi.talk.feature.one" },
		features = { "src/test/resources/feature/one" })
public class OneTest {

}
