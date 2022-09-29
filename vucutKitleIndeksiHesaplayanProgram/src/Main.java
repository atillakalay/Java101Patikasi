import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kg, boy, result;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy = scanner.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        kg = scanner.nextDouble();
        result = kg / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz: " + result);

    }
}