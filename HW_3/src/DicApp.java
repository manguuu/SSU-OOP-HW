import java.util.Scanner;

public class DicApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dictionary dictionary = new Dictionary();
        System.out.println("한영 단어 검색 프로그램 입니다.");
        System.out.print("한글 단어?");
        String word = sc.next();
        while (!word.equals("그만")) {
            System.out.println(dictionary.kor2Eng(word));
            System.out.print("한글 단어?");
            word = sc.next();
        }
    }
}

class Dictionary {
    private static String[] kor = {"사랑", "아기", "돈", "미래", "희망"};
    private static String[] eng = {"love", "baby", "money", "future", "hope"};
    public static String kor2Eng(String word) {
        for (int i = 0; i < kor.length; i++) {
            if (word.equals(kor[i])) return (kor[i] + "은 " + eng[i]);
        }
        return (word + "는 저의 사전에 없습니다.");
    }
}
