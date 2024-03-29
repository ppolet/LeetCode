
package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
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



/*
https://leetcode.com/problems/find-peak-element/
162. Find Peak Element
Medium

A peak element is an element that is strictly greater than its neighbors.
Given an integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.
You may imagine that nums[-1] = nums[n] = -∞.
You must write an algorithm that runs in O(log n) time.

Example 1:

Input: nums = [1,2,3,1]
Output: 2
Explanation: 3 is a peak element and your function should return the index number 2.

Example 2:

Input: nums = [1,2,1,3,5,6,4]
Output: 5
Explanation: Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.
*/

class Solution36 {
    public int findPeakElement(int[] nums) {
        int result = -1;
        int[] sortNums = nums.clone();
        Arrays.sort(sortNums);
        int len = nums.length;
        for(int i = 0; i < len; i++){
            if (nums[i] == sortNums[len-1]) {
                result = i;
                break;
            }
        }
        return result;
    }
}


/*
https://leetcode.com/problems/compare-version-numbers/
165. Compare Version Numbers
Medium

Given two version numbers, version1 and version2, compare them.
Version numbers consist of one or more revisions joined by a dot '.'. 
Each revision consists of digits and may contain leading zeros. Every revision contains at least one character. 
Revisions are 0-indexed from left to right, with the leftmost revision being revision 0, 
the next revision being revision 1, and so on. For example 2.5.33 and 0.1 are valid version numbers.

To compare version numbers, compare their revisions in left-to-right order. 
Revisions are compared using their integer value ignoring any leading zeros. 
This means that revisions 1 and 001 are considered equal. 
If a version number does not specify a revision at an index, then treat the revision as 0. 
For example, version 1.0 is less than version 1.1 because their revision 0s are the same, but their revision 1s are 0 and 1 respectively, and 0 < 1.

Return the following:

    If version1 < version2, return -1.
    If version1 > version2, return 1.
    Otherwise, return 0.

Example 1:

Input: version1 = "1.01", version2 = "1.001"
Output: 0
Explanation: Ignoring leading zeroes, both "01" and "001" represent the same integer "1".

Example 2:

Input: version1 = "1.0", version2 = "1.0.0"
Output: 0
Explanation: version1 does not specify revision 2, which means it is treated as "0".

Example 3:

Input: version1 = "0.1", version2 = "1.1"
Output: -1
Explanation: version1's revision 0 is "0", while version2's revision 0 is "1". 0 < 1, so version1 < version2.

Constraints:
    1 <= version1.length, version2.length <= 500
    version1 and version2 only contain digits and '.'.
    version1 and version2 are valid version numbers.
    All the given revisions in version1 and version2 can be stored in a 32-bit integer.
*/

class Solution37 {
    public int compareVersion(String version1, String version2) {
        String[] verStr1 = version1.split("\\.");
        String[] verStr2 = version2.split("\\.");

        int ver1len = verStr1.length;
        int ver2len = verStr2.length;
                       
        int[] ver1 = new int[ver1len];
        for(int i = 0; i < ver1len; i++){
            ver1[i] = Integer.parseInt(verStr1[i]);
        }
                       
        int[] ver2 = new int[ver2len];
        for(int i = 0; i < ver2len; i++){
            ver2[i] = Integer.parseInt(verStr2[i]);
        }
        
        int result = 0;
        int count = 0;
        int maxCount = (ver1len > ver2len) ? ver1len : ver2len;
        int a, b;
        while(result == 0 && count < maxCount){
            a = 0; 
            b = 0;
            if (count < ver1len) a = ver1[count];
            if (count < ver2len) b = ver2[count];
            
            if(a < b) result = -1;
            if(a > b) result = 1;
            count++;
        }
        
        return result;
    }
}


/*
https://leetcode.com/problems/excel-sheet-column-title/
168. Excel Sheet Column Title
Easy

Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...

Example 1:

Input: columnNumber = 1
Output: "A"

Example 2:

Input: columnNumber = 28
Output: "AB"

Example 3:

Input: columnNumber = 701
Output: "ZY"

Constraints:
    1 <= columnNumber <= 2^31 - 1
*/

class Solution38 {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        int n = columnNumber;
        while(n > 0){
            n--;
            result.insert(0, (char)('A' + n % 26));
            n /= 26;
        }
        return result.toString();
    }
}


/*
https://leetcode.com/problems/multiply-strings/
43. Multiply Strings
Medium

Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.

Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.

Example 1:

Input: num1 = "2", num2 = "3"
Output: "6"

Example 2:

Input: num1 = "123", num2 = "456"
Output: "56088"

Constraints:
    1 <= num1.length, num2.length <= 200
    num1 and num2 consist of digits only.
    Both num1 and num2 do not contain any leading zero, except the number 0 itself.
*/
/*
      123
     *456
  -------
      738
     615
    492
  -------
    56088
*/

