// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Subclas1 subclas1 = new Subclas1("BMW", "black", 280);
        System.out.println(subclas1);
        System.out.println(subclas1.gas());
        System.out.println(subclas1.brake());
        Subclas2 subclas2 = new Subclas2("MERSEDES-BENZ", "banan", 380);
        System.out.println(subclas2);
        System.out.println(subclas2.gas());
        System.out.println(subclas2.brake());
    }
}