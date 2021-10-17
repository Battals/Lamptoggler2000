package demo;

import java.util.Scanner;

public class Lamp{
boolean onOrOff;
String name;

public Lamp(String name, boolean onOrOff){
this.name = name;
this.onOrOff = onOrOff;
}

public String toString(){
if (!onOrOff){
return (name + " er slukket");
} else if (onOrOff);
return (name + " er tændt");
}
public void trykPåKontakt(){
if (onOrOff == true){
    onOrOff = false;
} else {
    onOrOff = true;
}
}


}




