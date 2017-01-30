package cwi.talk.feature.otherpackage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,
		glue = { "cwi.talk.feature.generic", "cwi.talk.feature.one" },
		features = { "src/test/resources/feature/other" })
public class HooksTest {

}
