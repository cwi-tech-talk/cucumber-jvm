package cwi.talk.objetos;

public class Barco {

    private String nomeBarco;
    private Integer tamanho, canhoes, tripulantes;

    public String getNomeBarco() {
        return nomeBarco;
    }

    public void setNomeBarco(String nomeBarco) {
        this.nomeBarco = nomeBarco;
    }

    public Integer getTamanho() {
        return tamanho;
    }

    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }

    public Integer getCanhoes() {
        return canhoes;
    }

    public void setCanhoes(Integer canhoes) {
        this.canhoes = canhoes;
    }

    public Integer getTripulantes() {
        return tripulantes;
    }

    public void setTripulantes(Integer tripulantes) {
        this.tripulantes = tripulantes;
    }

    @Override
    public String toString() {
        return String.format("Nome do barco: %s\n\tTamanho: %s\n\tQuantida de Canhões: %s\n\tCapacidade de " +
                        "tripulantes:%s",
                nomeBarco, tamanho, canhoes, tripulantes);
    }
}
