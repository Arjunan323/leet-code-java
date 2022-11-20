package org.arjunan;

import java.util.Arrays;

/**
 * Hello world!
 *
 */

/*
* Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
*
*
* */


public class Version1
{
    public static void main( String[] args )
    {

        int[] a = new int[] {0,4,3,0}; // Test Cases

        int[] ints = twoSum(a, 0);

        System.out.println(Arrays.toString(ints));
    }

    public static int[] twoSum(int[] numbers, int target) {

        int remaining = 0;
        int[] equal = new int[2];

        for(int i=0; i< numbers.length; i++){
            if(numbers[i] == target){
                equal[0] = numbers[i];

                for(int f=0; f< numbers.length; f++){
                    if(i != f && numbers[i] == numbers[f]){
                        equal[1] =  f;
                        break;
                    }
                }

                return equal;
            }else {
                remaining = target - numbers[i];

                for(int j=0; j< numbers.length; j++){
                    if(i != j && remaining == numbers[j]){
                        equal[0] =  i;
                        equal[1] =  j;
                        return equal;
                    }
                }
            }

        }

        return equal;
    }
}
