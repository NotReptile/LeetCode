import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class myAtoiFunc {
    public int myAtoi(String s){
        ArrayList<Object> numbers = new ArrayList<>();
        Character[] chars = {'1','2','3','4','5','6','7','8','9'};
        Collections.addAll(numbers, chars);
        int x = 0;
        StringBuilder c = new StringBuilder();
        if(s.length() == 0)
            return 0;
        for (int i = 0; i <s.length(); i++){
            if (s.charAt(i) != ' ' && numbers.contains(s.charAt(i)))
                 c.append(s.charAt(i));
        }
        x = Integer.parseInt(String.valueOf(c));
        return x;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input string: ");
        String s =  scan.nextLine();
        myAtoiFunc solution = new myAtoiFunc();
        System.out.println(solution.myAtoi(s));
    }
}
