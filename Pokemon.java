import java.util.*;
public class Pokemon {
    
    private String name;
    private int HP;
    private int maxHP;
    private int attack;
    private int defense;
    private String type;
    private boolean fainted;
    private List<Move> attacksKnown = new ArrayList<Move>();
    Random randGen = new Random();

    Pokemon(){
    name = "Default";
    HP = 0;
    maxHP = 0;
    attack = 0;
    defense = 0;
    type = "Normal";
    attacksKnown = new ArrayList<Move>(4);
   
    }
   

    Pokemon(String name, int HP, int maxHP, int attack, int defense, String type){
        this.name = name;
        this.HP = HP;
        this.maxHP = maxHP;
        this.attack = attack;
        this.defense = defense;
        this.type = type;
    }

    void takeDamage(int damage){
        this.HP = this.HP - damage;

    }

    boolean hasFainted(){
        if (this.HP <= 0){
            fainted = true;
        }
        else{
            fainted = false;
        }
        return fainted;
    }



    String getName(){
        return name;
    }

    String getType(){
        return type;
    }

    int getHP(){
        return this.HP;
    }

    int getAttack(){
        return this.attack;
    }
    int getDefense(){
        return this.defense;
    }

    void addMove(String name, int attackPower, String type, int id){
        attacksKnown.add(new Move(name, attackPower, type, id));
    }

    Move getRandomMove(){
        return attacksKnown.get(randGen.nextInt(attacksKnown.size()));

    }

    void removeMove(){}

    List<Move> listMoves(){
        return attacksKnown;
        
    }

    public String toString(){
        return "Pokemon: " + getName() + "\nType: " + getType() + "\nMax HP: " + this.maxHP;
    }

}

