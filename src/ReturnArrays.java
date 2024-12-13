public class ReturnArrays {
    public static int[] oddNumber(int n) {
        int[] result = new int[n];

        for(int i = 0; i < n; i++) {
            result[i] = (i * 2) + 1;
        }

        return result;
    }
    public static void main(String[] args) {
        int[] oddNum;

        oddNum = oddNumber(10);
        System.out.println("The first 10 odd number");

        for(int num : oddNum) {
            System.out.println(num + "");
        }
    }
}
