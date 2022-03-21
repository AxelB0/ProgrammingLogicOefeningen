package be.intecbrussel;

public class ConditioneleOperatoren {
    public static void main(String[] args){

//        int i1 = 57, i2 = 33, i3 = -65;
//
//        System.out.println((i1<i2)?i1:i2);
//        System.out.println((i1<i3)?i1:i3);
//        System.out.println((i2<i1)?i2:i1);
//        System.out.println((i2<i3)?i2:i3);
//        System.out.println((i3<i1)?i3:i1);
//        System.out.println((i3<i2)?i3:i2);

        int a=1,b=2;
        int result=++a*b--+b<5?--a:++b;
        System.out.println(result);

    }
}
