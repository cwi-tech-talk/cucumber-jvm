package cwi.talk;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;

public class MeusSteps {

    @Before(order = 1)
    public void before(Scenario scenario) {
        System.out.println("Cenário: " + scenario.getName());
    }

    @Dado("^um passo qualquer$")
    public void um_passo_qualquer() {
        System.out.println("\t\tAquele passo qualquer");
    }
}
