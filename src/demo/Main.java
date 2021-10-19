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
                case "help":
                    Lamp.printHelp();
                    break;
                case "q":
                case "quit":
                    running = false;
                    break;
                case "l":
                case "list":
                    System.out.println(Lamp.getlampList());
                    break;
                case "r":
                case "remove":
                    System.out.println("Which lamp do you want to remove? - type 'lampe1/10'");
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
                    } else if (Uinput.endsWith("6")) {
                        selectedLamp = lampe6;
                        selectedLamp.removeLamp(lampe6);
                        System.out.println("You removed lampe 6");
                        System.out.println(Lamp.getlampList());
                        break;
                    }
                     else if (Uinput.endsWith("7")) {
                        selectedLamp = lampe7;
                        selectedLamp.removeLamp(lampe7);
                        System.out.println("You removed lampe 7");
                        System.out.println(Lamp.getlampList());
                        break;}
                        else if (Uinput.endsWith("8")) {
                        selectedLamp = lampe8;
                        selectedLamp.removeLamp(lampe8);
                        System.out.println("You removed lampe 8");
                        System.out.println(Lamp.getlampList());
                        break;}
                        else if (Uinput.endsWith("9")) {
                        selectedLamp = lampe9;
                        selectedLamp.removeLamp(lampe9);
                        System.out.println("You removed lampe 9");
                        System.out.println(Lamp.getlampList());
                        break;}
                        else if (Uinput.endsWith("10")) {
                        selectedLamp = lampe10;
                        selectedLamp.removeLamp(lampe10);
                        System.out.println("You removed lampe 10");
                        System.out.println(Lamp.getlampList());
                        break;
                    }
                case "a":
                case "add":
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
                    } else if (uinput.endsWith("5")) {
                        selectedLamp = lampe5;
                        selectedLamp.addLamp(lampe5);
                        System.out.println("You added lampe 5");
                        System.out.println(Lamp.getlampList());
                        break;
                    } else if (uinput.endsWith("4")) {
                        selectedLamp = lampe4;
                        selectedLamp.addLamp(lampe4);
                        System.out.println("You added lampe 4");
                        System.out.println(Lamp.getlampList());
                        break;
                    } else if (uinput.endsWith("3")) {
                        selectedLamp = lampe3;
                        selectedLamp.addLamp(lampe3);
                        System.out.println("You added lampe 3");
                        System.out.println(Lamp.getlampList());
                        break;
                    } else if (uinput.endsWith("2")) {
                        selectedLamp = lampe2;
                        selectedLamp.addLamp(lampe2);
                        System.out.println("You added lampe 2");
                        System.out.println(Lamp.getlampList());
                        break;
                    } else if (uinput.endsWith("1")) {
                        selectedLamp = lampe1;
                        selectedLamp.addLamp(lampe1);
                        System.out.println("You added lampe 1");
                        System.out.println(Lamp.getlampList());
                        break;

                    }
                case "t":
                case "toggle":
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
                        System.out.println(Lamp.getlampList());
                    } else if (t.endsWith("3")) {
                        selectedLamp = lampe3;
                        selectedLamp.trykPåKontakt();
                        System.out.println("You switched lampe 3 on/off");
                        System.out.println(Lamp.getlampList());
                    } else if (t.endsWith("4")) {
                        selectedLamp = lampe4;
                        selectedLamp.trykPåKontakt();
                        System.out.println("You switched lampe 4 on/off");
                        System.out.println(Lamp.getlampList());
                    } else if (t.endsWith("5")) {
                        selectedLamp = lampe5;
                        selectedLamp.trykPåKontakt();
                        System.out.println("You switched lampe 5 on/off");
                        System.out.println(Lamp.getlampList());
                    }

                    }
            }


        }


    }

