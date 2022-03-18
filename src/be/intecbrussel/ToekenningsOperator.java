package be.intecbrussel;

public class ToekenningsOperator {
    public static void main(String[] args){

        int number1 = 57, number2 = 33;
        number1 += number2;
        System.out.println("" + number1 + " " + number2);
        number1 -= number2;
        System.out.println("" + number1 + " " + number2);
        number1 *= number2;
        System.out.println("" + number1 + " " + number2);
        number1 /= number2;
        System.out.println("" + number1 + " " + number2);
        number1 = number2 & number1;
        System.out.println("" + number1 + " " + number2);

    }
}
