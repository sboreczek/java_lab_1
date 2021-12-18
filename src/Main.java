import java.util.Scanner;

public class Main {

    public static void wiek() {
        int wiek = 21;
        wiek = wiek % 3;
        if(wiek == 0)
            System.out.println("Podzielny przez 3");
        else if(wiek != 0)
            System.out.println("Niepodzielny przez 3");
    }

    public static void parzystosc() {
        int indeks = 12;
        String parzystosc = (indeks % 2 == 0) ? "indeks jest parzysty" : "indeks jest nieparzysty" ;
        System.out.println(parzystosc);

    }

    public static void liczba(){
        Scanner klawiatur = new Scanner(System.in);
        float liczba = klawiatur.nextFloat();
        if(liczba > 50)
            System.out.println("Podana liczba jest większa od 50");
        else if(liczba == 50)
            System.out.println("Podana liczba to 50");
        else if(liczba < 50)
            System.out.println("Podana liczba jest mniejsza od 50");
    }


    public static void main(String[] args) {
        wiek();
        parzystosc();
        liczba();
    }
}


