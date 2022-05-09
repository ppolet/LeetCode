/*
LeetCode
 */
package leetcode;

import java.lang.annotation.Repeatable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import leetcode.LeetCode2;

/**
 *
 * @author USER
 */




//https://leetcode.com/explore/interview/card/top-interview-questions-easy/97/dynamic-programming/566/
//Given an integer array nums, find the contiguous subarray (containing at least one number)
//which has the largest sum and return its sum.
//
//Example:
//
//Input: [-2,1,-3,4,-1,2,1,-5,4],
//Output: 6
//Explanation: [4,-1,2,1] has the largest sum = 6.
//
//Follow up:
//
//If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach,
//which is more subtle.

class Solution {
    public int maxSubArray(int[] nums) {

        int maxSum = nums[0];
        int sum;
        int count = nums.length;
        for(int i=0; i<count; i++){
            if (maxSum<nums[i]){
                maxSum = nums[i];
                if (maxSum>=0) break;
            }
        }
        for(int i=0; i<count; i++){
            if (nums[i]<=0) continue;
            sum = 0;
            for(int j=i; j<count; j++){
                sum += nums[j];
                if (maxSum<sum) maxSum = sum;
            }
        }

        return maxSum;
    }
}


class Solution2 {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length < 1) {
            return 0;
        }

        int maxSumTotal = nums[0];
        int maxSumIndex = nums[0];

        for(int i = 1; i< nums.length; i++) {
            maxSumIndex = Math.max(nums[i], maxSumIndex + nums[i]);
            maxSumTotal = Math.max(maxSumTotal, maxSumIndex);
        }

        return maxSumTotal;
    }
}



//https://leetcode.com/explore/interview/card/top-interview-questions-easy/97/dynamic-programming/572/
//Say you have an array for which the ith element is the price of a given stock on day i.
//
//If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock),
//design an algorithm to find the maximum profit.
//
//Note that you cannot sell a stock before you buy one.
//
//Example 1:
//
//Input: [7,1,5,3,6,4]
//Output: 5
//Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//             Not 7-1 = 6, as selling price needs to be larger than buying price.
//
//Example 2:
//
//Input: [7,6,4,3,1]
//Output: 0
//Explanation: In this case, no transaction is done, i.e. max profit = 0.
// 99,21% :)
class Solution3 {
    public int maxProfit(int[] prices) {
        int count = prices.length;
        if (count == 1 || count == 0) return 0;
        int profit = 0;
        int minP = prices[0];
        for (int i=0; i<count; i++){
            if (i+1<count && prices[i+1]>prices[i]){
                if(prices[i]<minP){
                    minP = prices[i];
                }
                if (prices[i+1]-minP > profit) profit = prices[i+1]-minP;
            }
        }

        return profit;
    }
}



//https://leetcode.com/explore/interview/card/top-interview-questions-easy/97/dynamic-programming/576/
//House Robber
//
//You are a professional robber planning to rob houses along a street.
//Each house has a certain amount of money stashed, the only constraint stopping you from robbing
//each of them is that adjacent houses have security system connected and it will automatically contact the police
//if two adjacent houses were broken into on the same night.
//
//Given a list of non-negative integers representing the amount of money of each house,
//determine the maximum amount of money you can rob tonight without alerting the police.
//
//Example 1:
//
//Input: [1,2,3,1]
//Output: 4
//Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
//             Total amount you can rob = 1 + 3 = 4.
//
//Example 2:
//
//Input: [2,7,9,3,1]
//Output: 12
//Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
//             Total amount you can rob = 2 + 9 + 1 = 12.
// [2,7,6,1,5,9,6,3,2] -

class Solution4 {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        int prev1 = 0;
        int prev2 = 0;
        for (int num : nums) {
            int tmp = prev1;
            prev1 = Math.max(prev2 + num, prev1);
            prev2 = tmp;
        }
        return prev1;
    }

    public int rob1(int[] nums){
        if(nums==null||nums.length==0)
            return 0;

        if(nums.length==1)
            return nums[0];

        int[] dp = new int[nums.length];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0], nums[1]);

        for(int i=2; i<nums.length; i++){
            dp[i] = Math.max(dp[i-2]+nums[i], dp[i-1]);
        }


        int s1 = nums[0];
        int s2 = Math.max(nums[0], nums[1]);
        int tmp = 0;
        for (int i = 2; i<nums.length; i++){
            tmp = s1;
            s1 = Math.max(s2 + nums[i], s1);
            s2 = tmp;
        }
        return s1;
        //return dp[nums.length-1];

    }

}


////https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/553/
//Delete Node in a Linked List
//
//Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
//
//Given linked list -- head = [4,5,1,9], which looks like following:
//
//Example 1:
//
//Input: head = [4,5,1,9], node = 5
//Output: [4,1,9]
//Explanation: You are given the second node with value 5, the linked list should become 4 -> 1 -> 9 after calling your function.
//
//Example 2:
//
//Input: head = [4,5,1,9], node = 1
//Output: [4,5,9]
//Explanation: You are given the third node with value 1, the linked list should become 4 -> 5 -> 9 after calling your function.
//
//Definition for singly-linked list.
class ListNode5 {
    int val;
    ListNode5 next;
    ListNode5(int x) { val = x; }
}

