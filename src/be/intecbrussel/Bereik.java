package be.intecbrussel;

public class Bereik {
    public static void main(String[] args){


        int bruh;
        bruh =6;
        {
            bruh =7;
            bruh = 8;
            System.out.println(bruh);
        }

        {
            System.out.println(bruh);
        }


    }

}
