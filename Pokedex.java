import java.util.*;

public class Pokedex {
    
    static List<Pokemon> list = new ArrayList<Pokemon>();
    boolean pokemon_in_list;

    void addPokemon(Pokemon pokemon){
        list.add(pokemon);

    }

    public List<Pokemon> searchName(final String name){
        List<Pokemon> existingPokemon = new ArrayList<Pokemon>();

        for(final Pokemon p: list){
            if(p.getName().contains(name)){
                existingPokemon.add(p);
            }
        }
        return existingPokemon;
    }



    List<Pokemon> getPokemon(){
        return list;
    }



}
