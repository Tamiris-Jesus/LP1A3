package com.company;

public class Reptil extends Animal {
    private double temperaturaCorporal;
    private String som;

    public Reptil(String nome, int idade, String especie, boolean alimentado, double temperaturaCorporal, String som) {
        super(nome, idade, especie, alimentado);
        this.temperaturaCorporal = temperaturaCorporal;
        this.som = som;
    }

    public void setTemperaturaCorporal(double temperaturaCorporal) {
        this.temperaturaCorporal = temperaturaCorporal;
    }

    public double getTemperaturaCorporal() {
        return temperaturaCorporal;
    }

    public String emitirSom() {
        return (som);
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
