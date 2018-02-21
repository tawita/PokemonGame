/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemongame;

/**
 *
 * @author macbook
 */
public class Random {
    private Pokemon pokemon;
    private Charmander charmander;
    private Eevee eevee;
    private Chansey chansey;
    float r=(float)Math.random();
    private String name;
    private float weight;
    private float stepLength;
    private int level;
    
    public RandomPokemon(name,weight,stepLength){
        this.name = name;
        this.level =level;
        this.stepLength=stepLength;
        this.weight=weight;
        if(r<0.3){
            charmander = new Charmander(name, weight, stepLength);
        }
        else if(r>=0.3 && r<0.6){
            eevee = new Eevee(name, weight, stepLength);
        }
        else {
            chansey = new Chansey(name, weight, stepLength);   
        }
    }
    
    public Pokemon randomGetPokemon(){
        if(r<0.3){
            return  charmander;
        }
        else if(r>=0.3&&r<0.6){
            return  eevee;
        }
        else{
            return  chansey;
    }
        
    public float randomGetMood(){
        return pokemon.getMood();
    }

    private void randomGetGene(String name, float weight, float stepLength, int level) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
