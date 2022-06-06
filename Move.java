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
