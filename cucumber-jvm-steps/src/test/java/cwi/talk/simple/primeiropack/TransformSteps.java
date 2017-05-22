package cwi.talk.simple.primeiropack;

import cucumber.api.Transform;
import cucumber.api.java.pt.Dado;
import cwi.talk.LocalDateTransformer;
import cwi.talk.Transformer;
import cwi.talk.TransformerTransformer;

import java.time.LocalDate;

public class TransformSteps {

    @Dado("^converto a data (.+)$")
    public void converto_a_data_x(@Transform(value = LocalDateTransformer.class) LocalDate data) {
        System.out.println("\tData formatada: " + data.toString());
        System.out.println("\t" + data.getClass().getSimpleName());
    }

    @Dado("^tenho o transformer (.+)$")
    public void tenho_o_transformer(@Transform(value = TransformerTransformer.class) Transformer transformer) {
        System.out.println(transformer.toString());
    }
}
