package States.FakemonData;

import java.util.*;

public class Character {
    private ArrayList<Fakemon> fakemonsList;
    private HashMap<Items, Integer> inventory;
    private final String characterName;
    private int currency;

    public Character(String characterName){
        this.characterName = characterName;
        fakemonsList = new ArrayList<>();
        inventory = new HashMap<>();
        currency = 500;
    }

    public Character(String characterName, ArrayList<Fakemon> opponentFakemon, HashMap<Items, Integer> possibleDrops){
        this.characterName = characterName;
        fakemonsList = opponentFakemon;
        inventory = possibleDrops;
    }

    public ArrayList<Fakemon> getUserList(){
        return fakemonsList;
    }

    public String getCharacterName(){
        return characterName;
    }

    public void caughtFakemon(Fakemon caught){
        fakemonsList.add(caught);
    }

    public int getCurrency(){return currency;}

    public void alterCurrency(int amt){currency += amt;}

    public void useItem(Fakemon curr, Items item){}

    public void newItem(Items collected){
        inventory.merge(collected, 1, Integer::sum);
    }

}
