
package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode2 {
}

//https://leetcode.com/problems/search-insert-position/
//35. Search Insert Position
//Easy
//Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
//You must write an algorithm with O(log n) runtime complexity.
//
//Example 1:
//Input: nums = [1,3,5,6], target = 5
//Output: 2
//
//Example 2:
//Input: nums = [1,3,5,6], target = 2
//Output: 1
//
//Example 3:
//Input: nums = [1,3,5,6], target = 7
//Output: 4
//
//Example 4:
//Input: nums = [1,3,5,6], target = 0
//Output: 0
//
//Example 5:
//Input: nums = [1], target = 0
//Output: 0
//
//Constraints:
//
//    1 <= nums.length <= 104
//    -104 <= nums[i] <= 104
//    nums contains distinct values sorted in ascending order.
//    -104 <= target <= 104


class Solution31 {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = nums[mid];

            if (midVal < target)
                low = mid + 1;
            else if (midVal > target)
                high = mid - 1;
            else
                return mid; // key found
        }
        return low;  // key not found.
    }
}


/*
https://leetcode.com/problems/container-with-most-water/
11. Container With Most Water
Medium

Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). 
n vertical lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0). 
Find two lines, which, together with the x-axis forms a container, such that the container contains the most water.

Notice that you may not slant the container.

Example 1:
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

Example 2:
Input: height = [1,1]
Output: 1

Example 3:
Input: height = [4,3,2,1,4]
Output: 16

Example 4:
Input: height = [1,2,1]
Output: 2

Constraints:
    n == height.length
    2 <= n <= 105
    0 <= height[i] <= 104
*/

class Solution32 {
    public int maxArea(int[] height) {
        if(height.length < 2) return 0;
        
        int tempArea;
        int max = 0;
        
        //Наивный перебор:
//        for(int i = 0; i < height.length - 1; i++){
//            for(int j = i+1; j < height.length; j++){
//                tempArea = (j-i) * Math.min(height[i], height[j]);
//                if(tempArea > max) max = tempArea;
//            }
//        }

        int i = 0;
        int j = height.length - 1;
        
        while(i < j){
            tempArea = (j - i) * Math.min(height[i], height[j]);
            max = Math.max(tempArea, max);
            
            if(height[i] > height[j])
                j--;
            else
                i++;
        }
        
        return max;
    }    
}


/*
https://leetcode.com/problems/restore-ip-addresses/
93. Restore IP Addresses
Medium
Given a string s containing only digits, return all possible valid IP addresses that can be obtained from s. You can return them in any order.
A valid IP address consists of exactly four integers, each integer is between 0 and 255, separated by single dots and cannot have leading zeros. 
For example, "0.1.2.201" and "192.168.1.1" are valid IP addresses and "0.011.255.245", "192.168.1.312" and "192.168@1.1" are invalid IP addresses. 

Example 1:
Input: s = "25525511135"
Output: ["255.255.11.135","255.255.111.35"]

Example 2:
Input: s = "0000"
Output: ["0.0.0.0"]

Example 3:
Input: s = "1111"
Output: ["1.1.1.1"]

Example 4:
Input: s = "010010"
Output: ["0.10.0.10","0.100.1.0"]

Example 5:
Input: s = "101023"
Output: ["1.0.10.23","1.0.102.3","10.1.0.23","10.10.2.3","101.0.2.3"]

Constraints:
    0 <= s.length <= 3000
    s consists of digits only.
*/

class Solution33 {
    public List<String> restoreIpAddresses(String s) {
        List<String> listIP = new ArrayList<>();
        
        if(s.length() < 4 || s.length() > 12) return listIP;
        
        int[] dig = new int[s.length()];
        for(int i=0; i<s.length(); i++){
            dig[i] = s.charAt(i) - '0';
        }
        
        for(int i1 = 1; i1 <= 3; i1++){
            for(int i2 = 1; i2 <= 3; i2++){
                for(int i3 = 1; i3 <= 3; i3++){
                    
                }
            }
        }
        
        return listIP;
    }
}

/*
https://leetcode.com/problems/palindrome-number/
9. Palindrome Number
Easy

Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward.
    For example, 121 is a palindrome while 123 is not.

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

Constraints:
    -231 <= x <= 231 - 1
 
Follow up: Could you solve it without converting the integer to a string?
*/

class Solution34 {
    public boolean isPalindrome(int x) {
        StringBuilder sb = new StringBuilder();
        sb.append(x);
        String s1 = sb.toString();
        String s2 = sb.reverse().toString();
        return (s1.equals(s2));
    }
}


/*
https://leetcode.com/problems/divide-two-integers/
29. Divide Two Integers
Medium

Given two integers dividend and divisor, divide two integers without using multiplication, division, and mod operator.
The integer division should truncate toward zero, which means losing its fractional part. 
For example, 8.345 would be truncated to 8, and -2.7335 would be truncated to -2.
Return the quotient after dividing dividend by divisor.
Note: Assume we are dealing with an environment that could only store integers 
within the 32-bit signed integer range: [−231, 231 − 1]. For this problem, 
if the quotient is strictly greater than 231 - 1, then return 231 - 1, and 
if the quotient is strictly less than -231, then return -231.

Example 1:

Input: dividend = 10, divisor = 3
Output: 3
Explanation: 10/3 = 3.33333.. which is truncated to 3.

Example 2:

Input: dividend = 7, divisor = -3
Output: -2
Explanation: 7/-3 = -2.33333.. which is truncated to -2.

Constraints:
    -231 <= dividend, divisor <= 231 - 1
    divisor != 0
*/
class Solution35 {
    public int divide(int dividend, int divisor) {
        if(divisor==-1 && dividend==Integer.MIN_VALUE){
            return Integer.MAX_VALUE;
        }
        
        boolean minusSign = (dividend < 0) ^ (divisor < 0);
        
        dividend = dividend < 0 ? dividend : -dividend;
        divisor = divisor < 0 ? divisor : -divisor;
        
        int result = 0;
        while(dividend <= divisor){
            dividend -= divisor;
            result++;
        }
        
        return minusSign ? -result : result;
    }
}


