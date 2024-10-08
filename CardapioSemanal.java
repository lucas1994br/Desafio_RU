package Desafio_Cardapio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CardapioSemanal {

    private Map<String, Refeicao> cardapio;

    // Construtor
    public CardapioSemanal() {

        cardapio = new HashMap<>();
    }

    // Metodo para adicionar uma refeição ao cardápio

    public void adicionarRefeicao(String diaDaSemana, Refeicao refeicao) {
        cardapio.put(diaDaSemana, refeicao);
    }

    // Metodo para o cardápio semanal

    public void imprimirCardapio() {
        System.out.println("Cardápio Semanal:");
        for (Map.Entry<String, Refeicao> entry : cardapio.entrySet()) {
            String dia = entry.getKey();
            Refeicao refeicao = entry.getValue();
            System.out.println(dia + ":");
            System.out.println("  Prato Principal: " + refeicao.getPratoprincipal().getNome());
            System.out.println("  Carnes: " + refeicao.getCarnes().getNome());
            System.out.println("  Salada: " + refeicao.getSalada().getNome());
            System.out.println("  Acompanhamento: " + refeicao.getAcompanhamento().getNome());
            System.out.println();
        }
    }

    public void add(boolean b) {
    }
}
