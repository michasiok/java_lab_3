public class Samochod extends Pojazd{

    private int iloscDrzwi;

    public Samochod(Zasilanie zasilanie, String marka, String model, int iloscDrzwi) {
        super(4, zasilanie, marka, model);
        this.iloscDrzwi = iloscDrzwi;
    }

    public int getIloscDrzwi() {
        return iloscDrzwi;
    }

    public void setIloscDrzwi(int iloscDrzwi) {
        this.iloscDrzwi = iloscDrzwi;
    }

    @Override
    public void WypiszInfo() {
        super.WypiszInfo();
        System.out.println(
                "Ilość drzwi: " + iloscDrzwi + "\n"
        );
    }
}
