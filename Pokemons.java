package com.mycompany.pokemons;

import java.util.Scanner;

public class Pokemons {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Quem é esse Pokemon?");
        String nome = ler.nextLine();
        
        System.out.println("Qual o tipo do Pokemon?");
        String tipo = ler.nextLine();
        
        Pokemon novoPokemon = new Pokemon(nome, tipo);

        Falar(novoPokemon.getNome(), novoPokemon.getTipo());
    }

    public static void Falar(String nome, String tipo) {
        System.out.println("Meu nome é: " + nome + " e sou do tipo " + tipo + ".");
    }
}


class Pokemon {
    private String nome;
    private String tipo;    
    
    public Pokemon(String nome,String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