class Solution39 {
    public String multiply(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int temp = 0;
        int temp2 = 0;
 
        StringBuilder[] line = new StringBuilder[num2.length()];
        for(int i2 = num2.length()-1; i2>=0; i2--){
            int k = 0;
            int numIndex = 0;
            for(int i1 = num1.length()-1; i1>=0; i1--){
                temp = (num1.charAt(i1) - '0') * (num2.charAt(i2) - '0') + temp/10;  //умножаем числа и добавляем значение "в уме"
                if(i2 == num2.length()-1){  //первая строка
                    result.insert(0, temp % 10);
                } else {                    //не первая строка
                    numIndex = result.length() - num2.length() + i2 - k;
                    if(numIndex >= 0){
                        temp2 = (temp % 10) + (result.charAt(numIndex) - '0') + (temp2 / 10);
                        result.setCharAt(numIndex, (char)((temp2 % 10) + '0'));
                    } else {
                        result.insert(0, temp + temp2 / 10);
                        temp = 0;
                        temp2 = 0;
                    }
                    k++;
                }
                //line[i2] = line[i2].insert(0, ("" + temp % 10));
            }
//            if(temp / 10 != 0) result.insert(0, temp / 10 + temp2 / 10);
            if(temp/10 + temp2/10 != 0) result.insert(0, temp / 10 + temp2 / 10);
            temp = 0;
            temp2 = 0;
        }
        
        String newResult = "";
        for(int i = 0; i < result.length(); i++){
            if(result.charAt(i) != '0' || i == result.length()-1){
                newResult = result.substring(i, result.length());
                break;
            }
        }
        
        return newResult;
    }
}
    
/*
https://leetcode.com/problems/largest-number/
179. Largest Number
Medium

Given a list of non-negative integers nums, arrange them such that they form the largest number and return it.

Since the result may be very large, so you need to return a string instead of an integer.

Example 1:
Input: nums = [10,2]
Output: "210"

Example 2:
Input: nums = [3,30,34,5,9]
Output: "9534330"

510 51
51 510 *
51 520
520 51 *
511 51
51 511 *

Constraints:
    1 <= nums.length <= 100
    0 <= nums[i] <= 109
*/
class Solution40{
    public String largestNumber(int[] nums) {
        Integer[] numsInteger = new Integer[nums.length];
        int n = 0;
        for (int value : nums) {
            numsInteger[n++] = Integer.valueOf(value);
        }

        Arrays.sort(numsInteger, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                
                //кол-во знаков в числе
                long k = 10;
                while(k <= b){
                    k *= 10;
                }
                long res1 = a*k + b;
                
                k = 10;
                while(k <= a){
                    k *= 10;
                }
                long res2 = b*k + a;
                
                return Long.compare(res2, res1);
            }
        });     

        StringBuilder result = new StringBuilder();
        for (Integer num : numsInteger) {
            result.append(num);
        }
        
        return result.charAt(0) == '0' ? "0" : result.toString();
        
    }
}


/*
https://leetcode.com/problems/powx-n/
50. Pow(x, n)
Medium

Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

Example 1:
Input: x = 2.00000, n = 10
Output: 1024.00000

Example 2:
Input: x = 2.10000, n = 3
Output: 9.26100

Example 3:
Input: x = 2.00000, n = -2
Output: 0.25000
Explanation: 2-2 = 1/22 = 1/4 = 0.25

Constraints:
    -100.0 < x < 100.0
    -2^31 <= n <= 2^31-1
    n is an integer.
    -10^4 <= xn <= 10^4
*/

class Solution41 {
    public double myPow(double x, int n) {
        double result = 1;
        
        if(n == 0) return 1;
       
        long absN = n;
        if(n < 0) absN = -1L * n;
        
        while(absN > 0){
            if(absN % 2 == 0){
                x = x * x;
                absN /= 2;
            } else {
                result = result * x;
                absN -= 1;
            }
        }
        
        return n > 0 ? result : 1 / result;
    }
}

/*
https://leetcode.com/problems/add-binary/
67. Add Binary
Easy

Given two binary strings a and b, return their sum as a binary string.

Example 1:
Input: a = "11", b = "1"
Output: "100"

Example 2:
Input: a = "1010", b = "1011"
Output: "10101"

11 11      0 
Constraints:
    1 <= a.length, b.length <= 104
    a and b consist only of '0' or '1' characters.
    Each string does not contain leading zeros except for the zero itself.
*/

class Solution42 {
    public String addBinary(String a, String b) {
        //if(a.equals("0") && b.equals("0")) return "0";
        
        StringBuilder res = new StringBuilder();
        
        int mem = 0;
        int temp = 0;
        
        int j = 1;
        int tempA, tempB;
        while(a.length() >= j || b.length() >= j){
            tempA = (a.length() >= j) ? a.charAt(a.length() - j) - '0' : 0;
            tempB = (b.length() >= j) ? b.charAt(b.length() - j) - '0' : 0;
            temp = tempA + tempB + mem;
            if(temp == 3){
                res.append('1');
                mem = 1;
            } else if (temp == 2) {
                res.append('0');
                mem = 1;
            } else {
                res.append(temp);
                mem = 0;
            }
            j++;
        }
        if(mem == 1) res.append(mem);
        
        return res.reverse().toString();
    }
}