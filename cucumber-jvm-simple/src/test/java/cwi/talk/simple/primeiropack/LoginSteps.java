package cwi.talk.simple.primeiropack;

import cucumber.api.java.pt.Dado;

public class LoginSteps {

	@Dado("^que faço login no sistema$")
	public void que_faco_login_no_sistema() {
		System.out.println("Fazendo login no sistema");
	};

	@Dado("^que sou um usuário (\\w+)$")
	public void que_sou_um_usurio_x(String usuario) {
		System.out.println("Fazendo login no sistema ".concat(usuario));
	}

	@Dado("^que estou com (.+)$")
	public void que_estou_com_x(String usuario) {
		System.out.println("Estou com ".concat(usuario));
	}

	@Dado("^que faço acesso com perfil (admin|peão)$")
	public void que_faco_acesso_com_perfil_x(String perfil) {
		if (perfil.equals("admin"))
			System.out.println("Fazendo login no sistema com perfil de ".concat("Administrador"));
		else
			System.out.println("Fazendo login no sistema com perfil ".concat("sem acesso a nada"));
	}

}
