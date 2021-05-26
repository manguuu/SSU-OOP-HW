public class Num10 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int[] chose = new int[10];
        int[] output = new int[16];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 10 + 1);
        }
        for (int i = 0; i < chose.length; i++) {
            chose[i] = (int)(Math.random() * 16);
            for (int j = 0; j < i; j++) {
                if (chose[j] == chose[i]) {
                    i--;
                    break;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            output[chose[i]] = arr[i];
        }
        for (int i = 0; i < 16; i++) {
            System.out.print(output[i] + " ");
            if (i % 4 == 3) System.out.println();
        }
    }
}
