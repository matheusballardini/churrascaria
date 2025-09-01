package com.java.sga.model;



public abstract class Integrantes{
    private int id;
    private String nome;
    private int idade;

//Construtor

    public Integrantes(int id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
}




//Getters e Setters

    public String getNome() {
        return nome;
}

    public int getIdade() {
        return idade;
}

    public int getId() {
        return id;
}

    public void setNome(String nome) {
        this.nome = nome;
}

    public void setIdade(int idade) {
        this.idade = idade;
}

    public void setId(int id) {
        this.id = id;
}
}

