package cwi.talk;

public class TransformerTransformer extends cucumber.api.Transformer<Transformer> {
    @Override
    public cwi.talk.Transformer transform(String transformerName) {
        switch (transformerName) {
            case "Bumblebee":
            case "Jazz":
            case "Ironhide":
            case "Ratchet":
            case "Optimus Prime":
                return new Transformer(transformerName, "Autobots");
            default:
                return new Transformer(transformerName, "Decepticon");
        }
    }
}
