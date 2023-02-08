import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class LeetCode20 {
    HashMap <Character,Integer> hashMap = new HashMap<>();
    LinkedList<Integer> indexList = new LinkedList<>();
    private int k =0;
    public void setHashMap(){
        hashMap.put('(',1);
        hashMap.put(')',-1);
        hashMap.put('{',2);
        hashMap.put('}',-2);
        hashMap.put('[',3);
        hashMap.put(']',-3);
    }
    public boolean isValid(String s) {
        if (hashMap.get(s.charAt(0)) < 0 || hashMap.get(s.charAt(s.length() - 1)) > 0)
            return false;
        if (s.length() % 2 != 0)
            return false;
        else {
            for (int i = 0; i < s.length(); i++) {
                k = k + hashMap.get(s.charAt(i));
                if (hashMap.get(s.charAt(i)) > 0){
                    indexList.add(i);
                }
                if (hashMap.get(s.charAt(i)) < 0) {
                    if (indexList.isEmpty())
                        return false;
                    if (Math.abs(hashMap.get(s.charAt(i))) != Math.abs(hashMap.get(s.charAt(indexList.pollLast())))){
                        return false;
                    }
                }
            }
            return k == 0;
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