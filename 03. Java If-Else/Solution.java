/*In this challenge, we test your knowledge of using if-else conditional statements to
automate decision-making processes. An if-else statement has the following logical flow:
Task
Given an integer, n, perform the following conditional actions:
    If n is odd, print Weird
    If n is even and in the inclusive range of 2 to 5 print Not Weird
    If n is even and in the inclusive range of 6 to 20 print Weird
    If n is even and greater than 20 print Not Weird

If n is even and greater than n print Not Weird

Input Format
If  is even and greater than n print Not Weird

Output Format
Print Weird if the number is weird; otherwise, print Not Weird.

Sample Input 0
3
Sample Output 0
Weird

Sample Input 1
24
Sample Output 1
Not Weird
 */


import java.util.*;


public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        if(N%2==0) {
            if(N>=2 && N<=5) {
                System.out.println("Not Weird");
            } else if(N>=6 && N <= 20) {
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }
        } else {
            System.out.println("Weird");
        }
    }
}