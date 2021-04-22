import java.util.Scanner;

public class Num12_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("연산>>");
        double a = sc.nextDouble();
        String oper = sc.next();
        double b = sc.nextDouble();
        switch (oper) {
            case "+":
                System.out.println(a + oper + b + "의 계산 결과는 " + (a + b));
                break;
            case "-":
                System.out.println(a + oper + b + "의 계산 결과는 " + (a - b));
                break;
            case "*":
                System.out.println(a + oper + b + "의 계산 결과는 " + (a * b));
                break;
            case "/":
                if (b == 0) System.out.println("0으로 나눌 수 없습니다");
                else System.out.println(a + oper + b + "의 계산 결과는 " + (a / b));
                break;
        }
    }
}
