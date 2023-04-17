package com.company;

public class Mamifero extends Animal implements Alimentavel{
    private int tempoGestacao;
    private String som;

    public Mamifero(String nome, int idade, String especie, boolean alimentado, String som){
        super(nome, idade, especie, alimentado);
        this.som = som;
    }

    public void setTempoGestacao(int tempoGestacao) {
        this.tempoGestacao = tempoGestacao;
    }

    public int getTempoGestacao() {
        return tempoGestacao;
    }

    @Override
    public String emitirSom() {
        return(som);
    }



    public void alimentar() {
        if(getAlimentado() == false) {
            setAlimentado(true);
        }
        else{
            System.out.println("Não foi possível alimentar o animal " + getNome() + " ,já está alimentado(a)");
        }
    }
}
