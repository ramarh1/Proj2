public  class Move {
    
    private String name;
    private int attackPower;
    private String type;
    private int id;


    Move(){
        name = "None";
        attackPower = 0;
        type = "None";
    }

    Move(String name, int attackPower, String type, int id){
        this.name = name;
        this.attackPower = attackPower;
        this.type = type;
        this.id = id;
    }

    String getName(){
        return name;
    }
    

    int getAttackPower(){
        return attackPower;
    }


    String getType(){
        return type;
    }

    int getID(){
        return id;
    }

    void setID(int id){
        this.id = id;
    }

    public String toString(){
        return getID() + "." + " Name: " + getName() + "\nAttack Power: " + getAttackPower() + "\nType: " + getType();
    }

}








/*
MOVE UML Diagram
----------------
- attackPower : int
- name : String
- type : String
-----------------
+ Move()
+ Move(name : String, attackPower : int, type : String)
+ getName() : String
+ getAttackPower() : int
+ getType() : String
+ toString() : String

HOW TO ADD NEW MOVE
Move m1 = new Move("slam", 30, "electric")
electro ball = 30 damage, electric
thunder smash = 75
quick attack = 15


*/