package be.intecbrussel;

import java.util.Scanner;

public class IfElseBMIProgram {
    public static void main(String[] args){

        Scanner keyboardReader = new Scanner(System.in);
        double lengte;
        double gewicht;

        System.out.println("lengte in cm aub");
        lengte = (keyboardReader.nextDouble())/100;
        System.out.println("massa in kg aub");
        gewicht = keyboardReader.nextDouble();

        double bmi = (gewicht/(lengte*lengte));

        System.out.println("bmi is " + bmi);

        if(bmi<20){
            System.out.println("ondergewicht");
        } else if(bmi<=25){
            System.out.println("ok");
        } else if(bmi<=30){
            System.out.println("overgewicht");
        } else if(bmi<=40){
            System.out.println("obesitas");
        } else{
            System.out.println("ziekelijk overgewicht");
        }
    }
}
