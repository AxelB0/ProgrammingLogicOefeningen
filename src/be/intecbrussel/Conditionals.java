package be.intecbrussel;

public class Conditionals {
    public static void main(String[] args){

        int number1 = 10, number2 = 15;

//        if(number1>number2){
//            System.out.println("number1 is greater than number2");
//        } else  {
//            if(number1==number2){
//                System.out.println("number1 equals number2");
//            } else  {
//                    System.out.println("number1 is smaller than number2");
//            }
//        }

        if(number1>number2){
            System.out.println("number1 is greater than number2");
        } else if(number1<number2){
            System.out.println("number2 is greater than number1");
        } else{
            System.out.println("the numbers are equal");
        }
    }
}
