public class Student {
    private Osoba osoba;
    private Wydzial wydzial;

    public Student(Osoba osoba, Wydzial wydzial) {
        this.osoba = osoba;
        this.wydzial = wydzial;
    }

    public Osoba getOsoba() {
        return osoba;
    }

    public void setOsoba(Osoba osoba) {
        this.osoba = osoba;
    }

    public Wydzial getWydzial() {
        return wydzial;
    }

    public void setWydzial(Wydzial wydzial) {
        this.wydzial = wydzial;
    }

    @Override
    public String toString() {
        return osoba.wypiszInfo() +
                "Wydział = " + this.wydzial + "\n";
    }
}
