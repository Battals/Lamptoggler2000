package demo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
            Scanner input = new Scanner(System.in);
Lamp lampe1 = new Lamp("Lampe 1", false);
Lamp lampe2 = new Lamp("Lampe 2", false);
Lamp lampe3 = new Lamp("Lampe 3", false);
Lamp lampe4 = new Lamp("Lampe 4", false);
Lamp lampe5 = new Lamp("Lampe 5", false);
Lamp selectedLamp = null;

while (true){
            System.out.println(lampe1);
            System.out.println(lampe2);
            System.out.println(lampe3);
            System.out.println(lampe4);
            System.out.println(lampe5);

        System.out.println("Pick a number from 1-5 for the lamp you want to switch on/off");
        int userinput = input.nextInt();
        if (userinput == 1){
        selectedLamp = lampe1;}

     else if (userinput == 2) {
        selectedLamp = lampe2;
    } else if (userinput == 3) {
        selectedLamp = lampe3;
    } else if (userinput == 4) {
        selectedLamp = lampe4;
    } else if (userinput == 5) {
        selectedLamp = lampe5;

    }
    selectedLamp.trykPåKontakt();
}}}