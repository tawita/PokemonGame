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
 */
public class CommandParser{
	private PokemonFarm pokemonFarm;
        private Bag bag;
        private RandomPokemon randoms;
	private Scanner commandScanner;
	private boolean isRunning;
        private ArrayList<Pokemon> pokemonsBag;
	public CommandParser(PokemonFarm pokemonFarm){
		this.pokemonFarm = pokemonFarm;
                bag=new Bag();
		commandScanner = new Scanner(System.in);
		isRunning = false;
	}

	public void run(){
		isRunning = true;
		String command;

		System.out.println("Hello Pokemon Game");
		while(isRunning){
			System.out.print("\nWhat do you want? Type: ");
			command = commandScanner.next();
			// System.out.println("You type \'"+command+"\'");
			if(command.equals("quit")){
				isRunning = false;
				System.out.println("Good bye, See you next time.");
			}
			else if(command.equals("add"))
				this.addPokemon();
			else if(command.equals("list"))
				this.listPokemons();
			else if(command.equals("feed"))
				this.feedPokemons();
                        else if(command.equals("exercise"))
                                this.exercisePokemons();
                        else if(command.equals("fight"))
                                this.upLevel();
                        else if(command.equals("catch"))
                                this.catchPokemons();
		}

	}

	private void addPokemon(){
		//commandScanner.nextLine();
		// input name weight length
                System.out.print("Pokemon: ");
		String pokemonType =commandScanner.next();
                System.out.print("Pokemon name: ");
		String name =commandScanner.next();
                System.out.print("Pokemon weight: ");
		float weight =commandScanner.nextFloat();
                System.out.print("Pokemon stepLength: ");
		float stepLength =commandScanner.nextFloat();
               
                int level=1;
                
		if(pokemonType.equals("Eevee")){
			Eevee eevee = new Eevee(name, weight,stepLength,level);
			pokemonFarm.addPokemon(eevee);
		}
                else if(pokemonType.equals("Chansay")){
			Chansay chansay = new Chansay(name, weight, stepLength,level);
			pokemonFarm.addPokemon(chansay);
		}
                else if(pokemonType.equals("Charmander")){
			Charmander charmander = new Charmander(name, weight, stepLength,level);
			pokemonFarm.addPokemon(charmander);
		}

	}

	private void listPokemons(){
		System.out.println("==========================================");
		System.out.println("Pokemon List");
		System.out.println("==========================================");
                System.out.println("ในคอมมานก่อนใช้");
		this.pokemonFarm.list();
                System.out.println("ในคอมมานหลังใช้");
		System.out.println("==========================================");
	}

	private void feedPokemons(){
		System.out.print("Which pokemon do you want to feed? ");
		String name = this.commandScanner.next();
		if(name.equals("all")){
			this.pokemonFarm.feed("all");
		}
                else{
                        this.pokemonFarm.feed(name);
                }
	}

        private void exercisePokemons(){
            System.out.print("Which pokemon do you want to exercise? ");
		String name = this.commandScanner.next();
		if(name.equals("all")){
			this.pokemonFarm.exercise("all");
		}
                else{
                        this.pokemonFarm.exercise(name);
                }
        }
        private void upLevel(){
            System.out.print("Which pokemon do you want to fight? ");
		String name = this.commandScanner.next();
               if(name.equals("all")){
			this.pokemonFarm.fight("all");
		}
                else{
                        this.pokemonFarm.fight(name);
                }
       }
        
        private void catchPokemons(){
            
           
            int i=1;
            while(i==1){
                randoms = new RandomPokemon();

                System.out.print("What do you want find or quit ?: ");
                String ans= this.commandScanner.next();
                if(ans.equals("find")){
                    this.randoms.find();
                }
                else if(ans.equals("quit")){
                    
                    int length =(this.bag).getLength();
                   
           
                    for(i=0;i<length;i++){
                        
                        pokemonFarm.addPokemon(this.bag.getPoke(i)); 
                    }
               
                    i=0;
                }
            }
            
        }
}