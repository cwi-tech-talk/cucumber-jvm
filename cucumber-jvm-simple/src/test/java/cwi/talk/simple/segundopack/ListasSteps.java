package cwi.talk.simple.segundopack;

import java.util.ArrayList;
import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class ListasSteps {

	private List<String> lista = new ArrayList<String>();
	private List<PessoaDataTable> pessoas;

	@Dado("^que possuo a lista: (.*)$")
	public void que_possuo_a_lista(List<String> lista) {
		this.lista = lista;
		System.out.println("Guardando a lista");
	}

	@Entao("^imprimo os itens$")
	public void a_lista_se_mante() {
		System.out.println("Imprimindo itens da lista:");
		for (String item : lista) {
			System.out.println("\tItem: ".concat(item));
		}
		System.out.println("Fim da listagem");
	}

	@Quando("^que possuo os itens:$")
	public void que_possuo_os_itens(DataTable dataTable) {
		List<List<String>> listaRaw = dataTable.raw();
		for (List<String> list : listaRaw) {
			lista.add(list.get(0));
		}
	}

	@Quando("^que possuo a listagem:$")
	public void que_possuo_a_listagem(DataTable dataTable) {
		pessoas = dataTable.asList(PessoaDataTable.class);
	}
	
	@Entao("^listo as pessoas$")
	public void list_as_pessoas() {
		System.out.println("Imprimindo pessoas:");
		for (PessoaDataTable pessoa : pessoas) {
			System.out.println("\tNome: ".concat(pessoa.getNome()));
			System.out.println("\tIdade: ".concat(pessoa.getIdade().toString()));
			System.out.println("\tSexo: ".concat(pessoa.getSexo()));
		}
	}
}
