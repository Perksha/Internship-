import java.text.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        double pay=s.nextDouble();
        NumberFormat us=NumberFormat.getCurrencyInstance(Locale.US);
        String u=us.format(pay);
    
        Locale inde = new Locale("en", "IN");
        NumberFormat ins = NumberFormat.getCurrencyInstance(inde);
        Currency inr = Currency.getInstance("INR");
        ins.setCurrency(inr);
        String in = ins.format(pay).replace(inr.getSymbol(),"Rs.");
        NumberFormat chin=NumberFormat.getCurrencyInstance(Locale.CHINA);
        String c=chin.format(pay);
        NumberFormat fr=NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String f=fr.format(pay);
        System.out.println("US: "+u);
        System.out.println("India: "+in);
        System.out.println("China: "+c);
        System.out.println("France: "+f);
        
    }
}
