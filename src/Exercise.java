public class Exercise {
    public static void main(String[] args) {
        int a = 1;
        double d = 1.0;

        a = 46 % 9 + 4 * 4 - 2;
        System.out.println(a);
        a = 45 + 43 % 5 * (23 * 3 % 2);
        System.out.println(a);
        a %= 3 / a + 3;
        System.out.println(a);
        d += 1.5 * 3 + (++a);
        System.out.println(d);

//        System.out.println("25 / 4 is " + 25 /4);
//        System.out.println("25 / 4.0 is " + 25 /4.0);
//        System.out.println("3 * 2 / 4 is " + 3 * 2 /4);
//        System.out.println("3.0 * 2 / 4 is " + 3.0 * 2 /4);
    }
}