class Solution5 {
    public void deleteNode(ListNode5 node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}



////https://leetcode.com/explore/interview/card/top-interview-questions-easy/99/others/565/
//Number of 1 Bits
//
//Write a function that takes an unsigned integer and return the number of '1' bits it has (also known as the Hamming weight).
//
//Example 1:
//
//Input: 00000000000000000000000000001011
//Output: 3
//Explanation: The input binary string 00000000000000000000000000001011 has a total of three '1' bits.
//
//Example 2:
//
//Input: 00000000000000000000000010000000
//Output: 1
//Explanation: The input binary string 00000000000000000000000010000000 has a total of one '1' bit.
//
//Example 3:
//
//Input: 11111111111111111111111111111101
//Output: 31
//Explanation: The input binary string 11111111111111111111111111111101 has a total of thirty one '1' bits.

class Solution6 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
//
//        int sum = 0;
//        while(n>0){
//            sum += n % 10;
//            n /= 10;
//        }
        return Integer.bitCount(n);
    }
}


////https://leetcode.com/explore/interview/card/top-interview-questions-easy/99/others/721/
//Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//An input string is valid if:
//
//    Open brackets must be closed by the same type of brackets.
//    Open brackets must be closed in the correct order.
//
//Note that an empty string is also considered valid.
//
//Example 1:
//
//Input: "()"
//Output: true
//
//Example 2:
//
//Input: "()[]{}"
//Output: true
//
//Example 3:
//
//Input: "(]"
//Output: false
//
//Example 4:
//
//Input: "([)]"
//Output: false
//
//Example 5:
//
//Input: "{[]}"
//Output: true
//

class Solution7 {
    public boolean isValid(String s) {
        //{}()[]  1 -1 2 -2 3 -3
        //{[]}()  1 3 -3 -1 2 -2
        //{[}]    1 3 -1 -3
        //{{{[(])({[][]}[])}[]}}()   1 1 1 3 2 -3 -2

        s = s.replaceAll(" ", "");
        int n = s.length();
        boolean flag = true;
        while (n>0 && flag){
            n = s.length();
            s = s.replaceAll("\\(\\)|\\{\\}|\\[\\]", "");
            if (n == s.length()) flag = false;
        }

        return (s.length() == 0);
    }

    public boolean isValid2(String s){
        if (s.isEmpty()) {
            return true;
        }

        if (s == null || s.length() == 1) {
            return false;
        }

        char[] stack = new char[s.length()];
        int stackIndex = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack[stackIndex++] = ch;
                continue;
            }

            if (stackIndex == 0) {
                return false;
            }

            char popChar = stack[--stackIndex];
            if (ch == ')' && popChar != '(' ||
                ch == '}' && popChar != '{' ||
                ch == ']' && popChar != '[') {
                return false;
            }
        }

        return stackIndex == 0;

    }
}



////https://leetcode.com/explore/interview/card/top-interview-questions-easy/99/others/762/
//Hamming Distance
//
//The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
//
//Given two integers x and y, calculate the Hamming distance.
//
//Note:
//0 ≤ x, y < 231.
//
//Example:
//
//Input: x = 1, y = 4
//
//Output: 2
//
//Explanation:
//1   (0 0 0 1)
//4   (0 1 0 0)
//       ↑   ↑
//
//The above arrows point to positions where the corresponding bits are different.

class Solution8 {
    public int hammingDistance(int x, int y) {
        int s = x ^ y;
        int sum = 0;
        while(s>0){
            if (s%2 == 1) sum++;
            s = s >> 1;
        }
        return sum;
    }
}



////https://leetcode.com/explore/interview/card/top-interview-questions-easy/99/others/648/
//Reverse Bits
//
//Reverse bits of a given 32 bits unsigned integer.
//
//Example 1:
//
//Input: 00000010100101000001111010011100
//Output: 00111001011110000010100101000000
//Explanation: The input binary string 00000010100101000001111010011100 represents the unsigned integer 43261596,
//so return 964176192 which its binary representation is 00111001011110000010100101000000.
//
//Example 2:
//
//Input: 11111111111111111111111111111101
//Output: 10111111111111111111111111111111
//Explanation: The input binary string 11111111111111111111111111111101 represents the unsigned integer 4294967293,
//so return 3221225471 which its binary representation is 10111111111111111111111111111111.

class Solution9 {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
//        n = 0b11111111111111111111111111111101;
//        System.out.println("n: " + n);
//        System.out.println("bin: " + Integer.toBinaryString(n));
        long l = Integer.toUnsignedLong(n);
        long r = 0;
        for (int i = 1; i<=32; i++){
            r = (r << 1) + (l % 2);
            l = l >> 1;
        }
        return (int)r;
    }
}



////https://leetcode.com/explore/interview/card/top-interview-questions-easy/99/others/601/
//Pascal's Triangle
//
//Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
//
//
//In Pascal's triangle, each number is the sum of the two numbers directly above it.
//
//Example:
//
//Input: 5
//Output:
//[
//     [1],
//    [1,1],
//   [1,2,1],
//  [1,3,3,1],
// [1,4,6,4,1]
//]
class Solution10 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list1 = new ArrayList<List<Integer>>();
        List<Integer> row = new ArrayList<>();

        if (numRows == 0) return list1;

        row.add(1);
        list1.add(row);
        if (numRows == 1) return list1;

        row = new ArrayList();
        row.add(1);
        row.add(1);
        list1.add(row);
        if (numRows == 2) return list1;

        for (int i = 3; i<=numRows; i++){
            row = new ArrayList();
            row.add(1);
            for (int j = 0; j<i-2; j++){
                row.add(list1.get(i-2).get(j) + list1.get(i-2).get(j+1));
            }
            row.add(1);
            list1.add(row);
        }
        return list1;
    }
}



