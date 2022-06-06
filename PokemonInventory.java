import java.util.*;

class PokemonInventory extends Pokedex{
    static List<Pokemon> list = new ArrayList<Pokemon>();
    

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
