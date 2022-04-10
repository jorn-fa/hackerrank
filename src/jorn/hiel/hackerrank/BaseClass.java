package jorn.hiel.hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BaseClass {


    protected static BufferedWriter bufferedWriter ;

    public BaseClass() {
        String where="c://temp//hackerrank//temp.txt";
        try {
            bufferedWriter  = new BufferedWriter(new FileWriter(where));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
