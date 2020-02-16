package com.company;

import java.util.ArrayList;

public class Question4 {
    public static void main(String[] args) {
        System.out.println(findLongestPalindrome("adad"));
        System.out.println(findLongestPalindrome("admadamad"));
        System.out.println(findLongestPalindrome("aabbmadam"));
        System.out.println(findLongestPalindrome("abc"));
        System.out.println(findLongestPalindrome(""));
    }
    public static String findLongestPalindrome(String s) {
        int length =s.length();
        String substring = "" ;
        String reverse = " ";
        int maxLength = 0;
        String palindrome = "";

        for(int i = 0; i < length; i++) {
            for(int j = i; j <= length; j++){
                    substring = s.substring(i, j);
                    StringBuilder sb = new StringBuilder(substring);
                    reverse = sb.reverse().toString();
                    if((reverse.equals(substring)) && (maxLength < substring.length())) {
                        maxLength = substring.length();
                        palindrome = substring;
                    }
            }
        }
        return palindrome;
    }
}
