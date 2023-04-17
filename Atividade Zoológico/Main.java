package com.company;

public class Main {

    public static void main(String[] args) {
	// criando animais
        Mamifero ma = new Mamifero("Amendoim", 2, "Bezerro", false, "Muuu");
        Ave aa = new Ave("Blue", 7, "Arara", false, "Curvo", "reco-reco");
        Reptil ra = new Reptil("Avelã", 5, "Jacaré", false, 30.2, "Nhec Nhec");

        Zoologico zoologico = new Zoologico();
        zoologico.adicionarAnimal(ma);
        zoologico.adicionarAnimal(aa);
        zoologico.adicionarAnimal(ra);
        zoologico.listarAnimais();
        zoologico.alimentarAnimais();
        zoologico.listarAnimais();
        zoologico.alimentarAnimais();
    }
}
