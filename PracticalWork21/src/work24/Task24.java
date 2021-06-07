package work24;

import static java.lang.System.out;

public class Task24 {
    public static void main(String[] args) {
        int Number=123;

        int num= Number%10;
        int num2=Number/10%10;
        int num3=Number/100;
        int unNumber=num*100+num2*10+num3;
        System.out.println("Разница между числами " + (unNumber) );
    }
}
