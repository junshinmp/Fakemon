package States.FakemonData;

import javafx.scene.image.Image;
import java.util.HashMap;

public class FakemonInfo {
    private Image pokemonImage;
    private int health;
    private String pokemonName;
    private HashMap<String, Move> moves;

    public FakemonInfo(String pokemonName, int health){
        this.pokemonName = pokemonName;
        this.health = health;
    }
}
