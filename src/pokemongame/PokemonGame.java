/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemongame;
import java.io.*;
import java.util.*;
/**
 *
 * @author macbook
 * 
 */
public class PokemonGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PokemonFarm pokemonFarm = new PokemonFarm();
	CommandParser commandParser = new CommandParser(pokemonFarm);
	commandParser.run();
    }
    
}
