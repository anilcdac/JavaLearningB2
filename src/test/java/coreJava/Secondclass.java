package coreJava;

import calculation.*;

import java.lang.reflect.Method;

public class Secondclass {
    static  int a = 2;
    static  int b = 1;
    static  int c ;
    static int result;
    //Method- This is a block in java code
    //can be reused when required
    public int addition()
    {
        System.out.println("I am in addition Method");
        c = a +b ;
        return c;
    }

    public int addition2()
    {
        System.out.println("I am in addition2 Method");
        c = a +b ;
        return c;
    }

    public static void main(String[] args) {
        //Calling method present in current/same class
        //Create object
        Secondclass sc = new Secondclass();
//        sc.addition();
//        result = sc.addition2();
//        System.out.println("Result is: "+ result);

        //Calling method present in another class
//         MethodFromOC4 moc = new MethodFromOC4();
//        result = moc.getSub();
//        System.out.println("Subtraction is :"+ result);

        //Calling method present in other package class
          MethodFromOClassPackage5 mocp = new MethodFromOClassPackage5();
            result = mocp.getSub();
        System.out.println("Subtraction is :"+ result);

        MethodFromOClassPackage6Sub mocp6s = new MethodFromOClassPackage6Sub();

    }
}
