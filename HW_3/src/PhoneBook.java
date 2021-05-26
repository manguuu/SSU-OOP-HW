import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("인원수>>");
        int num = sc.nextInt();

        Phone[] person = new Phone[num];
        for (int i = 0; i < num; i++) {
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없는 입력)>>");
            person[i] = new Phone();
            person[i].name = sc.next();
            person[i].tel = sc.next();
        }
        System.out.println("저장되었습니다...");

        System.out.print("검색할 이름>>");
        String input = sc.next();
        while (!input.equals("그만")) {
            System.out.println(Phone.find(input, person));
            System.out.print("검색할 이름>>");
            input = sc.next();
        }
        sc.close();
    }
}

class Phone {
    String name;
    String tel;
    public static String find(String input, Phone[] person) {
        for (int i = 0; i < person.length; i++) {
            if (input.equals(person[i].name)) return (person[i].name + "의 번호는 " + person[i].tel + " 입니다");
        }
        return (input + "이 없습니다.");
    }
}