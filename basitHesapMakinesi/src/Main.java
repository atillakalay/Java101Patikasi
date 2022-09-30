import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, select;
        Scanner input = new Scanner(System.in);
        System.out.println("ilk sayıyı giriniz");
        n1 = input.nextInt();
        Scanner input1 = new Scanner(System.in);
        System.out.println("ikinci sayıyı giriniz");
        n2 = input.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.println("1-Toplama \n 2-Çıkarma \n 3-Çarpma \n 4-Bölme");
        System.out.println("Seçiminiz: ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplam : " + (n1 + n2));
                break;
            case 2:
                System.out.println("Toplam : " + (n1 - n2));
                break;
            case 3:
                System.out.println("Toplam : " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.println(n1 / n2);
                } else {
                    System.out.println("0 bölünemez");
                }
                break;
            default:
                System.out.println("Yanlış Seçim!!!");
        }

    }
}