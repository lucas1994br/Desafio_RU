package Desafio_Cardapio;

public class Refeicao {

    // Atributo

    private Alimento Pratoprincipal;
    private Alimento Carnes;
    private Alimento Salada;
    private Alimento Acompanhamento;

    // Construtor

    public Refeicao(Alimento pratoprincipal, Alimento salada, Alimento acompanhamento, Alimento carnes) {
        this.Pratoprincipal = pratoprincipal;
        this.Carnes = carnes;
        this.Salada = salada;
        this.Acompanhamento = acompanhamento;
    }

    // Encapsulamento

    public Alimento getPratoprincipal() {
        return Pratoprincipal;
    }

    public void setPratoprincipal(Alimento pratoprincipal) {
        Pratoprincipal = pratoprincipal;
    }

    public Alimento getCarnes() {
        return Carnes;
    }

    public void setCarnes(Alimento carnes) {
        Pratoprincipal = carnes;
    }


    public Alimento getSalada() {
        return Salada;
    }

    public void setSalada(Alimento salada) {
        Salada = salada;
    }

    public Alimento getAcompanhamento() {
        return Acompanhamento;
    }

    public void setAcompanhamnto(Alimento acompanhamento) {
        Acompanhamento = acompanhamento;
    }
}

