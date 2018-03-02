/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemongame;
import java.util.*;
/**
 *
 * @author macbook
 */
public class PokemonFarm {
	private ArrayList<Pokemon> pokemons;
	public PokemonFarm(){
		pokemons = new ArrayList<Pokemon>();
	}

	public void addPokemon(Pokemon pokemon){
		pokemons.add(pokemon);
	}

	public void list(){
            System.out.println("ในฟามก่อน loop");
                for(Pokemon pokemon : pokemons){
                    System.out.println("ในฟามก่อนใช้");
			pokemon.print();
                        System.out.println("ในฟาม หลังใช้");
		}
	}

	public void feed(String pokemonName){
		if(pokemonName.equals("all")){
			for(Pokemon pokemon: pokemons){
                                System.out.println("loop each");
				pokemon.eat();
			}
		}
                else{
                        for(Pokemon pokemon: pokemons){
                            if(pokemon.getName().equals(pokemonName))
                                pokemon.eat();
                                break;
                        }
                }
	}
        public void exercise(String pokemonName){
		if(pokemonName.equals("all")){
			for(Pokemon pokemon: pokemons){
				pokemon.exercise();
			}
		}
                else{
                        for(Pokemon pokemon: pokemons){
                            if(pokemon.getName().equals(pokemonName))
                                pokemon.exercise();
                   
                                break;
                        }
                }
	}
         public void fight(String pokemonName){
		if(pokemonName.equals("all")){
			for(Pokemon pokemon: pokemons){
				pokemon.fight();
			}
		}
                else{
                        for(Pokemon pokemon: pokemons){
                            if(pokemon.getName().equals(pokemonName))
                                pokemon.fight();
                   
                                break;
                        }
                }
	}
}