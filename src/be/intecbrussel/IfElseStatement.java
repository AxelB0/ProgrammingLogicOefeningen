package be.intecbrussel;

import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args){

        Scanner keyboardReader = new Scanner(System.in);
        int leeftijd;

        do {
            System.out.println("wat is je leeftijd (geef een getal)");
            leeftijd = keyboardReader.nextInt();
        } while( !(leeftijd > 0) || !(leeftijd < 150));
        if(leeftijd>=18){
            System.out.println("volwassene");
        } else if(leeftijd >=10){
            System.out.println("tiener");
        } else if(leeftijd>=2){
            System.out.println("kind");
        } else {
            System.out.println("baby");
        }



    }
}
