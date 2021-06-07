package work22;
import java.text.SimpleDateFormat;
import java.util.*;
public class Task22 {

    public static void main(String[] args) {
      long currentTime = System.currentTimeMillis()/1000;
      long sec = currentTime%60;
      long min = currentTime / 60%60;
      long hour= currentTime / 60%24;
        SimpleDateFormat dateFormat=new SimpleDateFormat("DD:HH:MM:SS");
    System.out.println(dateFormat.format(new Date()));
    System.out.println(currentTime+":"+hour+";");

    }
}
