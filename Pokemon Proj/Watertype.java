import java.util.*;
public class Watertype extends Pokemon {

//constructor that intializes the name, atkpower, hp, and type to water sets hp and maxhp to hp
public Watertype(String n,int atk, int h){
  super(n, atk, h);
  setType("water");

  //code goes here 
  }


//randomly picks from "Watergun","Bubble", and "Hydro Pump" and returns them.
public String attackMoveName(){
  String list[] = {"Watergun", "Bubble", "Hydro Pump"};
  Random rand = new Random();
  int randomInteger = rand.nextInt(3);
  return list[randomInteger];
//code goes here
  
  }
}