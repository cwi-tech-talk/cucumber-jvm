package cwi.talk;

public class Transformer {

    public Transformer(String nome, String faccao) {
        this.nome = nome;
        this.faccao = faccao;
    }

    private String nome, faccao;

    public String getNome() {
        return nome;
    }

    public String getFaccao() {
        return faccao;
    }

    @Override
    public String toString() {
        return String.format("\t\tNome do Transformer: %s\n\t\tFacção: %s", nome, faccao);
    }
}
