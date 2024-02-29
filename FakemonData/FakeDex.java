package States.FakemonData;

import java.util.HashMap;

public class FakeDex {
    private HashMap<Integer, Fakemon> fakemonDataBase;

    public FakeDex(){
        fakemonDataBase = new HashMap<>();
    }

    public void process(String filename){
        // Loop that goes through fakemon file and creates all Fakemon objects to be put into database
    }
}
