import java.util.Arrays;

public class Mugi {
    public static void main(String[] args) {
        String msg = "Saya mahasiswa UKRI";
        String msg2 = "hebat";
        String msg3 = " ";
        System.out.println(msg.length());
        System.out.println(msg.charAt(5));
        System.out.println(msg.concat(msg2));
        System.out.println(msg.substring(0, 4));
        System.out.println(msg.toLowerCase());
        System.out.println(msg.toUpperCase());
        System.out.println(msg.trim());
        System.out.println(msg.replace('a', 'o'));
        System.out.println(msg.replaceFirst("a", "o"));
        String[] a = msg.split(msg3, 3);
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
    }
}
