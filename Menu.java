package Desafio_Cardapio;

public class Menu {

    // Atributo

    private Refeicao DiadaSemana;
    private Refeicao Turno;
    private Refeicao Refeicoes;

    // Construtor

    public Menu(Refeicao semana, Refeicao diadaSemana, Object o) {

        this.DiadaSemana = diadaSemana;
    }

    // Encapsulamento

    public Refeicao getDiadaSemana() {

        return DiadaSemana;
    }

    public void setDiadaSemana(Refeicao diadaSemana) {

        DiadaSemana = diadaSemana;

    }

    public Refeicao getTurno() {

        return Turno;
    }

    public void setTurno(Refeicao turno) {

        Turno = turno;
    }

    public Refeicao getRefeicoes() {

        return Refeicoes;
    }

    public void setRefeicoes(Refeicao refeicoes) {

        Refeicoes = refeicoes;
    }

}
