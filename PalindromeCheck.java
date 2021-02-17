// 使用递归方式判断某个字串是否是回文（ palindrome ）。
// “回文”是指正着读、反着读都一样的句子。比如“我是谁是我”。

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        System.out.println("Please enter a string: ");

        Scanner input = new Scanner(System.in);
        String inputString = input.nextLine();
        if(IsPalindrome(inputString)) {
            System.out.println("\"" + inputString + "\"" + " is a palindrome!!!");
        }
        else {
            System.out.println("\"" + inputString +"\"" + " is not a palindrome!!!");
        }
    }

    public static boolean IsPalindrome(String str) {
        int len = str.length();

        if(len > 1) {
            if(str.charAt(0) == str.charAt(len - 1)) {
                IsPalindrome(str.substring(1, len - 1));
            }
            else {
                return false;
            }
        }

        return true;
    }
}
