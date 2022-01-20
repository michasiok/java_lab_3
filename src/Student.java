public class Student {
    private String imie;
    private String nazwisko;
    private int numerIndeksu;
    private boolean naLiscie;

    public Student(String imie, String nazwisko, int numerIndeksu, boolean naLiscie) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerIndeksu = numerIndeksu;
        this.naLiscie = naLiscie;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getNumerIndeksu() {
        return numerIndeksu;
    }

    public boolean isNaLiscie() {
        return naLiscie;
    }

    @Override
    public String toString() {
        return
                "Imię: " + imie + "\n" +
                "Nazwisko: " + nazwisko + "\n" +
                "Numer indeksu: " + numerIndeksu + "\n" +
                "Jest na liście: " + naLiscie + "\n";
    }
}
