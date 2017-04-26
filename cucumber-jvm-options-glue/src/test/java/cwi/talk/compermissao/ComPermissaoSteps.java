package cwi.talk.compermissao;

import cucumber.api.java.pt.Dado;

public class ComPermissaoSteps {
	
	@Dado("^faço login no sistema$")
	public void faco_login_no_sistema() {
		System.out.println("Fazendo login com permissão!");
	}

	@Dado("^realizo uma ação$")
	public void realizo_uma_acao() {
		System.out.println("Realizando ação com permissão!");
	}
	
	@Dado("^espero um resulado$")
	public void espero_um_resultado() {
		System.out.println("Resultado encontrado com permissão!");
	}

}
