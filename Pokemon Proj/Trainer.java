public class Trainer{
  public Pokemon leadpokemon;
  public String name;
  public Pokemon[] party;
  public Trainer(String n){
    name = n;
    leadpokemon = null;
    party = new Pokemon[3];
  }
  public void pickLead(Trainer t,Pokemon p){

    if (p.getFaintstatus()==false){
    leadpokemon=p;
    System.out.println(t+"'s  lead pokemon is: "+leadpokemon);
  }
  }
  public void fight(Trainer et,Pokemon enemy){
    System.out.println(" "+enemy.getName()+" has "+enemy.getHp()+" hp. ");
    leadpokemon.attack(enemy);
    System.out.println(enemy.getName()+" "+enemy.getHp()+ "hp. ");

    if(enemy.getHp() <= 0) {
      enemy.setFaintstatus(); // turns faintStatus to true
      for(Pokemon nonFainted : et.party) {
        if(nonFainted.getFaintstatus() == false) {
          et.leadpokemon = nonFainted;
          System.out.println("Enemy pokemon fainted, switching.");
          break;
        } else {
          et.leadpokemon = null;
        }
      }

    }
    
  }
  public void potion(){
      leadpokemon.heal();
  }
  public String toString(){
    return name;
  }
}
