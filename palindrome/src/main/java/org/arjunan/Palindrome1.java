package org.arjunan;

/**
 * Hello world!
 *
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 *
 *
 *
 * Example 1:
 *
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 * Example 2:
 *
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * Example 3:
 *
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 *
 */
public class Palindrome1
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {

        int remainder = 0 , reverse = 0 ;
                int y = x;

        if(x < 0){
            return false;
        }


        while(x != 0 ){
            remainder = x % 10; // dividing any number with 10 will return , balance number
            System.out.println("remainder Value is : "+ remainder);
            reverse = reverse * 10 + remainder; // initially  reverse value will be zero , so remainder = reverse
            // then , next iteration remainder = reverse
            System.out.println("reverse Value is : "+ reverse);
            x /= 10; //  dividend value
            System.out.println("X Value is : "+ x);
        }

        return reverse == y;
    }
}
