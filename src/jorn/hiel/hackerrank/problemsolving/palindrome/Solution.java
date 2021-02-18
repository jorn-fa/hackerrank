package jorn.hiel.hackerrank.problemsolving.palindrome;

import java.util.*;


public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder reversed= new StringBuilder();
        reversed= reversed.append(A).reverse();

        if (A.equals(reversed.toString())){
            System.out.println("Yes");
        }

    }
}


