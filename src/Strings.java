import java.util.Scanner;

public class Strings {
    // не отностится к калькулятору
    public static void main(String[] args) {
        String str1 = "Hello world 123";
        String str2 = new String("abc");
        String str3 = "abc";
        str2 = str2.intern();
//        System.out.println(str1 == str2);

        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNextInt())
            System.out.println(scanner.next());
        System.out.println(scanner.nextInt() % 5);
    }
}
