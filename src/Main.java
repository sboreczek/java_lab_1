import java.util.Scanner;

public class Main {

    public static void dane() {
        String imie, nazwisko;
        int wiek,index;
        Scanner klawiatura = new Scanner(System.in);
        imie = klawiatura.nextLine();
        nazwisko = klawiatura.nextLine();
        wiek = klawiatura.nextInt();
        index = klawiatura.nextInt();

        System.out.println("Imie: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.printf("Wiek:%d%n",wiek);
        System.out.printf("Nr indeksu:%d%n",index);
    }

    public static void operacje() {
        int x = 50;
        int y = 23;
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y);

    }

    public static void main(String[] args) {
        dane();
        operacje();
    }
}





