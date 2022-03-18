package be.intecbrussel;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args){

        int number1, number2;
        Scanner scanner = new Scanner(System.in); /* null = geen object = afwezigheid van een object*/

        System.out.println("geef een int");
        number1 = scanner.nextInt();
        number2 = scanner.nextInt();

        //System.out.println("operator: %"); /*p 57 rekenkundige operatoren*/
        //System.out.println(number1 % number2);



        //System.out.println(number1++); /*gebruik number1 en verhoog daarna*/
        //System.out.println(++number2); /*verhoog number2 en gebruik daarna*/
        //System.out.println(-number2); /*negatieve waarde nemen*/

        //System.out.println("!=");
        //System.out.println(number1 != number2);

        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println("&&");
        System.out.println(bool1 && bool1);

        number1 +=5; /* number1 = number1 + 5*/

    }
}
