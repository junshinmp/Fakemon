package States.FakemonData;

public class Move{
    private final String moveName;
    private final int chance;
    private final int damage;

    public Move(String moveName, int chance, int damage){
        this.moveName = moveName;
        this.chance = chance;
        this.damage = damage;
    }

    public int getDamage(){
        return damage;
    }

    public int getChance(){
        return chance;
    }

    public String getMoveName(){
        return moveName;
    }

    @Override
    public String toString(){
        return moveName + "\n" + Damage + damage + "\n" + "Chance of hitting: " + chance;
    }
}
