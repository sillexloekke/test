package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Main obj = new Main();
        Scanner input = new Scanner (System.in);
        obj.askAboutAge(input);
        askAboutName(input);
    }
    public void askAboutAge(Scanner input){
        System.out.println("Hvor gammel er du?");
        int alder = input.nextInt();
        System.out.println("Okay så du er " + alder);
    }
    public static void askAboutName (Scanner input){
        System.out.println("Hvad er dit navn?");
        String navn = input.next();

        System.out.println("Hej " + navn);


    }


}
