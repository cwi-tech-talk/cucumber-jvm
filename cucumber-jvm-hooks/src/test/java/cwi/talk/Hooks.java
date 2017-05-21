package cwi.talk;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    @org.junit.BeforeClass
    public static void beforeClassJunit() {
        System.out.println("\tEsse BeforeClass do JUnit nunca será chamado");
    }

    @org.junit.Before
    public void beforeJunit() {
        System.out.println("\tEsse Before do JUnit nunca será chamado");
    }

    @Before
    public void before() {
        System.out.println("\tBefore do Cucumber!");
    }

    @Before(order = 4)
    public void beforeOrder4() {
        System.out.println("\tBefore com ordem 4 do Cucumber!");
    }

    @Before(order = 5)
    public void beforeOrder5() {
        System.out.println("\tBefore com ordem 5 do Cucumber!");
    }

    @After
    public void after() {
        System.out.println("\tAfter do Cucumber!");
    }

    @After(order = 4)
    public void afterOrder4() {
        System.out.println("\tAfter com ordem 4 do Cucumber!");
    }

    @After(order = 5)
    public void afterOrder5() {
        System.out.println("\tAfter com ordem 5 do Cucumber!");
    }
}
