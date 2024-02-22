import java.util.Random;

public class Grasstype extends Pokemon{

    //constructor that intializes the name, atkpower, hp, and type to grass, sets hp and maxhp to hp
    public Grasstype(String n,int atk, int h){
      super(n, atk, h);
      setType("grass");
      
    //code goes here 
    }
    
    //randomly picks from "absorb","razor leaf", and "solar beam" and returns them.
    public String attackMoveName(){
      String list[] = {"absorbe", "razor leaf", "solar beam"};
      Random rand = new Random();
      int randomInteger = rand.nextInt(3);
      return list[randomInteger];
      //code goes here
    }
}