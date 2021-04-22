import java.util.Scanner;

public class Num8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        boolean checkFirst = inReact(x1, y1, 100, 100, 200, 200);
        boolean checkSecond = inReact(x2, y2, 100, 100, 200, 200);
        if (checkFirst != checkSecond)
            System.out.println("충동");
        else System.out.println("충돌 안함");
    }

    public static boolean inReact(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
        if ((rectx1 <= x && x <= rectx2) && (recty1 <= y && y <= recty2)) return true;
        else return false;
    }
}
