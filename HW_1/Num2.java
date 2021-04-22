import java.util.Scanner;

public class Num2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input / 10 == input % 10)
            System.out.println("Yes! 10의 자리와 1의 자리가 같습니다");
    }
}
