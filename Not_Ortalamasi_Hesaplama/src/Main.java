import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int mat,fizik,kimya,turkce,tarih,muzik;

        Scanner scanner=new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        mat=scanner.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik=scanner.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya=scanner.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce=scanner.nextInt();

        System.out.print("Tarih Notunuz: ");
        tarih=scanner.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik=scanner.nextInt();

        double result=(mat+fizik+kimya+turkce+tarih+muzik)/6;

        String durum = (result >=60) ? "sınıfı geçti" : "sınıfta kaldı" ;
        System.out.print("Durum: "+result+" ortalama ile " + durum);
    }
}