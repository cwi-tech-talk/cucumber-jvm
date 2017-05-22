package cwi.talk;

import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class Hooks {

	@Before
	public void before(Scenario scenario) {
		System.out.println("\nCenário: ".concat(scenario.getName()));
	}
}
