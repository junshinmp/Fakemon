package States.FakemonData;

import java.util.*;

public class Character {
    private ArrayList<Fakemon> userList;
    private String characterName;

    public Character(String characterName){
        this.characterName = characterName;
        userList = new ArrayList<Fakemon>();
    }

    public ArrayList<Fakemon> getUserList(){
        return userList;
    }

    public String getCharacterName(){
        return characterName;
    }

    public void caughtFakemon(Fakemon caught){
        userList.add(caught);
    }

    public void

}
