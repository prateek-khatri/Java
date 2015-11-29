/*3.	Given a string, determine if it is a palindrome, 
 * considering only alphanumeric characters and ignoring cases. 
 * For example, "A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome. 
Have you consider that the string might be empty? 
This is a good question to ask during an interview. F
or the purpose of this problem, we define empty string as valid palindrome.
*/
package com.pack.java;

public class PaliJava {
    public static boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int head = 0, tail = s.length() - 1;
        char cHead, cTail;
        while(head <= tail) {
            cHead = s.charAt(head);
            cTail = s.charAt(tail);
            if (!Character.isLetterOrDigit(cHead)) {
                head++;
            } else if(!Character.isLetterOrDigit(cTail)) {
                tail--;
            } else {
                if (Character.toLowerCase(cHead) != Character.toLowerCase(cTail)) {
                    return false;
                }
                head++;
                tail--;            }
        }        return true;
    }

	
public static void main(String[] args) {
System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
System.out.println(isPalindrome("race a car"));
}



}
