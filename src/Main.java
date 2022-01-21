import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
/* zad.1 Proszę wybrać dowolny temat budowania struktur klas np. samochody, dom, biblioteka, nauka, zabawki, kosmetyki, biuro podróży ... .
                 Będziemy budować podobną strukturę kodu jak w przykładzie 5,
            a) Proszę stworzyć układ klas dziedziczących po sobie,
            b) proszę użyć pól i metod protected jak i private,
            c) proszę stworzyć konstruktory, metody: toString(), settery i gettery,
            d) proszę używać super do wywołania konstruktorów i metod z klas nadrzędnych
            (można wygenerować je --> prawy przycisk myszki --> generate --> settery, gettery, ...),
            e) w klasie Main proszę stworzyć objekty podobnie jak w przykładzie 5,
            oraz stworzyć listę typu najbardziej generycznego np. List<Budynek>
         */




    new Motocykl(Zasilanie.ELEKTRYCZNY, "Energica", "Eva Ribelle", "szybki");
        ArrayList<Pojazd> pojazdy = new ArrayList<Pojazd>();
        pojazdy.add(new Samochod(Zasilanie.ELEKTRYCZNY, "MERCEDES", "EQ", 5));
        pojazdy.add(new Samochod(Zasilanie.SPALINOWY, "KIA", "XCEED", 5));
        pojazdy.add(new Motocykl(Zasilanie.ELEKTRYCZNY, "Energica", "Eva Ribelle", "szybki"));

        for (Pojazd pojazd: pojazdy) {
            pojazd.WypiszInfo();
        }
    }
}
