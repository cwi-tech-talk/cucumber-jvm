package cwi.talk.feature.otherpackage;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,
		glue = { "cwi.talk.feature.generic", "cwi.talk.feature.one" },
		features = { "src/test/resources/feature/other" })
public class HooksTest {

	@Before
	public static void beforeJunit() {
		System.out.println("Before do JUnit");
	}

	@After
	public static void afterJunit() {
		System.out.println("After do JUnit");
	}

	@BeforeClass
	public static void beforeClassJunit() {
		System.out.println("BeforeClass do JUnit");
		shutdownHook();
	}

	@AfterClass
	public static void afterClassJunit() {
		System.out.println("\nAfterClass do JUnit");
	}
	
	public static void shutdownHook() {
		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				System.out.println("Ação no Shutdown hook ");
			}
		});
	}
}
