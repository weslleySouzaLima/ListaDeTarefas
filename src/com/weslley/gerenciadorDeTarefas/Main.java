package com.weslley.gerenciadorDeTarefas;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorDeTarefas gerenciadorDeTarefas = new GerenciadorDeTarefas();
        
        while (true) {
            System.out.println("Esolha uma opção:");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Remover tarefa");
            System.out.println("3. Listar tarefas");
            System.out.println("4. Sair");

            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                System.out.println("Digite o titulo da tarefa:");
                String titulo = scanner.nextLine();
                System.out.println("Digite a descrição da tarefa");
                String descricao = scanner.nextLine();
                Tarefas newTarefas = new Tarefas(titulo, descricao);
                gerenciadorDeTarefas.addTarefas(newTarefas);
                System.out.println("Tarefa adicionada com sucesso!");
                break;

                case 2:
                System.out.println("Digite o índice da tarefa a ser removida:");
                int index = scanner.nextInt();
                gerenciadorDeTarefas.removeTarefas(index);
                System.out.println("Tarefa removida com sucesso!");
                break;

                case 3:
                System.out.println("Lista de tarefas:");
                List<Tarefas> allTarefas = gerenciadorDeTarefas.getAllTarefas();
                for (int i = 0; i < allTarefas.size(); i++) {
                    Tarefas tarefas = allTarefas.get(i);
                    System.out.println(i + " . " + tarefas.getTitulo() + "-" + tarefas.getDescricao());
                }
                break;

                case 4:
                System.out.println("Saindo...");
                System.exit(0);

                default:
                System.out.println("Opção inválida! Tente novamente");
            }
        }
    }
}
