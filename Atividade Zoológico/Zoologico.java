package com.company;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private List<Animal> animais = new ArrayList<>();

    public void adicionarAnimal(Animal animal){
        animais.add(animal);
    }
    public void listarAnimais(){
        System.out.println("A ficha dos animais é: ");
        System.out.println("");
        for(Animal animal : animais){
            System.out.println("Espécie: " + animal.getEspecie());
            System.out.println("Nome: " + animal.getNome());
            System.out.println("Idade: " + animal.getIdade());
            System.out.println("Está alimentado? " + animal.getAlimentado());
            System.out.println("Qual som faz? " + animal.emitirSom());
            System.out.println("");
        }
    }

    public void alimentarAnimais(){
        for(Animal animal: animais){
            animal.alimentar();
        }
    }

}
