package Desafio_Cardapio;

public class Alimento {

    // Atributo

    private String nome;
    private String tipo;

    // Construtor

    public Alimento(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    // Enpsulamento

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
