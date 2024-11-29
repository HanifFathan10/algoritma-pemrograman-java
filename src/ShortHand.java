public class ShortHand {
    public static void main(String[] args) {
        int i = 8;
        int j = 3;

        System.out.println("Value of i ="+i+" and j = " +j);
        i += (++j);
        System.out.println("Value of i ="+i+" and j = " +j);
        i += (j++);
        System.out.println("Value of i ="+i+" and j = " +j);
    }
}
