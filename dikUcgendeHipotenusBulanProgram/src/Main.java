import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a,b,c;
        Scanner scanner=new Scanner(System.in);
        System.out.print("1. kenarı giriniz: ");
       a= scanner.nextInt();
        System.out.print("2. kenarı giriniz: ");
       b= scanner.nextInt();
       c=Math.sqrt ((a*a)+(b*b));
      double result=c;
      System.out.println("Hipotenüs: "+c);

    }




}