import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++){
            
            BigInteger n= s.nextBigInteger();
            
            
        if (n.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0 && n.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0){
            
           System.out.println(n+" can be fitted in:");
           
           
           if (n.compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) <= 0 && n.compareTo(BigInteger.valueOf(Byte.MIN_VALUE)) >= 0){
               System.out.println("* byte");
           }
           
           
             if (n.compareTo(BigInteger.valueOf(Short.MAX_VALUE)) <= 0 && n.compareTo(BigInteger.valueOf(Short.MIN_VALUE)) >= 0){
               System.out.println("* short"); }
               
               
            if (n.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0 && n.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0) {
               System.out.println("* int");
           }
         
           System.out.println("* long");   
                     
        }else{
            System.out.println(n+ " can't be fitted anywhere.");
        }
        }
    }
}
