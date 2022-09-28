import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar,kdvOran=0.18;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz: ");
        tutar=scanner.nextDouble();
        double kdvTutar=tutar*kdvOran;
        double kdvliTutar=tutar+kdvTutar;
        if (kdvliTutar>1000){
            kdvOran=0.8;
            kdvTutar=tutar*kdvOran;
            kdvliTutar=tutar+kdvTutar;
            System.out.println("KDV'siz Tutar: "+tutar);
            System.out.println("KDV Oranı: "+kdvOran);
            System.out.println("KDV Tutarı: "+kdvTutar);
            System.out.println("KDV'li Tutar: "+kdvliTutar);
        }
        else {
            System.out.println("KDV'siz Tutar: "+tutar);
            System.out.println("KDV Oranı: "+kdvOran);
            System.out.println("KDV Tutarı: "+kdvTutar);
            System.out.println("KDV'li Tutar: "+kdvliTutar);
        }





    }
}