package States.FakemonData;

import java.util.*;

public class Character {
    private ArrayList<Fakemon> fakemonsList;
    private ArrayList<Items> inventory;
    private final String characterName;

    public Character(String characterName){
        this.characterName = characterName;
        fakemonsList = new ArrayList<>();
        inventory = new ArrayList<>();
    }

    public Character(String characterName, ArrayList<Fakemon> opponentFakemon, ArrayList<Items> possibleDrops){
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

}
