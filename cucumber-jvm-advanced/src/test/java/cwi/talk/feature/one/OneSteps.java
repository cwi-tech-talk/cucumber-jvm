package cwi.talk.feature.one;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class OneSteps {

	
	@Dado("^que faço uma ação$")
	public void faco_uma_acao() {
		System.out.println("Faço uma ação " + this.getClass().toString());
	}
	
	@Entao("^espero uma reação$")
	public void espero_uma_reacao() {
		System.out.println("Espero uma reação " + this.getClass().toString());
	}
	
	@Quando("^específico OneSteps$")
	public void especifico_one_steps() {
		System.out.println("Passo especifico do OneSteps");
	}
}
