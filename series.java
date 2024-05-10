We use the integers , , and  to create the following series:

You are given  queries in the form of , , and . For each query, print the series corresponding to the given , , and  values as a single line of  space-separated integers.

Input Format

The first line contains an integer, , denoting the number of queries.
Each line  of the  subsequent lines contains three space-separated integers describing the respective , , and  values for that query.


import java.io.*;
import java.util.*;

public class Solution {
    
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your c*/
        Scanner s = new Scanner(System.in);
        int queries = s.nextInt();
        s.nextLine(); 
        for (int q = 0; q < queries; q++) {
            String si = s.nextLine();
            String[] str = si.split(" ");

            if (str.length == 3) {
                int ans = 0;
                int a = Integer.parseInt(str[0]);
                int b = Integer.parseInt(str[1]);
                int n = Integer.parseInt(str[2]);

                for (int i = 0; i < n; i++) {
                    ans = ans + (int) (Math.pow(2, i) * b);
                    System.out.print((a + ans) + " ");
                }
                System.out.println(); 
            }
        }
        
        s.close();
    }
}

    
