import java.util.Scanner;

public class Looping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < 5;  i++) {
//            System.out.println(i);
//        }
//
//        int a = 0;
//        while(a < 10) {
//            System.out.println(a);
//            System.out.println("Ini while");
//            a++;
//        }

//        int num = 0;
//        do{
//            System.out.println(num);
//            num++;
//        }while (num < 5);

//        for(int awal = 4; awal < 20; awal += 2) {
//            if (awal == 18) {
//                System.out.println(awal);
//            } else {
//                System.out.print(awal + ",");
//            }
//        }

        for(int akhir = 20; akhir >= 4; akhir -= 2) {
            if (akhir == 4) {
                System.out.print(akhir);
            } else {
                System.out.print(akhir + ",");
            }
        }
//
//        int a = 4;
//
//        while(a < 20) {
//            System.out.print(a + ", ");
//            a += 2;
//        }
//
//        int num = 4;
//        do{
//            System.out.print(num + ", ");
//            num += 2;
//        }while (num < 20);

        System.out.print("Masukan angka : ");
        int tinggi = sc.nextInt();
//        for(int i = 1; i <= tinggi; i++) {
//
//            for(int j = tinggi - i; j > 0; j--) {
//                System.out.print(" ");
//            }
//
//            for(int k = 1; k <= (2 * i - 1); k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }
}
