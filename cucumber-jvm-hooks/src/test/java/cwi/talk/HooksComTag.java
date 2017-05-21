package cwi.talk;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksComTag {

    @Before(value = "@prioridade1")
    public void beforeTag1() {
        System.out.println("\tBefore Cucumber da tag @prioridade1");
    }

    @Before(value = "@prioridade2")
    public void beforeTag2() {
        System.out.println("\tBefore Cucumber da tag @prioridade2");
    }

    @Before(value = "@prioridade3")
    public void beforeTag3() {
        System.out.println("\tBefore Cucumber da tag @prioridade3");
    }

    @After(value = "@prioridade1")
    public void afterTag1() {
        System.out.println("\tAfter Cucumber da tag @prioridade1");
    }

    @After(value = "@prioridade2")
    public void afterTag2() {
        System.out.println("\tAfter Cucumber da tag @prioridade2");
    }

    @After(value = "@prioridade3")
    public void afterTag3() {
        System.out.println("\tAfter Cucumber da tag @prioridade3");
    }

}
