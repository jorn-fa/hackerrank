package jorn.hiel.hackerrank.certificates;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'stringAnagram' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY dictionary
     *  2. STRING_ARRAY query
     */

    public static List<String> filtered(List<String> dictionary,int size){
        List<String>results = new ArrayList<>();

        for (String tester:dictionary){
            if( tester.length()==size){results.add(tester);}
        }

        return results;

    }

    public static List<Integer> stringAnagram(List<String> dictionary, List<String> query) {
        List<Integer> returnList = new ArrayList<>();

        for (String search:query){
            int counter=0;

            List<String> filterdResults= filtered(dictionary,query.size());

            for (String singleWord:filterdResults){

                if (singleWord.equals(search)){counter++;}
            }
            returnList.add(counter);

        }



return returnList;
    }

}
