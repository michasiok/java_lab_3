public class Motocykl  extends Pojazd{
    String kolor;

    public Motocykl( Zasilanie zasilanie, String marka, String model, String kolor) {
        super(2, zasilanie, marka, model);
        this.kolor = kolor;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    @Override
    public void WypiszInfo() {
        super.WypiszInfo();
        System.out.println(
                "Kolor: " + kolor + "\n"
        );
    }
}
