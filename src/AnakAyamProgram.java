import java.util.Scanner;

public class AnakAyamProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ayamayaman = sc.nextInt();
        System.out.println("Masukan jumlah Anak Ayam : " + ayamayaman);

        System.out.println("Mulai bernyanyi");
        System.out.println("===============");

        for(int i = 0; i < 10; i++) {
            AyamBernyanyi(ayamayaman);
        }
    }

    static void AyamBernyanyi(int x) {
        for(int i = x; i >= 1; i--) {
            System.out.println("Tek kotek kotek kotek Anak Ayam turun " + i);
            for(double j = 1; j <= 100000000; j++) {}

            if (i > 1) {
                System.out.println("Mati satu tinggal " +  (i - 1));
                for(double j = 1; j <= 100000000; j++) {}
            }
        }
        System.out.println("Mati satu tinggal induknya");
    }
}
