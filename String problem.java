Given two strings of lowercase English letters,  and , perform the following operations:

Sum the lengths of  and .
Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
Capitalize the first letter in  and  and print them on a single line, separated by a space.


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String st1=sc.nextLine();
        String st2=sc.nextLine();
        System.out.println(st1.length()+st2.length());
        int res=st1.compareTo(st2);
        System.out.println((res>0)?"Yes":"No");
        String n1=st1.substring(0,1).toUpperCase()+st1.substring(1);
        String n2=st2.substring(0,1).toUpperCase()+st2.substring(1);
        System.out.println(n1+" "+n2);
    }
}
