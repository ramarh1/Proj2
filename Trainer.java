import java.text.SimpleDateFormat;
import java.util.Locale;

public class Trainer {
    private final String name;
    private int battlesWon;
    private int battlesLost;
    

    Trainer(final String user_name){
        this.name = user_name;

    }



    public String getName(){
        return name;
    }
    
    void setBattlesWon(int battlesWon){
        this.battlesWon = battlesWon;
    }

    int getBattlesWon(){
        return this.battlesWon;
    }

    void setBattlesLost(int battlesLost){
        this.battlesLost = battlesLost;
    }

    int getBattlesLost(){
        return this.battlesLost;
    }

    String weekday_name = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(System.currentTimeMillis());;

    public String toString(){
        return "-----Trainer Info-----\nHappy " + weekday_name + " " + getName() + "!\nPokemon Quantity: " + PokemonInventory.list.size() + "\nBattles Won: " + getBattlesWon() + "\nBattles Lost: " + getBattlesLost();
    }

}
