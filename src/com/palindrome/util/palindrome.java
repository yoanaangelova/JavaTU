package com.palindrome.util;
import java.util.Scanner;
public class palindrome {
    public static boolean isPalindrome(String text) {
        if (text == null) {
            return false;
        }

        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start++) != text.charAt(end--)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(isPalindrome(text));
    }
}


