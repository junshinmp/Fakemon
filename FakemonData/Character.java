package States.FakemonData;

import java.util.*;

public class Character {
    private ArrayList<Fakemon> fakemonsList;
    private HashMap<String, Items> inventory;
    private final String characterName;
    private int currency;

    public Character(String characterName){
        this.characterName = characterName;
        fakemonsList = new ArrayList<>();
        inventory = new HashMap<>();
        currency = 500;
    }

    public Character(String characterName, ArrayList<Fakemon> opponentFakemon, HashMap<String, Items> possibleDrops){
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

    public void newItem(Items collected){
        if(inventory.get(collected) != null){
            inventory.get(collected)
        }
    }

}
