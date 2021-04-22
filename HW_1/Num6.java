import java.util.Scanner;

public class Num6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input >= 10) {
            if ((input % 10) % 3 == 0 && (input / 10) % 3 == 0 && (input % 10) != 0)
                System.out.println("박수짝짝");
                System.out.println("박수짝");
        } else {
            if (input % 3 == 0)
                System.out.println("박수짝");
        }
    }
}
