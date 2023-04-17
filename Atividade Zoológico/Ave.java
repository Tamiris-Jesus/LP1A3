package com.company;

public class Ave extends Animal {
    private String tipoBico;
    private String som;

    public Ave(String nome, int idade, String especie, boolean alimentado, String tipoBico, String som) {
        super(nome, idade, especie, alimentado);
        this.tipoBico = tipoBico;
        this.som = som;
    }

    public void setTipoBico(String tipoBico) {
        this.tipoBico = tipoBico;
    }

    public String getTipoBico() {
        return tipoBico;
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
