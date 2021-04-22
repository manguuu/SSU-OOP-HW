import java.util.Scanner;

public class Num12_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("연산>>");
        double a = sc.nextDouble();
        String oper = sc.next();
        double b = sc.nextDouble();
        if (oper.equals("+")) System.out.println(a + oper + b + "의 계산 결과는 " + (a + b));
        else if (oper.equals("-")) System.out.println(a + oper + b + "의 계산 결과는 " + (a - b));
        else if (oper.equals("*")) System.out.println(a + oper + b + "의 계산 결과는 " + (a * b));
        else if (oper.equals("/") && b != 0) System.out.println(a + oper + b + "의 계산 결과는 " + (a / b));
        else if (oper.equals("/") && b == 0) System.out.println("0으로 나눌 수 없습니다");
    }
}
