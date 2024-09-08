import java.time.*;
import java.time.format.DateTimeFormatter;
class Solution {
    public String convertDateToBinary(String date) {
     DateTimeFormatter f=DateTimeFormatter.ofPattern("yyyy-MM-dd");
     LocalDate d=LocalDate.parse(date,f);
     int yr=d.getYear();
     int mnth=d.getMonthValue();
     int day=d.getDayOfMonth();
     String y=Integer.toBinaryString(yr);
     String mo=Integer.toBinaryString(mnth);
     String done=Integer.toBinaryString(day);
     return y+"-"+mo+"-"+done;
    }
}
