import java.util.*;
public class Pokemon{
    private String name;
    private int atkpower;
    private int hp;
    private String type;
    private int maxhp;
    private boolean faint = false;

    
  
    //constructor that intiates name to "", atkpower to 0, hp and maxHP to 0 and type to "normal"
    public Pokemon(){
      name = "";
      atkpower = 0;
      hp = 0;
      maxhp = 0;
      type = "normal";
    }
  
  //constructor that intiates name, atkpower, and hp and maxHP (hp and maxHP should be set to h)
    public Pokemon(String n, int atk, int h){
      name = n;
      atkpower = atk;
      hp = h;
      maxhp = h;
    }
    //sets type of pokemon
    public void setType(String t){//code goes here
      type = t;
    }
  
    //returns type of pokemon
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
  
    /* attack should call the getAttackpwr method and decrease the hp of the enemy pokemon. 
    Attack damage formula is equal to attack* effectiveness multiplier super effective is *2 damage, 
    not very effective is divide by 2, same type equals *1 multiplier
    */
      //grass>water
      //water> fire
      //fire > grass
      //Should also call the attackMoveName() method which will randomly pick an attack name 
      // that is used. Should print out how much damage was done, if it was super effective 
      // or not very effective, and how much hp the enemy pokemon has after the attack.
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
    //randomly picks from list of "potion","super potion",and "hyper potion"
    //potion heals 30, super potion heals 50, and hyper potion heals 100
    //pokemon should not be healed over max hp, if it is, set it to the maxhp. 
    // Should print out "pokemon used (insert potion). It now has (insert hp) hp.
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
  
  //format should be name:attack:hp:type
    public String toString(){
      String result = "" + name + ":" + atkpower + ":" + hp + ":" + type;
      return result;      
    }
}