import java.util.Scanner;

public class SelimutTabung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan jari jari : ");
        double jarijari = input.nextDouble();
        System.out.print("Masukan tinggi : ");
        double tinggi = input.nextDouble();
        double result = 2 * Math.PI * jarijari * tinggi;
        System.out.println("Hasilnya : " + result);
    }
}
