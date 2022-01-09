import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;
        boolean c = false;

        int d = 20;
        int e = 6;
        int f = 20;

        System.out.println(a && b);
        System.out.println(a || c);
        System.out.println(!c);
        System.out.println(a && b || b && c);
        System.out.println(d == e && d < f);
        System.out.println(d > f || d > e);
        System.out.println(d == f || d > f);
        System.out.println(((d > f) || (a && c)));


    }
}





