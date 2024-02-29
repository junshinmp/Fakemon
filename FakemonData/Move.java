package States.FakemonData;

public class Move{
    private final String moveName;
    private final int chance;
    private final int damage;
    private final String elemental;

    public Move(String moveName, int chance, int damage, String elemental){
        this.moveName = moveName;
        this.chance = chance;
        this.damage = damage;
        this.elemental = elemental;
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

    public String getElemental(){return elemental;}
    @Override
    public String toString(){
        return moveName + "\n" + damage + damage + "\n" + "Chance of hitting: " + chance;
    }
}
