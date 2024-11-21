public class Math {
    public static void main(String[] args) {
        double mathPow = java.lang.Math.pow(2, 2);
        System.out.println(mathPow);
        double mathPow1 = java.lang.Math.pow(3, 4);
        System.out.println(mathPow1);
        double mathPow2 = java.lang.Math.pow(4, 4);
        System.out.println(mathPow2);

        double mathMax = java.lang.Math.max(2, java.lang.Math.min(3,4));
        System.out.println(mathMax);
        double mathMax1 = java.lang.Math.max(3, java.lang.Math.min(4,6));
        System.out.println(mathMax1);
        double mathMax2 = java.lang.Math.max(4, java.lang.Math.min(5,3));
        System.out.println(mathMax2);

        double mathRound = java.lang.Math.round(2.5F);
        System.out.println(mathRound);
        double mathRound2 = java.lang.Math.round(2.4F);
        System.out.println(mathRound2);
        double mathRound3 = java.lang.Math.round(2.6F);
        System.out.println(mathRound3);

        double mathCeil = java.lang.Math.ceil(-9.49);
        System.out.println(mathCeil);
        double mathCeil1 = java.lang.Math.ceil(-8.32);
        System.out.println(mathCeil1);
        double mathCeil2 = java.lang.Math.ceil(-2.84);
        System.out.println(mathCeil2);

        double mathFloor = java.lang.Math.floor(7.5);
        System.out.println(mathFloor);
        double mathFloor1 = java.lang.Math.floor(7.8);
        System.out.println(mathFloor1);
        double mathFloor2 = java.lang.Math.floor(4.4);
        System.out.println(mathFloor2);
    }
}
