import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> nama = new ArrayList<>();
    ArrayList<String> pass = new ArrayList<>();
    ArrayList<String> telp = new ArrayList<>();

    void inputData() {
        System.out.printf("Masukan Nama : ");
        nama.add(sc.next());
        System.out.printf("Masukan Pass : ");
        pass.add(sc.next());
        System.out.printf("Masukan telp : ");
        telp.add(sc.next());

        System.out.println("Input data success!!");
    }

    void showData() {
        if (nama.isEmpty()) {
            System.out.println("Tidak ada data yang tersimpan.");
        } else {
            System.out.println("=== Data yang Tersimpan ===");
            for (int i = 0; i < nama.size(); i++) {
                System.out.println("Data ke-" + (i + 1));
                System.out.println("Nama    : " + nama.get(i));
                System.out.println("Password: " + pass.get(i));
                System.out.println("Telepon : " + telp.get(i));
                System.out.println("-------------------------");
            }
        }
    }

    void deleteData() {
        System.out.printf("Masukan nomor data yang ingin dihapus: ");
        int index = sc.nextInt() - 1; // Dikurangi 1 karena index dimulai dari 0
        if (index >= 0 && index < nama.size()) {
            nama.remove(index);
            pass.remove(index);
            telp.remove(index);
            System.out.println("Data berhasil dihapus!");
        } else {
            System.out.println("Nomor data tidak valid!");
        }
    }

    void menu() {
        System.out.println("Selamat datang di ALGORITMA PEMROGRAMAN APP");
        System.out.println("1. Input Data");
        System.out.println("2. Show Data");
        System.out.println("3. Delete Data");
        System.out.println("4. Exit");
        System.out.printf("Mau pilih nomor berapa ? ");
    }

    public static void main(String[] args) {

    }
}
