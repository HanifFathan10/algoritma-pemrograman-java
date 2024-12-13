import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayListExample arrExmp = new ArrayListExample();

        do{
            arrExmp.menu();
            switch (sc.nextInt()) {
                case 1:
                    arrExmp.inputData(); // ini dalam do while
                    break;
                case 2:
                    arrExmp.showData(); // ini dalam do while
                    break;
                case 3:
                    arrExmp.deleteData();   // ini dalam do while
                    break;
                case 4:
                    System.exit(0);
            }
        } while (true);
    }
}
