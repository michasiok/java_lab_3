import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/* zad.1
        a) Stworzyć prosty enum "LiczbyEnum" z liczbami od 1 do 6 zapisanymi słownie,
        b) stworzyć prosty enum "StatusEnum" z wartościami KONTYNUUJEMY i KONIEC,
        c) stworzyć pętlę while z wartością true w warunku (nieskończona pętla),
        d) niech w pętli są podawane wartości liczbowe z klawiatury,
        e) jeśli użytkownik poda z klawiatury 0 to program ma kończyć działanie,
        f) umieścić w pętli switch() case: które będą wypisywały cyfry słownie odpowiednio
        do podanych cyfr przez użytkownika,
        g) gdy użytkownik wciśnie 0 ma wyświetlić się status KONIEC w innym wypadku KONTYNUUJEMY :),
        */

        /* statusy i wybór ze switch case to najczęstsze użycia enumów, enumy są często używane
         * w różnego rodzaju listach, selectach jako krótkie opcje wyboru np. jako status A, X (Aktualny, Usunięty) */
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Podaj liczbe: ");
            switch (scanner.nextInt()) {
                case  1->{
                    System.out.println(LiczbyEnum.JEDEN);
                }
                case  2 -> {
                    System.out.println(LiczbyEnum.DWA);
                }
                case  3 -> {
                    System.out.println(LiczbyEnum.TRZY);
                }
                case  4 -> {
                    System.out.println(LiczbyEnum.CZTERY);
                }
                case  5 -> {
                    System.out.println(LiczbyEnum.PIEC);
                }
                case  0 -> {
                    System.out.println(StatusEnum.KONIEC);
                    return;
                }
                default -> {
                    System.out.println(StatusEnum.KONTYNUUJEMY);
                }

            }

        }


    }
    enum LiczbyEnum {
        JEDEN(1), DWA(2), TRZY(3), CZTERY(4), PIEC(5);

        final int wartoscLiczbowa;

        LiczbyEnum(int wartosc){
            this.wartoscLiczbowa = wartosc;
        }
    }

    enum StatusEnum {
        KONTYNUUJEMY, KONIEC;
    }
}
