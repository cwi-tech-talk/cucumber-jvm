package cwi.talk.compermissao;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class PermissoesSteps {
	
	@Dado("^faço login no sistema como admin$")
	public void faco_login_no_sistema_como_admin() {
		System.out.println("Fazendo login como admin!");
	}
	
	@Dado("^faço login no sistema com read only$")
	public void faco_login_no_sistema_com_readonly() {
		System.out.println("Fazendo login com usuário com permissão de read only");
	}

	@Quando("^clico em um botão$")
	public void clico_em_um_botao() {
		System.out.println("Realizando ação com permissão!");
	}

	@Quando("^verifico o estado do botão$")
	public void verifico_o_estado_do_botao() {
		System.out.println("Verificando o estado do botão");
	}
	
	@Entao("^a tela é recarregada$")
	public void espero_um_resultado() {
		System.out.println("Resultado encontrado com permissão!");
	}
	
	@Entao("^o botão esta desabilitado$")
	public void o_botao_esta_desabilitado() {
		System.out.println("O botão está desabilitado");
	}

}
