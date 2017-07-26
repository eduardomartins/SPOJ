
import java.util.Scanner;
import java.util.ArrayList;

import java.lang.Exception;
import java.lang.NumberFormatException;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{

    public static ArrayList<String> read(String stop){
        String aux;
        BufferedReader r = new BufferedReader (new InputStreamReader (System.in));
        ArrayList<String> strs = new ArrayList<String>();
        try {
             while (!(aux = r.readLine()).equals(stop)) {
                strs.add(aux);
            }
        } catch(IOException ioError) {
            System.out.println("Error de IO " + ioError);
        }
        return strs;
    }

    public static void main(String []args) throws Exception
    {
        int index = 0, num = 0;
        ArrayList<String> lines = read("0");
        int votes[] = new int[0];

        for(String line: lines){
            try {
                num  = Integer.parseInt(line);
                votes = new int[num];
            } catch (NumberFormatException formatError) {
                for( String vote : line.split(" ") ) {
                    if (vote.equals("1"))
                        votes[index] += 1;
                    index++;
                }
                index = 0;
                num--;
            }
            if ( num == 0 ) {
                int great = 0;
                for( Integer n : votes ) {
                    if ( n > great )
                        great = n;
                }
                System.out.println(great);
                great = 0;
            }
        }
    }
}
