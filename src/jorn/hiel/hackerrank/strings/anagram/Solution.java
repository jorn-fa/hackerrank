package jorn.hiel.hackerrank.strings.anagram;


import java.util.Map;
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        if(a.length()!=b.length()){return false;}

        Map<Character, Integer> lettersA = null;
        Map<Character, Integer> lettersB = null;
        char[]lettersInA = a.toLowerCase().toCharArray();
        char[]lettersInB = b.toLowerCase().toCharArray();

        for (char x: lettersInA) {
            if (lettersA.containsKey(x)){
                int value=lettersA.get(x);
                lettersA.replace(x,value+1);}
            else{lettersA.put(x,1);}
        }

        for (char x: lettersInB) {
            if (!lettersA.containsKey(x)){return false;}
            if (lettersB.containsKey(x)){
                int value=lettersB.get(x);
                lettersB.replace(x,value+1);}
            else{lettersB.put(x,1);}
        }


        return lettersA.equals(lettersB);
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        String s;
        //System.out.println(s.substring(start,end));
    }
}

