package Desafio_Cardapio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        CardapioSemanal cardapio = new CardapioSemanal();

        String[] dias = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta"};

        boolean avancar = true;
        while(avancar) {
            System.out.println("--- Carpádio Bom Sabor ---");
            System.out.println("1. Adicionar carpádio");
            System.out.println("2. Imprimir carpádio");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int escolha = entrada.nextInt();
            entrada.nextLine();

            switch (escolha) {
                case 1:
                    for(String dia : dias) {

                        // Adicionar Prato principal

                        System.out.println("Digite o prato principal para " + dia + ": ");
                        String pratoPrincipalNome = entrada.nextLine();
                        Alimento pratoPrincipal = new Alimento(pratoPrincipalNome, "Prato Principal");

                        // Adicionar Carnes

                        System.out.println("Digite o carnes para " + dia + ": ");
                        String carnesNome = entrada.nextLine();
                        Alimento Carnes = new Alimento(carnesNome, "Carnes");

                        // Adicionar Salada

                        System.out.println("Digite a salada para " + dia + ": ");
                        String saladaNome = entrada.nextLine();
                        Alimento salada = new Alimento(saladaNome, "Salada");

                        // Adicionar Acompanhamento

                        System.out.println("Digite o acompanhamento para " + dia + ": ");
                        String acompanhamentoNome = entrada.nextLine();
                        Alimento acompanhamento = new Alimento(acompanhamentoNome, "Acompanhamento");

                        // Instancia Refeicao

                        Refeicao refeicao = new Refeicao(pratoPrincipal, Carnes, salada, acompanhamento);
                        cardapio.adicionarRefeicao(dia, refeicao);
                        System.out.println();
                    }
                    break;
                case 2:
                    cardapio.imprimirCardapio();
                    break;
                case 3:
                    avancar = false;
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }
        entrada.close();
    }
}
