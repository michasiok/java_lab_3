public abstract class Pojazd {
    protected int iloscKol;
    protected Zasilanie zasilanie;
    private final String marka;
    private final String model;

    public Pojazd(int iloscKol, Zasilanie zasilanie, String marka, String model) {
        this.iloscKol = iloscKol;
        this.zasilanie = zasilanie;
        this.marka = marka;
        this.model = model;
    }

    public void WypiszInfo() {
        System.out.println(
                        "Marka: " + marka + "\n" +
                        "Model" + model + "\n" +
                        "Ilość kół: " + iloscKol + "\n" +
                        "Typ zasilania: " + zasilanie
        );
    }

    protected int getIloscKol() {
        return iloscKol;
    }

    protected Zasilanie getZasilanie() {
        return zasilanie;
    }

    protected void setIloscKol(int iloscKol) {
        this.iloscKol = iloscKol;
    }

    protected void setZasilanie(Zasilanie zasilanie) {
        this.zasilanie = zasilanie;
    }
}
