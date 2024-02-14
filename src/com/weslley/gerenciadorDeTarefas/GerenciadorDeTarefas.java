package com.weslley.gerenciadorDeTarefas;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeTarefas {
    private List<Tarefas> Tarefas;

    public GerenciadorDeTarefas() {
        Tarefas = new ArrayList<>();
    }

    public void addTarefas(Tarefas tarefa) {
        Tarefas.add(tarefa);
    }

    public void removeTarefas(int index) {
        Tarefas.remove(index);
    }

    public List<Tarefas> getAllTarefas() {
        return Tarefas;
    }
}
