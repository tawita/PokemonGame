/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemongame;
import java.util.Random; 
import java.util.Scanner;
/**
 *
 * @author macbook
 */
public class RandomPokemon {
    private Scanner sc = new Scanner(System.in);
    private Bag  bag;
    Random rand = new Random(); 
    
    public void find(){
        
        String name[] = {"eevee","charmander","chansey"};
        String type = name[rand.nextInt(3)];
        System.out.println("Pokemon is "+ type);
        
        catchMon(type);
        
        
    }
    
    private void catchMon(String type){
        
        int mood = rand.nextInt(10)+1;
        int ball = selectBall();
        int result = 0;
        if(ball==1){
            result = mood*8;
        }
        else if(ball==2){
            result = mood*9; 
        }
        else if(ball==3){
            result = mood*10; 
        }
        
        if(result >= 50){
            System.out.println("Success");
             bag = new Bag();
             addPokemon(type);
             
        }else{
            System.out.println("Fail");
        }
        
        
    }
    
    private int selectBall(){
        System.out.println("\nSelect Ball:");
        System.out.println("Type 1 is Pokeball");
        System.out.println("Type 2 is Greatball");
        System.out.println("Type 3 is Ultraball");
        int ball = sc.nextInt();
        return ball;
    }
    
    	private void addPokemon(String type){
                //sc.nextLine();
                System.out.print("name :");
		String name = sc.next();
                System.out.print("weight :");
		float weight = sc.nextFloat();
                System.out.print("step length :");
		float stepLength = sc.nextFloat();
                int level=(int)Math.random()*10;
                

            switch(type){
                case "eevee":
                    Eevee eevee = new Eevee(name, weight, stepLength,level);
                    bag.addPokemon(eevee);
                    break;
                case "chansey":
                    Chansey chansey = new Chansey(name, weight, stepLength,level);
                    bag.addPokemon(chansey);
                    break;
                case "charmander": 
                    Charmander charmander = new Charmander(name, weight, stepLength,level);
                    bag.addPokemon(charmander);
                    break;
                default:
                    break;
            }

	}
    
}
