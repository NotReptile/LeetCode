import java.util.HashMap;
import java.util.Scanner;

public class LeetCode20 {
    HashMap <Character,Integer> hashMap = new HashMap<>();
    private int k =0;
    public void setHashMap(){
        hashMap.put('(',1);
        hashMap.put(')',9);
        hashMap.put('{',2);
        hashMap.put('}',8);
        hashMap.put('[',3);
        hashMap.put(']',7);
    }
    public boolean isValid(String s) {
        if (hashMap.get(s.charAt(0)) == 9
                    || hashMap.get(s.charAt(0)) == 8
                    || hashMap.get(s.charAt(0)) == 7)
            return false;
        if (hashMap.get(s.charAt(s.length() - 1)) == 1
                    || hashMap.get(s.charAt(s.length() - 1)) == 2
                    || hashMap.get(s.charAt(s.length() - 1)) == 3)
            return false;
        if (s.length() % 2 != 0)
            return false;
        else {
            for (int i = 0; i < s.length(); i++) {
                k = k + hashMap.get(s.charAt(i));
            }
            return k % 10 == 0;
        }
    }

    public static void main(String[] args) {
        LeetCode20 leetCode20 = new LeetCode20();
        leetCode20.setHashMap();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        try {
            System.out.println(leetCode20.isValid(s));
        } catch (Exception e){
            System.out.println("Wrong Input");
        }
    }
}