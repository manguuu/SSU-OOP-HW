import java.util.Scanner;

public class Num16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = {"가위", "바위", "보"};
        System.out.println("가위 바위 보 게임을 합시다.");
        while (true) {
            System.out.print("가위 바위 보!>>");
            String input = sc.next();
            if (input.equals("그만")) {
                System.out.println("게임을 종료합니다...");
                break;
            }
            int n = (int)(Math.random() * 3);
            System.out.print("사용자 = " + input + ", 컴퓨터는 " + str[n] + ", ");
            if (input.equals(str[n])) {
                System.out.println("비겼습니다");
            } else if (str[n].equals("가위")) {
                if (input.equals("보")) System.out.println("컴퓨터가 이겼습니다");
                else System.out.println("사용자가 이겼습니다");
            } else if (str[n].equals("바위")) {
                if (input.equals("보")) System.out.println("사용자가 이겼습니다");
                else System.out.println("컴퓨터가 이겼습니다");
            } else if (str[n].equals("보")) {
                if (input.equals("바위")) System.out.println("컴퓨터가 이겼습니다");
                else System.out.println("사용자가 이겼습니다");
            }
        }
    }
}