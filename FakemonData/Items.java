package States.FakemonData;

public class Items {
    private final String name;
    private final String change;
    private final int alter;

    public Items(String name, String change, int alter){
        this.name = name;
        this.change = change;
        this.alter = alter;
    }

    public int getAlter(){
        return alter;
    }

    public String getName(){
        return name;
    }

    public String effect(){
        return change;
    }

    @Override
    public String toString(){
        String unique;
        if(alter < 0) {unique = " removing " + alter;} else { unique = " adding " + alter; }
        if(change.equals("health")){unique += " health.";} else {unique += " damage.";}

        return "The " + name + " has a " + change + " effect, " + unique;
    }
}
