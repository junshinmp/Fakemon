package States.FakemonData;

import java.util.*;

import com.sun.source.tree.Tree;
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
    private final int id;
    private final String fakemonName;
    private final String element;
    private TreeMap<String, Move> moveList;

    public Fakemon(String fakemonName, int health, String element){
        this.fakemonName = fakemonName;
        this.health = health;
        this.element = element;

        level = INITIAL_LEVEL;
        xp = STARTING_XP;
        next_level_xp = NEXT_LEVEL_XP;
        moveList = new TreeMap<>();
        id = uniqueID;
        uniqueID++;
    }

    public int getHealth(){
        return health;
    }

    public String getElement(){return element;}

    public int getLevel(){return level;}

    public void addMove(String learnedMove, Move move){
        moveList.put(learnedMove, move);
    }

    public int useMove(String moveName) {
        System.out.println(fakemonName + " used " + moveName + "!\nIt did " + moveList.get(moveName).getDamage() + "!");
        return moveList.get(moveName).getDamage();
    }

    public void xpGain(int amt){
        int surplus;

        if(xp + amt > next_level_xp){
            surplus = xp + amt - next_level_xp;
            xp = surplus;
            next_level_xp += NEXT_LEVEL_XP;

            health += 250;
            level += 1;
        } else {
            xp += amt;
        }
    }

}
