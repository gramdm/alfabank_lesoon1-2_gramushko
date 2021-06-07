package work22;

public class Task22 {
    public static void main(String[] args) {
       long time = System.currentTimeMillis();
        System.out.println(System.currentTimeMillis());
        long seconds = time/1000;
        long minutes = seconds/60;
        long hour = minutes/60;
        long date = hour/24;
        System.out.println (date+":" +hour+":" +minutes+":" +seconds);
        System.out.println();
    }
}
