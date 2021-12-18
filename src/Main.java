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

/* ćw.3 */

/*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
 *   a) Imię, nazwisko, wiek, nr indeksu,
 *   dane mają być wprowadzane z klawiatury w konsoli
 *   b) wyświetlić dane za pomocą println i printf
 */


/*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
 *   wynik wyświetlić w konsoli programu
 */

