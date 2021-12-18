public class Main {

    public static void wypisanie() {
        int liczba = 5;
        String linia = "witam";
        double liczba2 = 5.5;
        byte liczba3 = 127;
        short liczba4 = 23;
        long liczba5 = 333;
        float liczba6 = 312.65f;
        boolean prawda = true;
        char litera = 'A';
        System.out.println(liczba + " " + liczba2 + " " + liczba3 + " " + liczba4 + " " + liczba5 );
        System.out.println(liczba6 + " " + prawda + " " + litera + linia);
    }

    public static void operacje() {
        int liczbaA = 50, liczbaB = 66;
        double liczbaX = 50.45, liczbaY = 424.55;
        System.out.println("Dodawanie = " + liczbaA + liczbaB + liczbaX + liczbaY);
        System.out.println("Odejmowanie = " + (liczbaA - liczbaB - liczbaX - liczbaY));
        System.out.println("Mnozenie = " + (liczbaA * liczbaB * liczbaX * liczbaY));
        System.out.println("Dzielenie = " + ((liczbaB / liczbaA )+ (liczbaY / liczbaX)));
        System.out.println("Modulo = " + (liczbaA % liczbaB % liczbaX % liczbaY));
    }


    public static void main(String[] args) {
        wypisanie();
        operacje();
    }
}

/*
 *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
 *    mnożenia, dziealenia i modulo na zmiennych:
 *    a) liczbaA i liczbaB, dowolne liczby calkowite (int),
 *    b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
 *  */
