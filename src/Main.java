public class Main {
    public static void main(String[] args) {
        /*  zad.3 - Najpierw należy uzupełnić kod w klasie Punkt.java,
            a) stworzyć objekt punktA typu Punkt,
            w konstruktorze zainicjować zmienną pX --> np. new Punkt(7), wykonać metodę punktA.toString();
            b) następnie ponownie wywopać konstruktor inicjalizujący wszystkie pola z klasy
            --> np. punkt = new Punkt(1, 2, 3);, wykonać metodę punktA.toString();
            c) nadpisać wartości pól z objektu punktA za pomocą setterów i
            ponownie wywołać metodę toString();
            d) wypisać wartości pól (za pomocą getterów),
            e) wywołać metody suma i róznica (obie wersje) z klasy punkt
        */
        Punkt punktA = new Punkt(7);
        System.out.println(punktA.toString());

        Punkt punktB = new Punkt(1,2,3);
        punktB.toString();

        punktA.setpX(9);
        punktA.setpY(8);
        punktA.setpZ(7);

        System.out.println(punktA.toString());

        System.out.println("X: " + punktA.getpX());
        System.out.println("Y: " + punktA.getpY());
        System.out.println("Z: " + punktA.getpZ());

        System.out.println(punktA.suma());


    }
}
