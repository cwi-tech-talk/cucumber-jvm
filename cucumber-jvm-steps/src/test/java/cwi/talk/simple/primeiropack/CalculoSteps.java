package cwi.talk.simple.primeiropack;

import org.junit.Assert;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class CalculoSteps {
	private Integer resultado = 0;
	private Integer num1;
	private Integer num2;

	@Dado("^tenho os números (\\d+) e (\\d+)$")
	public void possuo_o_numero_x_e_y(Integer num1, Integer num2) {
		this.num1 = num1;
		this.num2 = num2;
		System.out.println(String.format("\tTenho so números %s e %s", num1, num2));
	}

	@Quando("^faço (\\d+) mais (\\d+)$")
	public void faco_x_mais_y(Integer num1, Integer num2) {
		System.out.println(String.format("\tSoma de %s mais %s", num1, num2));
		resultado = num1 + num2;
	}

	@Quando("^faço a soma deles$")
	public void faco_a_soma_deles() {
		System.out.println(String.format("\tSomando %s mais %s", num1, num2));
		resultado = num1 + num2;
	}

	@Entao("^o resultado é (\\d+)$")
	public void o_resultado_e_x(Integer soma) {
		System.out.println("\tO resultado do passo é de " + soma);
		System.out.println("\tO resultado da soma feita é de " + resultado);
		Assert.assertEquals(soma, resultado);
	}

	@Quando("^faço (\\d) pontos?$")
	public void faco_x_ponto(Integer pontos) {
		System.out.println("\tQuantidade pontos: ".concat(pontos.toString()));
	}
	
	@Quando("^faço (\\d) iteraç(?:ão|ões)$")
	public void faco_x_iteracao(Integer iteracao) {
		System.out.println("\tQuantidade iterações: ".concat(iteracao.toString()));
	}
}
