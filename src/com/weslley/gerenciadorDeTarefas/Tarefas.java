package com.weslley.gerenciadorDeTarefas;

public class Tarefas{
    private String titulo;
    private String descricao;

    public Tarefas(String titulo, String descricao){
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getDescricao(){
        return descricao;
    }
}