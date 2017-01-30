package cwi.talk.feature.generic;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before(order = 1)
	public void before1(Scenario scenario) {
		System.out.println("\nCenário: ".concat(scenario.getName()));
		System.out.println("Eu sou um Before em ordem 1");
	}
	
	@Before(order = 2)
	public void before2() {
		System.out.println("Eu sou um Before em ordem 2");
	}
	
	@Before(order = 3, value = "@tagGeral")
	public void before3() {
		System.out.println("Eu sou um Before em ordem 3");
		System.out.println("Before em Tag geral");
	}
	
	@Before("@tagEspecifica")
	public void beforeTagEspecifica() {
		System.out.println("Before @tagEspecifica");
	}
	
	@After("@tagEspecifica")
	public void afterTagEspecifica() {
		System.out.println("After @tagEspecifica");
	}
	
	@After(order = 1)
	public void after1() {
		System.out.println("Eu sou um after em ordem 1");
	}
	
	@After(order = 2)
	public void after2() {
		System.out.println("Eu sou um after em ordem 2");
	}

}
