import java.lang.Math;
import java.util.Scanner;

public class LuasLingkaran {
    public static void main(String[] args) {
        Scanner ojan = new Scanner(System.in);
        System.out.print("Masukan jari jari : ");
        Double jarijari = ojan.nextDouble();
        Double result = Math.PI * (jarijari*jarijari);
        System.out.println("Hasilnya adalah : " + result);
    }
}