////https://leetcode.com/explore/interview/card/top-interview-questions-easy/99/others/722/
//Missing Number
//
//Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
//
//Example 1:
//
//Input: [3,0,1]
//Output: 2
//
//Example 2:
//
//Input: [9,6,4,2,3,5,7,0,1]
//Output: 8
//
//Note:
//Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?

class Solution11 {
    public int missingNumber(int[] nums) {
        int m = 0;
        int s = 0;
        for(int i = 0; i<nums.length; i++){
            m += nums[i];
            s += i+1;
        }
        return s - m;
    }
}


////https://leetcode.com/explore/interview/card/top-interview-questions-easy/94/trees/555/
//Maximum Depth of Binary Tree
//
//Given a binary tree, find its maximum depth.
//
//The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
//
//Note: A leaf is a node with no children.
//
//Example:
//
//Given binary tree [3,9,20,null,null,15,7],
//
//    3
//   / \
//  9  20
//    /  \
//   15   7
//
//return its depth = 3.


// * Definition for a binary tree node.
class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }
 
class Solution12 {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        
        return Math.max(leftDepth, rightDepth)+1;
        
    }
    
}



////https://leetcode.com/explore/featured/card/may-leetcoding-challenge/535/week-2-may-8th-may-14th/3324/
//Valid Perfect Square
//
//Given a positive integer num, write a function which returns True if num is a perfect square else False.
//
//Note: Do not use any built-in library function such as sqrt.
//
//Example 1:
//
//Input: 16
//Output: true
//
//Example 2:
//
//Input: 14
//Output: false

class Solution13 {
    public boolean isPerfectSquare(int num) {
        if(num == 0) return true;
        if(num == 1) return true;
        long n = 2;
        while(n*n < num) n++;
        if (n*n == num) return true;
        return false;
        
    }
}


////https://leetcode.com/explore/featured/card/fun-with-arrays/525/inserting-items-into-an-array/3245/
//Duplicate Zeros
//
//Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.
//
//Note that elements beyond the length of the original array are not written.
//
//Do the above modifications to the input array in place, do not return anything from your function.
// 
//
//Example 1:
//
//Input: [1,0,2,3,0,4,5,0]
//Output: null
//Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
//
//Example 2:
//
//Input: [1,2,3]
//Output: null
//Explanation: After calling your function, the input array is modified to: [1,2,3]
//Note:
//
//    1 <= arr.length <= 10000
//    0 <= arr[i] <= 9

