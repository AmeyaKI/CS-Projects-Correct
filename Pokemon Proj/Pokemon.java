import java.util.*;
public class Pokemon{
    private String name;
    private int atkpower;
    private int hp;
    private String type;
    private int maxhp;
    private boolean faint = false;

    
  
    //constructor: intiates name to "", atkpower to 0, hp and maxHP to 0 and type to "normal"
    public Pokemon(){
      name = "";
      atkpower = 0;
      hp = 0;
      maxhp = 0;
      type = "normal";
    }
  
  //constructor: intiates name, atkpower, and hp and maxHP (hp and maxHP should be set to h)
    public Pokemon(String n, int atk, int h){
      name = n;
      atkpower = atk;
      hp = h;
      maxhp = h;
    }
    // "Setter": sets type of pokemon
    public void setType(String t){//code goes here
      type = t;
    }
  
    // "Getter": returns type of pokemon
    public String getType(){
      return type;
    }
    //returns name of pokemon
    public String getName(){
      return name;
    }
    //returns attack
    public int getAttackpwr(){
      return atkpower;
    }
    //returns hp of pokemon
    public int getHp(){
      return hp;
    }
    //sets hp of pokemon
    public void setHp(int h1){
      hp = h1;
    }
    //returns the maxHP of the pokemon
    public int getMaxHp(){
      return maxhp;
    }
    public boolean getFaintstatus(){
      return faint;
    }
    public void setFaintstatus(){
      faint= true;
    }
    // attack
    public void attack(Pokemon enemy){
      int damage;
      if(getType().equals("fire") && enemy.getType().equals("fire")) {
        damage = atkpower;
        enemy.setHp(enemy.getHp() - damage);
        System.out.println("You used " + attackMoveName() + "and did " + damage + " damage.");
      }
      if(getType().equals("fire") && enemy.getType().equals("grass")) {
        damage = atkpower*2;
        enemy.setHp(enemy.getHp() - damage);
        System.out.println("You used " + attackMoveName() + "and did " + damage + " damage.");
      }
      if(getType().equals("fire") && enemy.getType().equals("water")) {
        damage = atkpower/2;
        enemy.setHp(enemy.getHp() - damage);
        System.out.println("You used " + attackMoveName() + "and did " + damage + " damage.");
      }

      if(getType().equals("water") && enemy.getType().equals("water")) {
        damage = atkpower*2;
        enemy.setHp(enemy.getHp() - damage);
        System.out.println("You used " + attackMoveName() + "and did " + damage + " damage.");
      }
      if(getType().equals("water") && enemy.getType().equals("fire")) {
        damage = atkpower*2;
        enemy.setHp(enemy.getHp() - damage);
        System.out.println("You used " + attackMoveName() + "and did " + damage + " damage.");
      }
      if(getType().equals("water") && enemy.getType().equals("grass")) {
        damage = atkpower/2;
        enemy.setHp(enemy.getHp() - damage);
        System.out.println("You used " + attackMoveName() + "and did " + damage + " damage.");
      }

      if(getType().equals("grass") && enemy.getType().equals("grass")) {
        damage = atkpower;
        enemy.setHp(enemy.getHp() - damage);
        System.out.println("You used " + attackMoveName() + "and did " + damage + " damage.");
      }
      if(getType().equals("grass") && enemy.getType().equals("water")) {
        damage = atkpower*2;
        enemy.setHp(enemy.getHp() - damage);
        System.out.println("You used " + attackMoveName() + "and did " + damage + " damage.");
      }
      if(getType().equals("grass") && enemy.getType().equals("fire")) {
        damage = atkpower/2;
        enemy.setHp(enemy.getHp() - damage);
        System.out.println("You used " + attackMoveName() + "and did " + damage + " damage.");
      }
    }
    

    public String attackMoveName(){
      return "tackle";
    }
    // heals
    public void heal(){
      String potions[]={"potion", "super potion","hyper potion"};
      Random rand = new Random();
      int randomInteger = rand.nextInt(3);
      if(potions[randomInteger].equals("potion")){ 
        if(30+hp < maxhp) {
          setHp(getHp() + 30);
        } else{
          setHp(maxhp);
        }
      }
      if(potions[randomInteger].equals("super portion")) {
        if(50+hp < maxhp) {
          setHp(getHp() + 50);
        } else {
          setHp(maxhp);
        }
      }
      if(potions[randomInteger].equals("hyper portion")) {
        if(100 + hp < maxhp) {
          setHp(getHp() +100);
        } else {
          setHp(maxhp);
        }
      }
    }
  
    public String toString(){
      String result = "" + name + ":" + atkpower + ":" + hp + ":" + type;
      return result;      
    }
}
