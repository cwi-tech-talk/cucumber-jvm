package cwi.talk.feature.generic;

import cucumber.api.java.pt.Dado;

public class ForAllSteps {

	@Dado("^que faço uma ação genérica$")
	public void que_faco_uma_acao_generica() {
		System.out.println("Ação genérica");
	}
}
