public class DictionaryApp {
    public static void main(String[] args) {
        Dictionary dic = new Dictionary(10);
        dic.put("황기태", "자바");
        dic.put("이재문", "파이썬");
        dic.put("이재문", "C++");
        System.out.println("이재문의 값은 " + dic.get("이재문"));
        System.out.println("황기태의 값은 " + dic.get("황기태"));
        dic.delete("황기태");
        System.out.println("황기태의 값은 " + dic.get("황기태"));
    }
}

abstract class PairMap {
    protected String[] keyArray;
    protected String[] valueArray;
    abstract String get(String key);
    abstract void put(String key, String value);
    abstract String delete(String key);
    abstract int length();
}

class Dictionary extends PairMap {
    private int size, endIndex;
    Dictionary(int n) {
        keyArray = new String[n];
        valueArray = new String[n];
        size = 0;
        endIndex = 0;
    }

    String get(String key) {
        String ans = null;
        for (int i = 0; i < keyArray.length; i++) {
            if (key.equals(keyArray[i])) ans = valueArray[i];
        }
        return ans;
    }

    void put(String key, String value) {
        for (int i = 0; i < keyArray.length; i++) {
            if (key.equals(keyArray[i])) {
                valueArray[i] = value;
                size++;
                return;
            }
        }
        if (size < keyArray.length) {
            keyArray[endIndex] = key;
            valueArray[endIndex] = value;
            endIndex++;
            size++;
        }
    }

    String delete(String key) {
        String ans = null;
        for (int i = 0; i < keyArray.length; i++) {
            if (keyArray[i].equals(key)) {
                ans = valueArray[i];
                valueArray[i] = null;
                size--;
                break;
            }
        }
        return ans;
    }

    int length() {
        return size;
    }
}

