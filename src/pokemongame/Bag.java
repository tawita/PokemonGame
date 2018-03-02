/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemongame;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author macbook
 */
public class Bag {
    private ArrayList<Pokemon> pokemonsBag;

	public Bag(){
            pokemonsBag = new ArrayList<Pokemon>();
       
	}

	public void addPokemon(Pokemon pokemon){
            pokemonsBag.add(pokemon);
	}  
        
        public int getLength(){
            return pokemonsBag.size();
            
        }
        
        public Pokemon getPoke(int i){
           return pokemonsBag.get(i);

        }
}
