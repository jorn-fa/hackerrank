package jorn.hiel.hackerrank.problemsolving.javaAnagrams;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        System.out.println("Checking Anagram");

        Scanner sc=new Scanner(System.in);

        String first = sc.next();
        String second = sc.next();


        if(first.length()<=50 && second.length()<=50){
            if (first.length()!=second.length()){
                System.out.println("Not Anagrams");
                //skip rest when not same length
            }
            else {
                HashMap<Character,Integer> firstWord = new HashMap<>();
                HashMap<Character,Integer> secondWord = new HashMap<>();

                for(char letter : first.toLowerCase(Locale.ROOT).toCharArray()){
                    if(firstWord.containsKey(letter)){
                        firstWord.put(letter,firstWord.get(letter)+1);
                    }
                    else {firstWord.put(letter,1);
                    }
                }
                for(char letter : second.toLowerCase(Locale.ROOT).toCharArray()){
                    if(secondWord.containsKey(letter)){
                        secondWord.put(letter,secondWord.get(letter)+1);
                    }
                    else {secondWord.put(letter,1);
                    }
                }

                System.out.println(firstWord.equals(secondWord)?"Anagrams":"Not Anagrams");
            }




        }


    }
}
