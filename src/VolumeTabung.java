
import java.lang.Math;
import java.util.Scanner;

public class VolumeTabung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print ("masukan jari jari :");
        Double jari_jari = input.nextDouble();
        System.out.print("masukan tinggi :");
        Double tinggi = input.nextDouble();
        Double result = Math.PI * (jari_jari*jari_jari) * tinggi ;
        System.out.println("hasilnya adalah : " + result);
    }
}
