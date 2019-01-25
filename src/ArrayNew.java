//: ArrayNew.java
// Creating arrays with new.
import java.io.IOException;
import java.util.*;

public class ArrayNew {
    static Random rand = new Random();
    static int pRand(int mod) {
        return Math.abs(rand.nextInt()) % mod + 1;
    }
    public static void main(String[] args) {
        int i;
        try
        {
            i=System.in.read();
            System .out .println("location 1");
        } catch (IOException e) {
            System .out .println("location 2");
        } finally {
            System .out .println("location 3");
        }
        System.out.println("location 4");

    }
}
