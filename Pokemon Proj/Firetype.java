import java.util.Random;

public class Firetype extends Pokemon{


    //constructor: intializes  name, atkpower, hp, and type to fire sets hp and maxhp to hp
    public Firetype(String n,int atk, int h){
      super(n, atk, h);
      setType("fire");
    }
    
    
    //randomly picks from "ember","fire blast", and "flamethrower" and returns that attackname.
    public String attackMoveName(){
      String list[] = {"ember", "fire blast", "flamethrower"};
      Random rand = new Random();
      int randomInteger = rand.nextInt(3);
      return list[randomInteger];


    }
    
    
    }
