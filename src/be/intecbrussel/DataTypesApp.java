package be.intecbrussel;

public class DataTypesApp {
    public static void main(String[] args){
        boolean bool1 = false;
        var char1 = 'd';
        byte byte1 = 126;
        short shortint = 115;
        int int1 = 0b0101_1100;
        var longint = 4545646L;
        var decimaal = 456.32F;
        var groteDecimaal = 456.156465156;

        final double PI = 3.14159265358979;
        // PI = 15;

        byte1 = (byte) shortint;
        //shortint = char1;
        int1 = char1;



        System.out.println(bool1);
        System.out.println(char1);
        System.out.println(byte1);
        System.out.println(shortint);
        System.out.println("int = " + int1);
        System.out.println(longint);
        System.out.println(decimaal);
        System.out.println(groteDecimaal);




    }

}
