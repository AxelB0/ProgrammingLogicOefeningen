package be.intecbrussel;

import java.util.Scanner;

public class RekenkundigeOperatoren {
    public static void main(String[] args){

        System.out.println(3+8);
        System.out.println("The sum of 3 + 8 is " + (3+8));

        int number1 = 1, number2 = 2;
        char char1 = 'd';

        Scanner keyboardReader = new Scanner(System.in);

        System.out.println(number1 + number2 + char1);
        System.out.println(number1 - number2);
        System.out.println(number1 * number2);
        System.out.println(number1 / number2);
        System.out.println(number1 % number2);

        System.out.println(number1++);

        byte byte1 = 2, byte2 = 3;
        byte byte3 = (byte) (byte1*byte2);
        long int1 = 2147483645L, int2 = 2147483642L;
        String string3;
        string3 = "" + (int1*int2);
        System.out.println("" + byte3 + " " + string3);

    }

}
