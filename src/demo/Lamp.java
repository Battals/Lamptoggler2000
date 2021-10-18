package demo;

import java.util.ArrayList;

public class Lamp {
    boolean onOrOff;
    String name;
    public static ArrayList<Lamp> lampList = new ArrayList<>();


    public Lamp(String name, boolean onOrOff) {
        this.name = name;
        this.onOrOff = onOrOff;
    }


    public String toString() {
        if (!onOrOff) {
            return (name + " er slukket");
        } else if (onOrOff == true) ;
        return (name + " er tændt");
    }

    public void trykPåKontakt() {
        if (onOrOff == true) {
            onOrOff = false;
        } else {
            onOrOff = true;
        }
    }

    public static void printHelp() {
        System.out.println("Commands available are: ");
        System.out.println("""
                \t q - to quit the lamptoggler
                \t y -                
                \t l - to get lamp list and status
                \t a - to add a new lamp
                \t r - to remove a lamp
                \t t - to toggle an existing lamp
                \t ? - to check status for an existing lamp""");
    }
    public static ArrayList<Lamp> getlampList(){
        return lampList;
    }


public void removeLamp(Lamp x){
    Lamp.lampList.remove(x);

}
public void addLamp(Lamp z){
   Lamp.lampList.add(z);
}
}


