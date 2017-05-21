package cwi.talk;

import cucumber.api.DataTable;
import cucumber.api.Delimiter;
import cucumber.api.Scenario;
import cucumber.api.Transpose;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cwi.talk.objetos.Barco;
import cwi.talk.objetos.DelacaoPremiada;

import java.util.List;

public class DataTableSteps {

    @Before
    public void before(Scenario scenario) {
        System.out.println("\n\n################################################");
        System.out.println("Cenário: " + scenario.getName());
    }

    @Dado("^que possuo os Power Rangers$")
    public void que_possuo_os_power_ranges(DataTable dataTable) {
        List<String> powerRangers = dataTable.topCells();
        for (String powerRanger : powerRangers) {
            System.out.println("Imprimindo os Power Rangers: " + powerRanger);
        }
    }

    @Dado("^que possuo os Power Rangers: (.+)$")
    public void que_possuo_os_pr(List<String> powerRangers) {
        for (String powerRanger : powerRangers) {
            System.out.println("Imprimindo os Power Rangers: " + powerRanger);
        }
    }

    @Dado("^que possuo as pessoas: (.+)$")
    public void que_possuo_as_pessoas(@Delimiter(value = ",\\s?|\\se\\s") List<String> pessoas) {
        for (String pessoa : pessoas) {
            System.out.println("Imprimindo as pessoas: " + pessoa);
        }
    }

    // A abordagem ruim para utilizar uma datatable complexa!
    @Dado("^que possuo os barcos ruins$")
    public void que_possuo_os_barcos_ruins(DataTable dataTable) {
        List<List<String>> dataTableRaw = dataTable.raw();
        for (List<String> linha : dataTableRaw) {
            for (String itemLinha : linha) {
                System.out.println(itemLinha);
            }
        }
    }

    // Essa abordaem ta sussa
    @Dado("^que possuo os barcos$")
    public void que_possuo_os_barcos(DataTable dataTable) {
        List<Barco> barcos = dataTable.asList(Barco.class);
        for (Barco barco : barcos) {
            System.out.println(barco.toString());
        }
    }

    @Dado("^que possuo as delações premiadas$")
    public void que_possuo_as_delacoes_premiadas(@Transpose List<DelacaoPremiada> delacoesPremiadas) {
        for (DelacaoPremiada delacaoPremiada : delacoesPremiadas) {
            System.out.println(delacaoPremiada.toString());
        }
    }
}
