package demo;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Lamp lampe1 = new Lamp("Lampe 1", false);
        Lamp lampe2 = new Lamp("Lampe 2", false);
        Lamp lampe3 = new Lamp("Lampe 3", false);
        Lamp lampe4 = new Lamp("Lampe 4", false);
        Lamp lampe5 = new Lamp("Lampe 5", false);
        Lamp lampe6 = new Lamp("Lampe 6", false);
        Lamp lampe7 = new Lamp("Lampe 7", false);
        Lamp lampe8 = new Lamp("Lampe 8", false);
        Lamp lampe9 = new Lamp("Lampe 9", false);
        Lamp lampe10 = new Lamp("Lampe 10", false);
        Lamp selectedLamp = null;

        Lamp.lampList.add(lampe1);
        Lamp.lampList.add(lampe2);
        Lamp.lampList.add(lampe3);
        Lamp.lampList.add(lampe4);
        Lamp.lampList.add(lampe5);

        boolean running = true;
        System.out.println("Welcome to LampToggler 3000");
        Lamp.printHelp();
        while (running) {
            Scanner input = new Scanner(System.in);
            String userinput = input.nextLine();

            switch (userinput) {

                case "h":
                    Lamp.printHelp();
                    break;
                case "q":
                    running = false;
                    break;
                case "l":
                    System.out.println(Lamp.getlampList());
                    break;
                case "r":
                    System.out.println("Which lamp do you want to remove? - type 'lampe1/5'");
                    String Uinput = input.nextLine();
                    if (Uinput.endsWith("1")) {
                        selectedLamp = lampe1;
                        selectedLamp.removeLamp(lampe1);
                        System.out.println("You removed lampe 1");
                        System.out.println(Lamp.getlampList());
                    } else if (Uinput.endsWith("2")) {
                        selectedLamp = lampe2;
                        selectedLamp.removeLamp(lampe2);
                        System.out.println("You removed lampe 2");
                        System.out.println(Lamp.getlampList());
                    } else if (Uinput.endsWith("3")) {
                        selectedLamp = lampe3;
                        selectedLamp.removeLamp(lampe3);
                        System.out.println("You removed lampe 3");
                        System.out.println(Lamp.getlampList());
                    } else if (Uinput.endsWith("4")) {
                        selectedLamp = lampe4;
                        selectedLamp.removeLamp(lampe4);
                        System.out.println("You removed lampe 4");
                        System.out.println(Lamp.getlampList());
                    } else if (Uinput.endsWith("5")) {
                        selectedLamp = lampe5;
                        selectedLamp.removeLamp(lampe5);
                        System.out.println("You removed lampe 5");
                        System.out.println(Lamp.getlampList());
                    }
                    break;
                case "a":
                    System.out.println("Which lamp do you want to add? - type 'lampe1/10'");
                    String uinput = input.nextLine();
                    if (uinput.endsWith("6")) {
                        selectedLamp = lampe6;
                        selectedLamp.addLamp(lampe6);
                        System.out.println("you added lampe 6");
                        System.out.println(Lamp.getlampList());
                        break;
                    } else if (uinput.endsWith("7")) {
                        selectedLamp = lampe7;
                        selectedLamp.addLamp(lampe7);
                        System.out.println("You added lampe 7");
                        System.out.println(Lamp.getlampList());
                        break;
                    } else if (uinput.endsWith("8")) {
                        selectedLamp = lampe8;
                        selectedLamp.addLamp(lampe8);
                        System.out.println("You added lampe 8");
                        System.out.println(Lamp.getlampList());
                        break;
                    } else if (uinput.endsWith("9")) {
                        selectedLamp = lampe9;
                        selectedLamp.addLamp(lampe9);
                        System.out.println("You added lampe 9");
                        System.out.println(Lamp.getlampList());
                        break;
                    } else if (uinput.endsWith("10")) {
                        selectedLamp = lampe10;
                        selectedLamp.addLamp(lampe10);
                        System.out.println("You added lampe 10");
                        System.out.println(Lamp.getlampList());
                        break;
                    }
                case "t":
                    System.out.println("Which lamp do you want to switch on/off?");
                    String t = input.nextLine();
                    if (t.endsWith("1")) {
                        selectedLamp = lampe1;
                        selectedLamp.trykPåKontakt();
                        System.out.println("You switched lampe 1 on/off");
                        System.out.println(Lamp.getlampList());
                    } else if (t.endsWith("2")) {
                        selectedLamp = lampe2;
                        selectedLamp.trykPåKontakt();
                        System.out.println("You switched lampe 2 on/off");
                        System.out.println(Lamp.getlampList());}
                    else if (t.endsWith("3")) {
                        selectedLamp = lampe3;
                        selectedLamp.trykPåKontakt();
                        System.out.println("You switched lampe 3 on/off");
                        System.out.println(Lamp.getlampList());

                    }


            }


        }
    }
}