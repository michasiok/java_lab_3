import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /* ćw 4 klasy */

        /* zad.1
            a) Stworzyć klasę Osoba z polami prywatnymi:
            - imie (String),
            - nazwisko (String),
            - indeks (Integer)
            b) stworzyc konstruktory, gettery i settery
            c) napisać metodę w klasie Osoba która zwróci informację o osobie,
         */

        /* zad.2
            a) Stworzyć klasę Student z polami prywatnymi
            - Osoba osoba,
            - WydzialEnum wydzial;
            b) stworzyć enum WydzialEnum (w nowym pliku) z kilkoma polami,
            c) stworzyc konstruktory, gettery i settery
            d) nadpisać metodę toString aby zwracała wszystkie elementy ładnie przedstawione :)
         */

        /* zad.3
            a) W klasie Main stworzyć 5 różnych studentów, (można za pomocą tego samego objektu)
            b) dodać studentów do Listy ArrayList,
            c) przeiterować listę za pomocą pętli forEach wywołując na każdym objekcie metodę toString() (w każdej iteracji);
         */

        Osoba osoba = new Osoba("Adam", "Nowak", 125125);

        ArrayList<Student> lista =  new ArrayList<Student>();

        lista.add(new Student(osoba, Wydzial.EIA));
        lista.add(new Student(osoba, Wydzial.ETI));
        lista.add(new Student(osoba, Wydzial.ZIE));
        lista.add(new Student(osoba, Wydzial.FTIMS));
        lista.add(new Student(osoba, Wydzial.WILIŚ));

        for (Student std: lista) {
            System.out.println(std.toString());
        }
    }
}
