package com.company;

public abstract class Animal implements Alimentavel{
    private String nome;
    private int idade;
    private String especie;
    private boolean alimentado;

    public Animal(String nome, int idade, String especie, boolean alimentado){
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
        this.alimentado = alimentado;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setAlimentado(boolean alimentado) {
        this.alimentado = alimentado;
    }

    public boolean getAlimentado(){
        return alimentado;
    }
    public abstract String emitirSom();

}

