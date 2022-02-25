package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Main obj = new Main();
        Scanner input = new Scanner (System.in);
        //obj.askAboutAge(input);
        obj.askAboutName(input);
    }

    }
    public static void askAboutName (Scanner input){
        System.out.println("Hvad er dit navn?");
        String navn = input.next();

        System.out.println("Hej " + navn);


    }


}
