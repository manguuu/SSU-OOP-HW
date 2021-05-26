import java.util.InputMismatchException;
import java.util.Scanner;

public class Num12 {
    public static void main(String[] args) {

        String[][] seat = new String[3][10];
        Booking.resetSeat(seat);

        Scanner sc = new Scanner(System.in);
        System.out.println("명품콘서트홀 예약 시스템입니다.");

        while (true) {
            Booking.showMenu();
            int menu;
            while (true) {
                while (true) {
                    try {
                        menu = sc.nextInt();
                        break;
                    } catch (InputMismatchException e) {
                        System.out.print("다시 입력하세요>> ");
                        sc.nextLine();
                    }
                }
                if (0 < menu && menu <= 4) break;
                System.out.print("다시 입력하세요>> ");
            }
            switch (menu) {
                case 1 :
                    Booking.book(seat);
                    break;
                case 2 :
                    Booking.showSeatAll(seat);
                    break;
                case 3 :
                    Booking.cancle(seat);
                    break;
                case 4 :
                    return;
            }
        }
    }
}

class Booking {
    //case 1 : book
    public static void book(String[][] seat) {
        Scanner sc = new Scanner(System.in);
        int line;
        while (true) {
            showSeatSeparation();
            while (true) {
                try {
                    line = sc.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.print("다시 입력하세요>> ");
                    sc.nextLine();
                }
            }
            if (0 < line && line <= 3) break;
            System.out.print("다시 입력하세요>> ");
        }
        showSeat(line, seat);

        System.out.print("이름>> ");
        String name = sc.next();

        int num;
        while (true) {
            System.out.print("번호>> ");
            while (true) {
                try {
                    num = sc.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.print("다시 입력하세요>> ");
                    sc.nextLine();
                }
            }
            if (0 < num && num <= 10) break;
            System.out.print("다시 입력하세요>> ");
        }
        seat[line - 1][num - 1] = name;
    }

    //case 3 : cancle
    public static void cancle(String[][] seat) {
        Scanner sc = new Scanner(System.in);
        System.out.print("좌석 S:1, A:2, B:3 >> ");

        int line;
        while (true) {
            while (true) {
                try {
                    line = sc.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.print("다시 입력하세요>> ");
                    sc.nextLine();
                }
            }
            if (0 < line && line <= 3) break;
            System.out.print("다시 입력하세요>> ");
        }
        showSeat(line, seat);
        System.out.print("이름>> ");

        exit_while:
        while (true) {
            String name;
            while (true) {
                try {
                    name = sc.next();
                    break;
                } catch (InputMismatchException e) {
                    System.out.print("다시 입력하세요>> ");
                    sc.nextLine();
                }
            }
            for (int i = 0; i < 10; i++) {
                if(seat[line - 1][i].equals(name)) {
                    seat[line - 1][i] = "___";
                    break exit_while;
                }
            }
            System.out.print("다시 입력하세요>> ");
        }
    }

    public static void showSeatSeparation() {
        System.out.print("좌석구분 S(1), A(2), B(3)>> ");
    }

    public static void showSeat(int line, String[][] seat) {
        char[] lineName = {'S', 'A', 'B'};
        System.out.print(lineName[line - 1] + ">>");
        for (int i = 0; i < seat[line - 1].length; i++) {
            System.out.print(seat[line - 1][i] + " ");
        }
        System.out.println();
    }

    public static void showSeatAll(String[][] seat) {
        for (int i = 1; i <= 3; i++) showSeat(i, seat);
        System.out.println("<<<조회를 완료하였습니다.>>>");
    }

    public static void showMenu() {
        System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>> ");
    }

    public static void resetSeat(String[][] seat) {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 10; j++)
                seat[i][j] = "___";
    }
}

