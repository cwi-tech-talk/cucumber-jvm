package cwi.talk.sempermissao;

import cucumber.api.java.pt.Dado;

public class SemPermissaoSteps {
	
	@Dado("^faço login no sistema$")
	public void faco_login_no_sistema() {
		System.out.println("Fazendo login sem permissão!");
	}

	@Dado("^realizo uma ação$")
	public void realizo_uma_acao() {
		System.out.println("Realizando ação com sem permissão!");
	}
	
	@Dado("^espero um resulado$")
	public void espero_um_resultado() {
		System.out.println("Resultado encontrado sem permissão!");
	}

}