class Solution14 {
    public void duplicateZeros(int[] arr) {
        //[1,4,0,1,0,2,2,0,0,0]
        //[1,4,0,0,1,0,0,2,2,0]
        System.out.println(Arrays.toString(arr));
        int numZeros = 0;
        int n=0;
        while((n+numZeros)<arr.length){
            if(arr[n] == 0){
                numZeros++;
            }
            n++;
        }
        System.out.println("numZero: " + numZeros + "; none zero: " + (n-numZeros) + "; n: " + n);

        if (numZeros != 0){
            int d = numZeros;
            for(int i=n-1; i>=0; i--){
                if ((i+d) < arr.length) arr[i+d] = arr[i];
                if (arr[i] == 0){
                    arr[i+d-1] = 0;
                    d--;
                }
                if (d == 0) break;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}



////https://leetcode.com/explore/learn/card/fun-with-arrays/526/deleting-items-from-an-array/3247/
//Remove Element
//
//Given an array nums and a value val, remove all instances of that value in-place and return the new length.
//
//Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
//
//The order of elements can be changed. It doesn't matter what you leave beyond the new length.
//
//Example 1:
//
//Given nums = [3,2,2,3], val = 3,
//
//Your function should return length = 2, with the first two elements of nums being 2.
//
//It doesn't matter what you leave beyond the returned length.
//
//Example 2:
//
//Given nums = [0,1,2,2,3,0,4,2], val = 2,
//
//Your function should return length = 5, with the first five elements of nums containing 0, 1, 3, 0, and 4.
//
// Note that the order of those five elements can be arbitrary.
//
//It doesn't matter what values are set beyond the returned length.

class Solution15 {
    public int removeElement(int[] nums, int val) {
        //val = 2;
        int n = nums.length;
        int i = 0;
        while(i<nums.length){
            if (nums[i] == val){
                if (i+1<n){
                    for (int j = i+1; j<n; j++){
                        nums[j-1] = nums[j];
                    }
                    n--;
                } else return --n;
            } else {
                i++;
            }
        }
        return n;
    }
}


////https://leetcode.com/explore/learn/card/fun-with-arrays/527/searching-for-items-in-an-array/3251/
//Valid Mountain Array
//
//Given an array A of integers, return true if and only if it is a valid mountain array.
//
//Recall that A is a mountain array if and only if:
//
//    A.length >= 3
//    There exists some i with 0 < i < A.length - 1 such that:
//        A[0] < A[1] < ... A[i-1] < A[i]
//        A[i] > A[i+1] > ... > A[A.length - 1]

class Solution16 {
    public boolean validMountainArray(int[] A) {
        if (A.length<3) return false;
        int updown = 0;
        for(int i=1; i<A.length; i++){
            if (A[i-1] == A[i]) return false;
            if (updown == 0){
                if (A[i-1]>A[i]){
                    if(i==1) return false;
                    updown++;
                }
            } else {
                if (A[i-1]<=A[i]) return false;
            }
        }
        return updown == 1;
    }
}



////https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
//34. Find First and Last Position of Element in Sorted Array
//Medium
//
//Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
//
//Your algorithm's runtime complexity must be in the order of O(log n).
//
//If the target is not found in the array, return [-1, -1].
//
//Example 1:
//
//Input: nums = [5,7,7,8,8,10], target = 8
//Output: [3,4]
//
//Example 2:
//
//Input: nums = [5,7,7,8,8,10], target = 6
//Output: [-1,-1]

class Solution17 {
    public int[] searchRange(int[] nums, int target) {
        int n1 = -1;
        int n2 = -1;
        for(int i=0; i<nums.length; i++){
            if (nums[i] == target){
                if(n1 == -1) n1 = i;
                else n2 = i;
            }
            if (nums[i] > target){
                break;
            }
        }
        if (n1 != -1 && n2 == -1) n2 = n1;
        int[] res = {n1, n2};
        return res;
    }
}


////https://leetcode.com/problems/powx-n/
//Pow(x, n)
//Medium
//
//Implement pow(x, n), which calculates x raised to the power n (xn).
//
//Example 1:
//
//Input: 2.00000, 10
//Output: 1024.00000
//
//Example 2:
//
//Input: 2.10000, 3
//Output: 9.26100
//
//Example 3:
//
//Input: 2.00000, -2
//Output: 0.25000
//Explanation: 2-2 = 1/22 = 1/4 = 0.25
//
//Note:
//
//    -100.0 < x < 100.0
//    n is a 32-bit signed integer, within the range [−231, 231 − 1]

class Solution18 {
    public double myPow(double x, int n) {
        return Math.pow(x, n); //---
    }
}


////https://leetcode.com/problems/count-of-smaller-numbers-after-self/
//315. Count of Smaller Numbers After Self
//Hard
//
//You are given an integer array nums and you have to return a new counts array. The counts array has the property where counts[i] is the number of smaller elements to the right of nums[i].
//
//Example:
//
//Input: [5,2,6,1]
//Output: [2,1,1,0] 
//Explanation:
//To the right of 5 there are 2 smaller elements (2 and 1).
//To the right of 2 there is only 1 smaller element (1).
//To the right of 6 there is 1 smaller element (1).
//To the right of 1 there is 0 smaller element.

class Solution19 {
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int n;
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if (i+1<nums.length){
                for (int j=i+1; j<nums.length; j++){
                    if (nums[i]>nums[j]) count++;
                }
                res.add(count);
                count = 0;
            } else {
                res.add(0);
            }
        }
        return res;
    }
}


////https://leetcode.com/problems/minimum-window-substring/
//76. Minimum Window Substring
//Hard
//
//Given a string S and a string T, find the minimum window in S which will contain all the characters in T in complexity O(n).
//
//Example:
//
//Input: S = "ADOBECODEBANC", T = "ABC"
//Output: "BANC"
//
//Note:
//
//    If there is no such window in S that covers all characters in T, return the empty string "".
//    If there is such window, you are guaranteed that there will always be only one unique minimum window in S.

class Solution20{
    public String minWindow(String s, String t) {
        // ADOBECODEBANC - ABC
        // ABCBAC
        //s = "obzcopzocynyrsgsarijyxnkpnukkrvzuwdjldxndmnvevpgmxrmvfwkutwekrffnloyqnntbdohyfqndhzyoykiripdzwiojyoznbtogjyfpouuxvumtewmmnqnkadvzrvouqfbbdiqremqzgevkbhyoznacqwbhtrcjwfkzpdstpjswnpiqxjhywjanhdwavajrhwtwzlrqwmombxcaijzevbtcfsdcuovckoalcseaesmhrrizcjgxkbartdtotpsefsrjmvksqyahpijsrppdqpvmuocofuunonybjivbjviyftsyiicbzxnwnrmvlgkzticetyfcvqcbjvbufdxgcmesdqnowzpshuwcseenwjqhgsdlxatamysrohfnixfprdsljyyfhrnnjsagtuihuczilgvtfcjwgdhpbixlzmakebszxbhrdibpoxiwztshwczamwnninzmqrmpsviydkptjzpktksrortapgpxwojofxeasoyvyprjoguhqobehugwdvtzlenrcttuitsiijswpogicjolfxhiscjggzzissfcnxnvgftxvbfzkukqrtalvktdjsodmtgzqtuyaqvvrbuexgwqzwduixzrpnvegddyyywaquxjxrnuzlmyipuqotkghfkpknqinoidifnfyczzonxydtqroazxhjnrxfbmtlqcsfhshjrxwqvblovaouxwempdrrplefnxmwrwfjtebrfnfanvvmtbzjesctdgbsfnpxlwihalyiafincfcwgdfkvhebphtxukwgjgplrntsuchyjjuqozakiglangxkttsczhnswjksnuqwflmumpexxrznzwxurrysaokwxxqkrggytvsgkyfjrewrcvntomnoazmzycjrjrqemimyhriyxgrzcfuqtjhvjtuhwfzhwpljzajitrhryaqchnuawbxhxrpvyqcvhpggrpplhychyulijhkglinibedauhvdydkqszdbzfkzbvhldstocgydnbfjkcnkfxcyyfbzmmyojgzmasccaahpdnzproaxnexnkamwmkmwslksfpwirexxtymkmojztgmfhydvlqtddewjvsrmyqjrpycbmndhupmdqqabiuelacuvxnhxgtpvrtwfgzpcrbhhtikbcqpctlxszgpfbgcsbaaiapmtsucocmpecgixshrrnhyrpalralbccnxvjzjllarqhznzghswqsnfuyywmzbopyjyauknxddgdthlabjqtwxpxwljvoxkpjjpfvccyikbbrpdsyvlxscuoofkecwtnfkvcnzbxkeabtdusyhrqklhaqreupakxkfzxgawqfwsaboszvlshwzhosojjotgyagygguzntrouhiweuomqptfjjqsxlbylhwtpssdlltgubczxslqjgxuqnmpynnlwjgmebrpokxjnbiltvbebyytnnjlcwyzignmhedwqbfdepqakrelrdfesqrumptwwgifmmbepiktxavhuavlfaqxqhreznbvvlakzeoomykkzftthoemqwliednfsqcnbexbimrvkdhllcesrlhhjsspvfupxwdybablotibypmjutclgjurbmhztboqatrdwsomnxnmocvixxvfiqwmednahdqhxjkvcyhpxxdmzzuyyqdjibvmfkmonfxmohhshpkhmntnoplphqyprveyfsmsxjfosmicdsjrieeytpnbhlsziwxnpmgoxneqbnufhfwrjbqcsdfarybzwaplmxckkgclvwqdbpumsmqkswmjwnkuqbicykoisqwoootrdpdvcuiuswfqmrkctsgrevcxnyncmivsxbpbxzxpwchiwtkroqisnmrbmefbmatmdknaklpgpyqlsccgunaibsloyqpnsibwuowebomrmcegejozypjzjunjmeygozcjqbnrpakdermjcckartbcppmbtkhkmmtcngteigjnxxyzaibtdcwutkvpwezisskfaeljmxyjwykwglqlnofhycwuivdbnpintuyhtyqpwaoelgpbuwiuyeqhbvkqlsfgmeoheexbhnhutxvnvfjwlzfmvpcghiowocdsjcvqrdmkcizxnivbianfpsnzabxqecinhgfyjrjlbikrrgsbgfgyxtzzwwpayapfgueroncpxogouyrdgzdfucfrywtywjeefkvtzxlwmrniselyeodysirqflpduvibfdvedgcrzpzrunpadvawfsmmddqzaaahfxlifobffbyzqqbtlcpquedzjvykvarayfldvmkapjcfzfbmhscdwhciecsbdledspgpdtsteuafzbrjuvmsfrajtulwirzagiqjdiehefmfifocadxfuxrpsemavncdxuoaetjkavqicgndjkkfhbvbhjdcygfwcwyhpirrfjziqonbyxhibelinpllxsjzoiifscwzlyjdmwhnuovvugfhvquuleuzmehggdfubpzolgbhwyeqekzccuypaspozwuhbzbdqdtejuniuuyagackubauvriwneeqfhtwkocuipcelcfrcjcymcuktegiikyosumeioatfcxrheklookaqekljtvtdwhxsteajevpjviqzudnjnqbucnfvkybggaybebljwcstmktgnipdyrxbgewqczzkaxmeazpzbjsntltjwlmuclxirwytvxgvxscztryubtjweehapvxrguzzsatozzjytnamfyiitreyxmanhzeqwgpoikcjlokebksgkaqetverjegqgkicsyqcktmwjwakivtsxjwrgakphqincqrxqhzbcnxljzwturmsaklhnvyungjrxaonjqomdnxpnvihmwzphkyuhwqwdboabepmwgyatyrgtboiypxfavbjtrgwswyvcqhzwibpisydtmltbkydhznbsvxktyfxopwkxzbftzknnwipghuoijrbgqnzovxckvojvsqqraffwowfvqvfcmiicwitrhxdeombgesxexedlakitfovtydxunqnwqqdeeekiwjnwoshqcsljiicgobbbuqakjdonjawgjlezdnqhfdqnmsuavxdpnfzwipmspiabveaarshzwxmirgkmfncvtdrdvfxkpxlkdokxgtwcskmjryyymcthfnkasinihaunohkxaibtsqelockaefjmsuolebtnepauwmrxutspjwaxbmahsjtkfkxlnszribmeofbkyvbjscjtqjakuwvcgunvnonvqbbggfshauqsyznokqbhowjusypfnecffenojfvlblgzntqzlrgzprvhqnpfrrkzxznieiuivajivzijsqijigtatifmbplzqahuidegfoobpymkputzamzvweiyvvzlwihgmmmrcburbgbsdxrfjsbiylitghgcpqjbevvgypxcybubyoijijrhuzcdijfybqbfowlookqmlnplbxvjjosfqviygqyhgamuwzjklbyzopkrnhbywtfoqomweldmlrhjqswctubiknzzvcztyehouvnyiqnvkufaobehxhrjvtisxjlxoumipzjarwvbsaegdkpbsjmpevjbewzuqnfhoohhmdjgfpmjzdmtmykqvtucptwfidpwtwffzolffzqfdearclkyeecuzabjeqhxpmfodsvisnpxrqowdawheydfyhoexvcmihdlzavtqlshdhdgjzpozvvackebhgqppvcrvymljfvooauxcjnbejdivikcoaugxwzsulgfqdtefpehbrlhaoqxwcancuvbqutnfbuygoemditeagmcveatgaikwflozgdhkyfqmjcruyyuemwbqwxyyfiwnvlmbovlmccaoguieu";
        //t = "cjgamyzjwxrgwedhsexosmswogckohesskteksqgrjonnrwhywxqkqmywqjlxnfrayykqotkzhxmbwvzstrcjfchvluvbaobymlrcgbbqaprwlsqglsrqvynitklvzmvlamqipryqjpmwhdcsxtkutyfoiqljfhxftnnjgmbpdplnuphuksoestuckgopnlwiyltezuwdmhsgzzajtrpnkkswsglhrjprxlvwftbtdtacvclotdcepuahcootzfkwqhtydwrgqrilwvbpadvpzwybmowluikmsfkvbebrxletigjjlealczoqnnejvowptikumnokysfjyoskvsxztnqhcwsamopfzablnrxokdxktrwqjvqfjimneenqvdxufahsshiemfofwlyiionrybfchuucxtyctixlpfrbngiltgtbwivujcyrwutwnuajcxwtfowuuefpnzqljnitpgkobfkqzkzdkwwpksjgzqvoplbzzjuqqgetlojnblslhpatjlzkbuathcuilqzdwfyhwkwxvpicgkxrxweaqevziriwhjzdqanmkljfatjifgaccefukavvsfrbqshhswtchfjkausgaukeapanswimbznstubmswqadckewemzbwdbogogcysfxhzreafwxxwczigwpuvqtathgkpkijqiqrzwugtr";
        s = "ADOBECODEBANC";
        t = "ABC";
        if(s.equals(t)) return s;
        char[] c = new char[s.length()];
        for (int i=0; i<s.length(); i++){
            c[i] = s.charAt(i);
        }
        
        int value;
        HashMap<Character, Integer> tHash = new HashMap<>(); //MAP с кол-вом вхождений букв в искомом String t
        for(int i = 0; i<t.length(); i++){
            if (tHash.containsKey(t.charAt(i))) value = tHash.get(t.charAt(i)) + 1;
            else value = 1;
            tHash.put(t.charAt(i), value);
        }
        
        int beginChar = -1;
        int endChar = -1;
        int len = -1;
        HashMap<Character, Integer> temp = new HashMap<>();

        for(int n = 0; n<t.length()-1; n++){
            if (tHash.containsKey(c[n])){
                if (temp.containsKey(c[n])) value = temp.get(c[n])+1;
                else value = 1;
                temp.put(c[n], value);
            }
        }

        for (int i=0; i<=s.length()-t.length(); i++){
            if (!tHash.containsKey(c[i])) continue;

//            temp.clear();
            
//            for(int n = i; n<i+t.length()-1; n++){
//                if (tHash.containsKey(c[n])){
//                    if (temp.containsKey(c[n])) value = temp.get(c[n])+1;
//                    else value = 1;
//                    temp.put(c[n], value);
//                }
//            }

            for (int j=i+t.length()-1; j<s.length(); j++){
                if (!tHash.containsKey(c[j])) continue;

                if (temp.containsKey(c[j])) value = temp.get(c[j])+1; else value = 1;
                temp.put(c[j], value);
                if (tHash.size() != temp.size()) continue;
                
                System.out.println("i, j: " + i + ", " + j + " --- " + temp.entrySet());
                boolean flag = true;
                int v1, v2;
                for (Map.Entry entry : tHash.entrySet()) {
                    char c1 = (Character)entry.getKey();
                    if (!temp.containsKey(c1)) {
                        flag = false;
                        break;
                    }

                    v1 = (Integer)entry.getValue();
                    v2 = temp.get(c1);
                    if (v1 > v2) {
                        flag = false;
                        break;
                    }
                }              
                System.out.println("len: " + len + " - begin, end: " + beginChar + ", " + endChar);
                if (flag && (len > j-i || len == -1)){
                    len = j-i;
                    beginChar = i;
                    endChar = j;
                    break;
                }
            }

            temp.put(c[i], temp.get(c[i])-1);

        }
        if (len == -1) return "";
        return s.substring(beginChar, endChar+1);
    }    
    //---
}

//---From internet :(
class Solution20_1 {
    public String minWindow(String s, String t) {
        if(s == null || s.length() < t.length() || s.length() == 0){
            return "";
        }
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(char c : t.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        int left = 0;
        int minLeft = 0;
        int minLen = s.length()+1;
        int count = 0;
        for(int right = 0; right < s.length(); right++){
            if(map.containsKey(s.charAt(right))){
                map.put(s.charAt(right),map.get(s.charAt(right))-1);
                if(map.get(s.charAt(right)) >= 0){
                    count ++;
                }
                while(count == t.length()){
                    if(right-left+1 < minLen){
                        minLeft = left;
                        minLen = right-left+1;
                    }
                    if(map.containsKey(s.charAt(left))){
                        map.put(s.charAt(left),map.get(s.charAt(left))+1);
                        if(map.get(s.charAt(left)) > 0){
                            count --;
                        }
                    }
                    left ++ ;
                }
            }
        }
        if(minLen>s.length())  
        {  
            return "";  
        }  

        return s.substring(minLeft,minLeft+minLen);
    }
}



///https://habr.com/ru/post/503602/
//Кодирование длин серий или кодирование повторов (run-length encoding) — это быстрый и простой способ кодирования строк.
//Суть этого алгоритма заключается в замене повторяющихся символов (серии) на один символ и число его повторов. 
//Серией называется последовательность, состоящая из нескольких одинаковых символов. 
//При кодировании строка одинаковых символов, составляющих серию, заменяется строкой, 
//содержащей сам повторяющийся символ и количество его повторов.
//
//Например, строка "AAAABBBCCDAA" после кодирования повторов будет выглядеть как "4A3B2C1D2A".
//
//Реализуйте кодирование и декодирование повторов. Строка для кодирования состоит только из букв, не содержит чисел.
//Строка для декодирования является валидной.

class Solution21{
    public String RunLenEncoding(String st){
        if (st.length()<2) return st;
        int count = 1;
        StringBuilder stRes = new StringBuilder("");
        for (int i = 0; i<st.length()-1; i++){
            if (st.charAt(i) == st.charAt(i+1)) count++; 
            else {
                if (count > 1) {
                    stRes.append(count);
                }
                stRes.append(st.charAt(i));
                count = 1;
            }
        }
        if (count > 1) {
            stRes.append(count);
        }
        stRes.append(st.charAt(st.length()-1));
        return stRes.toString();
    }
    
