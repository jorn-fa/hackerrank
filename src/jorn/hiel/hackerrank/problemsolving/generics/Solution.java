package jorn.hiel.hackerrank.problemsolving.generics;

import java.io.IOException;
import java.lang.reflect.Method;

class Printer
{
    //Write your code here
    public <T> void printArray(T[] source){

      for(T t :source){
          System.out.println(t);}
    }

}

public class Solution {


    public static void main(String args[]) {
        Printer myPrinter = new Printer();
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;


        //test

        //  if (number.startsWith("CM")) return 900 + romanToInt(number.substring(2, number.length()));

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if (name.equals("printArray"))
                count++;
        }
    }
}
