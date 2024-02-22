import java.util.*;
class Main {
public static void main(String[] args){
Watertype Squirtle = new Watertype("Squirtle",30, 170);
Firetype Charmander = new Firetype("Charmander",40,140);
Grasstype Bulbasaur = new Grasstype("Bulbasaur",60,120);
Watertype Poliwag = new Watertype("Poliwag",20, 170);
Firetype Vulpix = new Firetype("Vulpix",30,140);
Grasstype Oddish = new Grasstype("Oddish",50,120);
Watertype Lapras = new Watertype("Lapras",20, 170);
Firetype Growlithe = new Firetype("Growlithe",30,140);
Grasstype Snivy = new Grasstype("Snivy",40,120);
Pokemon[] glista= {Bulbasaur,Oddish,Snivy};
Pokemon[] flista= {Charmander,Vulpix,Growlithe};
Pokemon[] wlista= {Squirtle, Poliwag, Lapras};
Trainer player1= new Trainer("player1");
Trainer player2= new Trainer("player2");
Scanner console = new Scanner(System.in);

System.out.print("Pick a grass pokemon: 0:Bulbasaur 1:Oddish, 2:Snivy");

player1.party[0]=glista[console.nextInt()];
System.out.print("Pick a fire pokemon: 0:Charmander, 1:Vulpix, 2:Growlithe");
player1.party[1]=flista[console.nextInt()];
System.out.print("Pick a water pokemon: 0:Squirtle, 1:Poliwag, 2:Lapras");
player1.party[2]=wlista[console.nextInt()];

player2.party[0]=glista[(int)(Math.random()*3)];
player2.party[1]=flista[(int)(Math.random()*3)];
player2.party[2]=wlista[(int)(Math.random()*3)];
  //System.out.println("Your pokemon are:");
  //System.out.println(Arrays.toString(player1.party));
  System.out.println("Your opponent's pokemon are:");
  System.out.println(Arrays.toString(player2.party));
 player2.pickLead(player2,player2.party[(int)(Math.random()*3)]);
  System.out.println("Pick a lead pokemon 0: "+player1.party[0]+"1: "+player1.party[1]+"2: " + player1.party[2]);
 
  player1.pickLead(player1,player1.party[console.nextInt()]);
  System.out.println("opponent's lead pokemon is "+player2.leadpokemon);

boolean gamestate= true;

while (gamestate == true){
  if (player1.leadpokemon==null){
    gamestate= false;
    System.out.print("Game over for player 1");
  }
  else if (player2.leadpokemon==null){
    gamestate= false;
      System.out.print("Game over for player 2");
      }
  else{
  System.out.print("What do you want do to? fight,potion, or switch? ");
  String choice=console.next();
  if (choice.equals("fight")){
    player1.fight(player2,player2.leadpokemon);}
  else if(choice.equals("switch")){
    for(int i=0;i<player1.party.length;i++){
      System.out.print(i+" "+player1.party[i]);
    }

    int c2=console.nextInt();
    player1.pickLead(player1,player1.party[c2]);
  }
  else if (choice.equals("potion"))
  {player1.potion();
  }
  else{
      System.out.print("invalid choice");
  }
  player2.fight(player1, player1.leadpokemon);
}
}
}}