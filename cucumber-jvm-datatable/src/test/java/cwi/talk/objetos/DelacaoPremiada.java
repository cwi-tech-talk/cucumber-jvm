package cwi.talk.objetos;

public class DelacaoPremiada {
    private String delator;
    private Integer quantidadeDelatados, descontoPrisao, quantidadeRecebida;

    public String getDelator() {
        return delator;
    }

    public void setDelator(String delator) {
        this.delator = delator;
    }

    public Integer getQuantidadeDelatados() {
        return quantidadeDelatados;
    }

    public void setQuantidadeDelatados(Integer quantidadeDelatados) {
        this.quantidadeDelatados = quantidadeDelatados;
    }

    public Integer getDescontoPrisao() {
        return descontoPrisao;
    }

    public void setDescontoPrisao(Integer descontoPrisao) {
        this.descontoPrisao = descontoPrisao;
    }

    public Integer getQuantidadeRecebida() {
        return quantidadeRecebida;
    }

    public void setQuantidadeRecebida(Integer quantidadeRecebida) {
        this.quantidadeRecebida = quantidadeRecebida;
    }

    @Override
    public String toString() {
        return String.format("Delator: %s\n\tQuantidade de delatados: %s\n\tDesconto da prisão: %s\n\tQuantidade " +
                "recebida: U$ %s", delator, quantidadeDelatados, descontoPrisao, quantidadeRecebida);
    }
}
