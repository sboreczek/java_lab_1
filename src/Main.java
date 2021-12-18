import java.util.Scanner;

public class Main {

    public static void tablica() {
        double[] tab = new double[5];
        for(int i = 0;i < 5;i++)
        {
            tab[i] = i+ 2 + i * 13;
        }
        for(int i = 0;i < 5;i++)
        {
            System.out.println(tab[i]);
        }
    }

    public static void main(String[] args) {
        tablica();
    }
}





