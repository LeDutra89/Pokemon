package com.mycompany.pokemon;

import java.util.Scanner;

public class Pokemon {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       
       System.out.println("Digite o nome do Pokemon");
       String nome = ler.nextLine();
       System.out.println("Digite o poder do Pokemon");
       String poder = ler.nextLine();
    
        Pokemons pokemon = new Pokemons(nome, poder);
        Pokemon.Falar(nome, poder);
    }
      public static void Falar(String nome, String poder){
      System.out.println("Eu sou " + nome + " e meu poder é " + poder);
          
      }

    static class Pokemons {
                                 
    private String nome;
    private String poder;
    
   
    
public Pokemons(String nome, String poder) {
        this.nome = nome;
        this.poder = poder;
}
 public String getNome() {
        return nome;
    }
 public String getPoder() {
     return poder;
 }
  public void setNome(String nome) {
        this.nome = nome;
    }
  public void setPoder(String poder) {
        this.poder = poder;
    }
}
}


