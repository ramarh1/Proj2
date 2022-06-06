import java.util.*;
public class Game {
    public static void main(String[] args) {
        Character sent_val = 's';
        int choice_num=0;
        int win = 0;
        int lost = 0;
        
       
        List<Pokemon> opponents = new ArrayList<Pokemon>();
        Pokemon chosen_one = new Pokemon();
        PokemonInventory pokemonInventory = new PokemonInventory();
        Pokedex pokedex = new Pokedex();
        Random randGen = new Random();

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome Trainer!");
        System.out.println("Please enter your name: ");
        String name = keyboard.nextLine();
        Trainer trainer = new Trainer(name);
        
        System.out.println("Welcome " + name + "!");

        boolean done = false;
        System.out.println("Pick a starting Pokemon by entering number:");
        System.out.println("1. Pikachu      3. Charizard\n2. Eevee        4. Bulbasaur");
        while(!done){
        try {
            choice_num = keyboard.nextInt();
            done = true;
            
        } catch (Exception e) {
            System.out.println("Please enter a valid number.");
            keyboard.next();
            continue;
            
            
            
        }
        
    }
        
        
        if(choice_num==1){
            System.out.println("You have chosen Pikachu as your starting Pokemon!");
            chosen_one = new Pokemon( "Pikachu", randGen.nextInt(72 - 50) + 50,  72,  112,  101,  "Electric");
            pokemonInventory.addPokemon(chosen_one);
            chosen_one.addMove( "Quick Attack",  8,  "Normal", 1);
            chosen_one.addMove( "Thunder Shock",  5,  "Electric", 2);
            chosen_one.addMove( "Discharge",  65,  "Electric", 3);
            chosen_one.addMove( "Fly",  80,  "Flying", 4);
            
        }
        else if(choice_num==2){
            System.out.println("You have chosen Eevee as your starting Pokemon!");
            chosen_one = new Pokemon( "Eevee", randGen.nextInt(106 - 50) + 50,  106,  104,  121,  "Evolution");
            pokemonInventory.addPokemon(chosen_one);
            chosen_one.addMove( "Quick Attack",  8,  "Normal", 1);
            chosen_one.addMove( "Tackle",  5,  "Normal", 2);
            chosen_one.addMove( "Dig",  100,  "Ground", 3);
            chosen_one.addMove( "Swift",  60,  "Normal", 4);
        }
        else if(choice_num==3){
            System.out.println("You have chosen Charizard as your starting Pokemon!");
            chosen_one = new Pokemon( "Charizard", randGen.nextInt(145 - 50) + 50, 145, 223, 176, "Fire");
            pokemonInventory.addPokemon(chosen_one);
            chosen_one.addMove( "Air Slash",  14,  "Flying", 1);
            chosen_one.addMove( "Fire Spin",  14,  "Fire", 2);
            chosen_one.addMove( "Dragon Claw",  50,  "Dragon", 3);
            chosen_one.addMove( "Fire Blast",  140,  "Fire", 4);
        }
        else if(choice_num==4){
            System.out.println("You have chosen Bulbasaur as your starting Pokemon!");
            chosen_one = new Pokemon( "Bulbasaur",  randGen.nextInt(89 - 50) + 50,  89,  118,  118,  "Poison");
            pokemonInventory.addPokemon(chosen_one);
            chosen_one.addMove( "Tackle",  5,  "Normal", 1);
            chosen_one.addMove( "Vine Whip",  7,  "Grass", 2);
            chosen_one.addMove( "Power Whip",  90,  "Grass", 3);
            chosen_one.addMove( "Seed Bomb",  55,  "Grass", 4);
        }
    
    
    
        while (!sent_val.equals('q')){
        Pokemon Abra = new Pokemon("Abra", randGen.nextInt(55 - 20) + 20, 55, 195, 103, "Psychic");
        Abra.addMove("Charge Beam", 8, "Electric", 1);
        Abra.addMove("Zen Headbutt", 12, "Psychic", 2);
        Abra.addMove("Psyshock", 65, "Psychic", 3);
        Abra.addMove("Shadow Ball", 100, "Ghost", 4);
        Pokemon Dewgong = new Pokemon("Dewgong", randGen.nextInt(166 - 100) + 100, 166, 139, 184, "Ice");
        Dewgong.addMove("Frost Breath", 10, "Ice", 1);
        Dewgong.addMove("Iron Tail", 15, "Steel", 2);
        Dewgong.addMove("Aurora Beam", 80, "Ice", 3);
        Dewgong.addMove("Blizzard", 130, "Ice", 4);
        Pokemon Mankey = new Pokemon("Mankey", randGen.nextInt(81-50)-50, 81, 148, 87, "Fighting");
        Mankey.addMove("Karate Chop", 8, "Fighting", 1);
        Mankey.addMove("Scratch", 6, "Normal", 2);
        Mankey.addMove("Brick Break", 40, "Fighting", 3);
        Mankey.addMove("Cross Chop", 50, "Fighting", 4);
        Pokemon Sandshrew = new Pokemon("Sandshrew", randGen.nextInt(98-50)+50, 98, 126, 145, "Ground");
        Sandshrew.addMove("Mudshot", 5, "Ground", 1);
        Sandshrew.addMove("Scratch", 6, "type", 2);
        Sandshrew.addMove("Dig", 100, "Ground", 3);
        Sandshrew.addMove("Rock Slide", 80, "Rock", 4);
        Pokemon Beedrill = new Pokemon("Beedrill",randGen.nextInt(123-100)+100, 123, 169, 150, "Bug");
        Beedrill.addMove("Infestation", 10, "Bug", 1);
        Beedrill.addMove("Poison Jab", 10, "Poison", 2);
        Beedrill.addMove("Aerial Ace", 55, "Fying", 3);
        Beedrill.addMove("Fell Stinger", 50, "Bug", 4);

        opponents.add(Abra);
        opponents.add(Dewgong);
        opponents.add(Mankey);
        opponents.add(Sandshrew);
        opponents.add(Beedrill);
        // MAKE HP RANDOMLY GENERATED WITH MIN AS 5 AND MAX AS MAX HP
        
        System.out.println("Choose your options!");
        System.out.println("-----MENU OPTIONS-----\nf- fight    t- Trainer Info\nr- run      pd- pokedex\ni- Personal Pokemon      q- quit");
        String menu_option = keyboard.next();

        if(menu_option.equalsIgnoreCase("f")){
            
            Pokemon random_opponent = opponents.get(randGen.nextInt(opponents.size()));
            String random_opp_name = random_opponent.getName();
            System.out.println("A wild " + random_opp_name + " appeared!\n");
            pokedex.addPokemon(random_opponent);
            String chosen_name = chosen_one.getName();

            System.out.println("-----THE BATTLE STARTS-----");
            while (!random_opponent.hasFainted() && !chosen_one.hasFainted()){
            
            

            Move random_move = random_opponent.getRandomMove();
            System.out.print("\n" + random_opp_name + " used " + random_move.getName() + ".\n" + chosen_name + " has taken damage.");
            int damage = (int) ((0.5 * random_move.getAttackPower() * (random_opponent.getAttack()/random_opponent.getDefense()))) + 1;
            chosen_one.takeDamage(damage);
            if(chosen_one.getHP()>0){
            System.out.println("\n" + chosen_one.getName() + "'s HP is " + chosen_one.getHP());
            }
            else{
                System.out.println("Oh no!! " + chosen_one.getName() + " has fainted.");
                System.out.println("You lost this battle!!!");
                System.out.println("Better luck next time.");
                lost++;
                trainer.setBattlesLost(lost);
                chosen_one.hasFainted();
                break;
            
            }
        
            
            System.out.println("-----CHOOSE A MOVE (type the name of move after list)-----");

            for (Move move : chosen_one.listMoves()) {
                System.out.println(move + "\n");
                
        
            }

            boolean terminated = false;
        
            int count = 1;
            while(!terminated){
                int chosen_move = 0;
                try {
                        chosen_move = keyboard.nextInt();
                } catch (Exception e) {

                    System.out.println("Please enter a valid number.");
                    keyboard.next();
                    continue;
                }
                
                
                for (Move move : chosen_one.listMoves()) {
                    Move move_used = move;
                    
                if (move.getID()==chosen_move){
                     
                     move_used = move;
                
                    System.out.println("\n" + chosen_one.getName() + " used " + move_used.getName() + ".\n" + random_opp_name + " has taken damage.");
                    int damage_dealt = (int) ((0.5 * move_used.getAttackPower() * (chosen_one.getAttack()/chosen_one.getDefense()))) + 1;
                    random_opponent.takeDamage(damage_dealt);
                    if(random_opponent.getHP()>0){
                    System.out.println(random_opponent.getName() + "'s HP is " + random_opponent.getHP());
                    terminated = true;
                    break;
                    
                    
                    }
                    else{
                        
                        System.out.println("Oh no!! " + random_opponent.getName() + " has fainted.\nYou won this battle!!!\n");
                        win++;
                        trainer.setBattlesWon(win);
                        random_opponent.hasFainted();
                        terminated = true;
                        
                      
                        
                    }
                }
            
                else if (!(chosen_move<=4 && chosen_move >= 1)){
                    
                    if(count<2)
                    System.out.println("Invalid number input. Please enter a number (1-4).");
                    count++;
                    continue;
                    
                }
            } 
        }

    }


        }
        else if(menu_option.equalsIgnoreCase("t")){
            System.out.println(trainer);
        }
        else if(menu_option.equals("r")){
            continue;
        }
        else if(menu_option.equalsIgnoreCase("i")){
            System.out.println("1. Print Pokemon Inventory\n2. Search Pokemon Inventory by name");
            int choice = keyboard.nextInt();
            if (choice==1){
                for (Pokemon p : pokemonInventory.getPokemon()) {
                    System.out.println("\n"+p);
                }
                //System.out.println(pokedex.getPokemon());
            }
            else if (choice==2){
                System.out.println("Enter name of Pokemon: ");
                String user_search = keyboard.next();
                for (Pokemon p : pokemonInventory.getPokemon()) {
                
                if (p.getName().equalsIgnoreCase(user_search)){
                    System.out.println("Pokemon Found.");
                    for (Pokemon p1 : pokemonInventory.searchName(user_search)) {
                       System.out.println("\n"+p1);
                   }
                   
                }
                else{
                    System.out.println("Unable to find Pokemon.");
                    break;
                }
            }
            }
        else{
            System.out.println("Please enter a valid number.");
            continue;
        }
        }
        else if(menu_option.equalsIgnoreCase("pd")){
            System.out.println("1. Print Pokedex\n2. Search Pokedex by name");
            int choice = keyboard.nextInt();
            if (choice==1){
                for (Pokemon p : pokedex.getPokemon()) {
                    System.out.println("\n"+p);
                }
                //System.out.println(pokedex.getPokemon());
            }
            else if (choice==2){
                System.out.println("Enter name of Pokemon: ");
                String user_search = keyboard.next();
                for (Pokemon p : pokedex.getPokemon()) {
                    
                
                
                if (p.getName().equalsIgnoreCase(user_search)){
                    System.out.println("Pokemon Found.");
                    for (Pokemon p1 : pokedex.searchName(user_search)) {
                       System.out.println("\n"+p1);
                   }
                   
                }
                else{
                    System.out.println("Unable to find Pokemon.");
                    break;
                }
                }}

            else{
                System.out.println("Please enter a valid number.");
                continue;
            }
    }
        
    
        else if(menu_option.equalsIgnoreCase("q")){
            sent_val = 'q';
            break;

        }
        else{
            System.out.println("Menu option not valid. Please enter a valid option!");
            continue;
        }
    }
}
}
