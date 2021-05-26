import java.util.Scanner;

public class Num14 {
    public static void main(String[] args) {
        String[] course = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
        int[] score = {95, 88, 76, 62, 55};

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("과목이름>>");
            String input = sc.next();
            if (input.equals("그만")) break;
            for (int i = 0; i < course.length; i++) {
                if (input.equals(course[i])) {
                    System.out.println(input + "의 점수는 " + score[i]);
                    break;
                } else if (i == course.length - 1) {
                    System.out.println("없는 과목 입니다.");
                    break;
                }
            }
        }
    }
}
