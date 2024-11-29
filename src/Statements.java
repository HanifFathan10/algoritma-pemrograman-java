public class Statements {
    public static void main(String[] args) {
        int i;

        System.out.println(i=10);
        System.out.println(++i);
        System.out.println(i %= 2);
        System.out.println(i=i + (i=5));
        System.out.println(i=(i=1)+2);
    }
}
