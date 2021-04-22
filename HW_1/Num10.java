import java.util.Scanner;

public class Num10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 원의 중심과 반지름 입력>>");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int r1 = sc.nextInt();
        System.out.print("두번째 원의 중심과 반지름 입력>>");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int r2 = sc.nextInt();
        double distance = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        if (distance <= r1 + r2 && distance >= Math.abs(r1 - r2))
            System.out.println("두 원은 서로 겹친다");
    }
}