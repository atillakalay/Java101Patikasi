import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar, kmBasiUcret = 2.20, km, baslangicFiyati = 10;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Uzaklık kaç km? ");
        km = scanner.nextDouble();
        tutar = (km * kmBasiUcret) + baslangicFiyati;

        if (km < 1) {
            System.out.println("Ödenecek tutar: " + baslangicFiyati);
        } else if (tutar <= 20) {
            tutar = 20;
            System.out.println("Ödenecek tutar: " + tutar);
        } else {
            System.out.println("Ödenecek tutar: " + tutar);
        }
    }
}