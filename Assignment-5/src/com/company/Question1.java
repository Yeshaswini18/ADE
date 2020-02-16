package com.company;

import java.util.HashSet;
import java.util.Set;
public class Question1 {
    public static void main(String[] args) {
        System.out.println(firstUniqueCharacter("eeee"));
        System.out.println(firstUniqueCharacter("leetcode"));
        System.out.println(firstUniqueCharacter("classroom"));
        System.out.println(firstUniqueCharacter("aacv"));
        System.out.println(firstUniqueCharacter("aaaacvvvv"));
        System.out.println(firstUniqueCharacter("loveleetcode"));
        System.out.println(firstUniqueCharacter(""));
    }

    private static int firstUniqueCharacter(String s) {
        char[] charArray = s.toCharArray();
        int j = 1;
        Set<Character> repeating = new HashSet<>();
        boolean found = false;

        for (int i = 0; i < charArray.length; i++) {
            int k = j;
            found = repeating.contains(charArray[i]);
            if(!found) {
                while(k < charArray.length) {
                    if(charArray[i] == charArray[k]){
                        int a = 0;
                        repeating.add(charArray[i]);
                        a++;
                        break;
                    }
                    k++;
                }
            }
            j++;
            if((k == charArray.length) && !found) {
                return i;
            }
        }
        return -1;
    }
}