    public String RunLenDecode(String st){
        if (st.length()<2) return st;
        StringBuilder stRes = new StringBuilder("");
        String temp = "";
        for (int i = 0; i< st.length(); i++){
            if (st.charAt(i)>='0' && st.charAt(i)<='9'){
                //temp.concat(st.charAt(i));
                temp += String.valueOf(st.charAt(i));
            } else {
                if (temp.equals("")){
                    stRes.append(st.charAt(i));
                } else {
                    int n = Integer.parseInt(temp);
                    if (n > 0) {
                        for (int j = 0; j < n; j++) stRes.append(st.charAt(i));
                        temp = "";
                    } else stRes.append(st.charAt(i));
                }
            }
        }
        return stRes.toString();
    }
}


//// https://leetcode.com/problems/1-bit-and-2-bit-characters/
// 717. 1-bit and 2-bit Characters
// We have two special characters. The first character can be represented by one bit 0. The second character can be represented by two bits (10 or 11).
// Now given a string represented by several bits. Return whether the last character must be a one-bit character or not. The given string will always end with a zero.
// [1,0,1,0] - false   [0,1,0,1,1,0] - true  [0,1,1,0,1,0] - false
class Solution1BitAnd2BitCharacters {
    public boolean isOneBitCharacter(int[] bits) {
        boolean result = true;
        for(int i = 0; i<bits.length; i++){
            if(bits[i] == 1){
                i++;
                result = false;
            } else {
                result = true;
            }
        }
        return result;
    }
}

/*
https://leetcode.com/problems/reverse-words-in-a-string/
151. Reverse Words in a String
Medium

Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. 
The returned string should only have a single space separating the words. Do not include any extra spaces.

Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the"

Example 2:

Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.

*/

/*
class Solution23 {
    public String reverseWords(String s) {
        String[] words = s.split("\\s"); // Разбиение строки на слова с помощью разграничителя (пробел)
        StringBuilder resultStr = new StringBuilder();

        for(int i = words.length-1; i>=0; i--) {
            if (words[i].length() > 0){
                resultStr.append(words[i]+" ");
            }
        }

        if (resultStr.length() > 0) {
           resultStr.setLength(resultStr.length() - 1);
        }        

        return resultStr.toString();
    }
}
*/

class Solution23 {
    public String reverseWords(String s) {
        String[] words = s.split(" "); // Разбиение строки на слова с помощью разграничителя (пробел)
        StringBuilder resultStr = new StringBuilder();

        String prefix = "";
        for(int i = words.length-1; i>=0; i--) {
            if (words[i].length() > 0){
                resultStr.append(prefix);
                resultStr.append(words[i]);
                prefix = " ";
            }
        }
        return resultStr.toString();
    }
}

//https://leetcode.com/problems/ugly-number-iii/
//Given four integers n, a, b, and c, return the nth ugly number.
//
//Ugly numbers are positive integers that are divisible by a, b, or c.
//
//Example 1:
//Input: n = 3, a = 2, b = 3, c = 5
//Output: 4
//Explanation: The ugly numbers are 2, 3, 4, 5, 6, 8, 9, 10... The 3rd is 4.
//
//Example 2:
//Input: n = 4, a = 2, b = 3, c = 4
//Output: 6
//Explanation: The ugly numbers are 2, 3, 4, 6, 8, 9, 10, 12... The 4th is 6.

class Solution24 {
    public int nthUglyNumber(int n, int a, int b, int c) {
        int uglyNum = 0;
        int currentNum = 0;
        
        while (n != currentNum) {            
            uglyNum++;
            if ((uglyNum % a == 0) || (uglyNum % b == 0) || (uglyNum % c == 0)){
                currentNum++;
            }
        }
        
        return uglyNum;
    }
}

//// https://leetcode.com/problems/sqrtx/
//Given a non-negative integer x, compute and return the square root of x.
//
//Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.
//
//Example 1:
//Input: x = 4
//Output: 2
//
//Example 2:
//Input: x = 8
//Output: 2
//Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.

class Solution25 {
    public int mySqrt(int x) {
        return (int)Math.sqrt(x);
    }
}


//// https://leetcode.com/problems/factorial-trailing-zeroes/
//Given an integer n, return the number of trailing zeroes in n!.
//
//Follow up: Could you write a solution that works in logarithmic time complexity?
//
//Example 1:
//Input: n = 3
//Output: 0
//Explanation: 3! = 6, no trailing zero.
//
//Example 2:
//Input: n = 5
//Output: 1
//Explanation: 5! = 120, one trailing zero.
//
//Example 3:
//Input: n = 0
//Output: 0

class Solution26 {
    public int trailingZeroes(int n) {
        int count = 0;
        int n5 = 5;
        while (n >= n5){
            count += n/n5;
            n5 = n5*5;
        }
        return (count);
    }

}


//https://leetcode.com/problems/majority-element/
//169. Majority Element
//Given an array nums of size n, return the majority element.
//
//The majority element is the element that appears more than (n / 2) times. You may assume that the majority element always exists in the array.
//
//Example 1:
//
//Input: nums = [3,2,3]
//Output: 3
//
//Example 2:
//
//Input: nums = [2,2,1,1,1,2,2]
//Output: 2
//
//Constraints:
//    n == nums.length
//    1 <= n <= 5 * 104
//    -231 <= nums[i] <= 231 - 1
//Follow-up: Could you solve the problem in linear time and in O(1) space?

// Читать задания надо лучше :) Сделал общее решение задачи для любого кол-ва повторяющихся элементов
// а надо было для >=n/2, исходные данные задачи всегда удовлетворяет этому условию
class Solution27 {
    public int majorityElement(int[] nums) {
        int maxNum = 1; //максимальное кол-во одинаковых чисел в массиве
        int maxNumKey = nums[0]; //число из массива с максимальным кол-во штук
        Map<Integer, Integer> map = new HashMap<>();
        int n = 0;
        for(int i = 0; i<nums.length; i++){
            if (map.containsKey(nums[i])){
                n = map.get(nums[i]);
                map.put(nums[i], ++n);
                if (n>maxNum){
                    maxNumKey = nums[i];
                    maxNum = n;
                }
            } else {
                map.put(nums[i], 1);
            }
        }
        return maxNumKey;
    }
}
// так изящнее и быстрее
class Solution27_2 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}


//
//Given a date, return the corresponding day of the week for that date.
//The input is given as three integers representing the day, month and year respectively.
//Return the answer as one of the following values {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}.
//
//Example 1:
//
//Input: day = 31, month = 8, year = 2019
//Output: "Saturday"
//
//Example 2:
//
//Input: day = 18, month = 7, year = 1999
//Output: "Sunday"
//
//Example 3:
//
//Input: day = 15, month = 8, year = 1993
//Output: "Sunday"
//
//Constraints:
//    The given dates are valid dates between the years 1971 and 2100.
//

class Solution28 {
    public String dayOfTheWeek(int day, int month, int year) {
        String dayOfTheWeekString[] = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
       
        Calendar c = Calendar.getInstance();
        c.set(year, month-1, day);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        return dayOfTheWeekString[dayOfWeek-1];
    }
}

class Solution28_manual {
    public String dayOfTheWeek(int day, int month, int year) {
        String dayOfTheWeekString[] = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int daysInMonth[] = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int dayOfWeek;
        //01.01.1971 - Friday [4]
        //Високосный год - 2020, ... 1974
        
        int daysTotal = (year - 1971)*365 + (year - 1 - 1968)/4; //всего дней в невисокосных годах + дней високосных лет (1968 - високосный)
        for (int i=0; i<month-1; i++){
            daysTotal += daysInMonth[i];
        }
        
        daysTotal += day;
        
        //проверяем, что високосный год и добавляем 1 день, если месяц больше равен марту
        if((year-1968)%4 == 0)
            if(month>=3){
                daysTotal++;    
            }
        
        daysTotal += 3; //т.к. 01.01.1971 - пятница
        
        dayOfWeek = daysTotal % 7;
        
        return dayOfTheWeekString[dayOfWeek];
    }
}

// https://leetcode.com/problems/sort-colors/
//Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
//We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
//You must solve this problem without using the library's sort function.
//
//Example 1:
//Input: nums = [2,0,2,1,1,0]
//Output: [0,0,1,1,2,2]
//
//Example 2:
//Input: nums = [2,0,1]
//Output: [0,1,2]
//
//Example 3:
//Input: nums = [0]
//Output: [0]
//
//Example 4:
//Input: nums = [1]
//Output: [1]
//
//Constraints:
//    n == nums.length
//    1 <= n <= 300
//    nums[i] is 0, 1, or 2.
//Follow up: Could you come up with a one-pass algorithm using only constant extra space?


class Solution29 {
    public void sortColors(int[] nums) {
        int n0 = 0;
        int n1 = 0;
        for(int i=0; i<nums.length; i++){
            if (nums[i] == 0) n0++;
            if (nums[i] == 1) n1++;
        }
        if (n0 != 0) Arrays.fill(nums, 0, n0, 0);
        if (n1 != 0) Arrays.fill(nums, n0, n0+n1, 1);
        if (nums.length != n0+n1) Arrays.fill(nums, n0+n1, nums.length, 2);
        System.out.println("nums sorted: " + Arrays.toString(nums));
    }
}


//https://habr.com/ru/post/582600/
//поиск одинаковых элементов в 3 отсортированных массивах с использованием O(1) памяти.
//

class Solution30 {
    public void getDublicate(int[] ar1, int[] ar2, int[] ar3) {
        int ar2min = 0, ar3min = 0;
        for(int i = 0; i < ar1.length; i++){
            if(i > 0 && ar1[i] != ar1[i-1])
            for(int j = ar2min; j < ar2.length; j++){
                if(ar1[i] == ar2[j]){
                    ar2min = j;
                    for(int k = ar3min; k < ar3.length; k++){
                        if(ar1[i] == ar3[k]){
                            System.out.println(ar1[i]);
                            ar3min = k;
                            break;
                        }
                        if(ar1[i] < ar3[k]) break;
                    }
                }
                if(ar1[i] < ar2[j]) break;
            }
        }
        
    }
}


///////////////////////////////////////////////////////////
/*
    Продолжение в LeetCode2.java
*/
///////////////////////////////////////////////////////////


