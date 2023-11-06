
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        int counter = 1;
        
        
        while(sc.hasNextLine()){
            System.out.println(counter+" "+sc.nextLine());
            counter++;
        }
    }
}
