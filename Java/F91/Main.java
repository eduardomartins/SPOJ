import java.util.Scanner;


public class Main{

    public static int f91(int n)
    {
        return (n > 100) ? n - 10 : f91(f91(n + 11));
    }

    public static void main(String []args) throws java.lang.Exception
    {
        java.io.BufferedReader read = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
        String str;
        while (!(str=read.readLine()).startsWith("0"))
            System.out.println("f91(" + str + ") = " + f91(Integer.parseInt(str)));
    }
}
