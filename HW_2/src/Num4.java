import java.util.Scanner;

public class Num4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("소문자 알파벳 하나를 입력하시오>>");
        String s = sc.next();
        char input = s.charAt(0);
        for (int i = input - 'a'; i >= 0; i--) {
            for (int j = 'a'; j <= 'a' + i; j++) {
                System.out.print((char)j);
            }
            System.out.println();
        }
        sc.close();
    }
}
