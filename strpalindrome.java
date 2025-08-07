import java.util.*;

public class strpalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String original_s = s;
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);
        if (original_s.equals(rev))
            System.out.println("it is a palindrome");
        else
            System.out.println("it's not a palindrme");
    }
}