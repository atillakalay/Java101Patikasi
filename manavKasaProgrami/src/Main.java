import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5, total, kg;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Armut kaç kg: ");
        kg = scanner.nextDouble();
        total = kg * armut;

        System.out.print("Elma kaç kg: ");
        kg = scanner.nextDouble();
        total += kg * elma;

        System.out.print("Domates kaç kg: ");
        kg = scanner.nextDouble();
        total += kg * domates;

        System.out.print("Muz kaç kg: ");
        kg = scanner.nextDouble();
        total += kg * muz;

        System.out.print("Patlıcan kaç kg: ");
        kg = scanner.nextDouble();
        total += kg * patlican;

        System.out.print("Toplam tutar: " + total);
    }
}