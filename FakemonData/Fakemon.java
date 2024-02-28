package States.FakemonData;

import java.util.*;
import javafx.scene.image.Image;

public class Fakemon{
    public static final int INITIAL_LEVEL = 0;
    public static final int STARTING_XP = 0;
    public static final int NEXT_LEVEL_XP = 1000;
    public static int uniqueID = 0;
    private Image fakemonImage;
    private int health;
    private int xp;
    private int level;
    private int next_level_xp;
    private int id;
    private String fakemonName;
    private String elemental;
    private HashMap<String, Move> moves;

    public FakemonInfo(String fakemonName, int health){
        this.fakemonName = fakemonName;
        this.health = health;
        level = INITIAL_LEVEL;
        xp = STARTING_XP;
        next_level_xp = NEXT_LEVEL_XP;
        id = uniqueID;
        uniqueID++;
    }

    @Override
    public int hashCode(){
        return id;
    }

    public int getHealth(){
        return health;
    }

    public

    public void xpGain(int amt){
        int surplus;

        if(xp + amt > next_level_xp){
            surplus = xp + amt - next_level_xp;
            xp = surplus;
            next_level_xp += NEXT_LEVEL_XP;
        } else {
            xp += amt;
        }

    }
}
