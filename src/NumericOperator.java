public class NumericOperator {
    public static void main(String[] args) {
        double x = 1.0;
        double y = 5.0;
        double z = x-- + (++y);

        System.out.println(x--);
        System.out.println(z);

//        double x = 1.0;
//        double y = 5.0;
//        y = y + 1;
//
//        double z = x + y;
//
//        x = x - 1;
//
//        System.out.println(z);
//        System.out.println(x);
//        System.out.println(y);
    }
}
