import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan jari jari : ");
        double jarijari = input.nextDouble();
        System.out.print("Masukan tinggi : ");
        double tinggi = input.nextDouble();
        double result = (double) (2 * 22) /7 * jarijari * tinggi;
        System.out.println("Hasilnya : " + result);
    }
}