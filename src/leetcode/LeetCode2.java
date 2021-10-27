
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




