package work23;

public class Task23 {
    public static void main(String[] args) {
        int x=-78;
        int y=100;

        System.out.println("x= "+x+ " y= " +y);
        // меняем значения местами
        x=x+y-(y=x);

        System.out.println("Переменные после смены ");
        System.out.println("x= "+x+ " y= " +y);

    }
}
