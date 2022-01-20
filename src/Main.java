public class Main {
    public static void main(String[] args) {
    /* zad.2
            a) Stworzyć publiczną klasę Student z 2-ma polami String, 1 polem int i 1 polem boolean,
            klasa ma się znajdować w osobnym pliku Student.java
            b) stworzyć 3 objekty klasy student i wstawić je do tablicy
            c) wyświetlić dane z tablicy, użyć pętli for lub forEach
            d) dane powinny być estetycznie przedstawione
         */

        Student[] tablicaStudentow = new Student[]{
                new Student("Adam", "Nowak", 231231, true),
                new Student("Paweł", "Woźniak", 13351, false),
                new Student("Michał", "Kowalski", 987654, true),
        };
        for (Student student: tablicaStudentow) {
            System.out.println(student);
        }

    }
}
