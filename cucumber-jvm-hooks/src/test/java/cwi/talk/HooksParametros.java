package cwi.talk;

import cucumber.api.Scenario;
import cucumber.api.java.After;

public class HooksParametros {

    @After(timeout = 1000, value = "@timeout")
    public void afterComTimeout() throws InterruptedException {
        System.out.println("\tAfter com timeout de 1 segundo, irá falhar");
        Thread.sleep(2000);
    }

    @After
    public void afterScenario(Scenario scenario) {
        System.out.println(String.format("\t\tResultado do cenário %s : %s", scenario.getName(),
                scenario.getStatus().toUpperCase()));
    }
}
