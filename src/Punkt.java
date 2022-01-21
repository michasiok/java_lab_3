public class Punkt {
    private int pX;
    private int pY;
    private int pZ;

    public Punkt(int pX) {
        this.pX = pX;
    }
    public Punkt(int pX, int pY, int pZ) {
        this.pX = pX;
        this.pY = pY;
        this.pZ = pZ;
    }

    public int getpX() {
        return pX;
    }

    public void setpX(int pX) {
        this.pX = pX;
    }

    public int getpY() {
        return pY;
    }

    public void setpY(int pY) {
        this.pY = pY;
    }

    public int getpZ() {
        return pZ;
    }

    public void setpZ(int pZ) {
        this.pZ = pZ;
    }

    @Override
    public String toString() {
        return "Punkt{" +
                "pX=" + pX +
                ", pY=" + pY +
                ", pZ=" + pZ +
                '}';
    }

    public int suma() {
     return this.getpX() + this.getpY() + this.getpZ();
    }

    public int roznica(){
        return this.getpX() - this.getpY() - this.getpZ();
    }
}
