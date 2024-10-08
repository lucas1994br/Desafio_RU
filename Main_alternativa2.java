package Desafio_Cardapio;

import java.util.Scanner;

public class Main_alternativa2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        CardapioSemanal cardapioSemanal = new CardapioSemanal();


        String[] diasDaSemana = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta"};

        // Loop para coletar dados do usuário para cada dia da semana

        for (String dia : diasDaSemana) {
            System.out.println("Digite o prato principal para " + dia + ": ");
            String pratoPrincipalNome = entrada.nextLine();
            Alimento pratoPrincipal = new Alimento(pratoPrincipalNome, "Prato Principal");

            System.out.println("Digite o carnes para " + dia + ": ");
            String carnesNome = entrada.nextLine();
            Alimento Carnes = new Alimento(carnesNome, "Carnes");


            System.out.println("Digite a salada para " + dia + ": ");
            String saladaNome = entrada.nextLine();
            Alimento salada = new Alimento(saladaNome, "Salada");

            System.out.println("Digite o acompanhamento para " + dia + ": ");
            String acompanhamentoNome = entrada.nextLine();
            Alimento acompanhamento = new Alimento(acompanhamentoNome, "Acompanhamento");

            // Criando a refeição para o dia

            Refeicao refeicao = new Refeicao(pratoPrincipal, Carnes, salada, acompanhamento);
            cardapioSemanal.adicionarRefeicao(dia, refeicao);
            System.out.println(); // Linha em branco para separar os dias
        }

        // Imprimindo o cardápio semanal
        cardapioSemanal.imprimirCardapio();

        // Fechando o scanner
        entrada.close();
    }
}
