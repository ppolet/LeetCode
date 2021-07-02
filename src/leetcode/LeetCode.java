/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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

/**
 *
 * @author USER
 */
public class LeetCode {

    public static void main(String[] args) {

        System.out.println("----");
        Solution s = new Solution();
        int[] nums1 = new int[] {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(s.maxSubArray(nums1));
        int[] nums2 = new int[] {-2,-1};
        System.out.println(s.maxSubArray(nums2));


        int[] nums3 = new int[] {-57,9,-72,-72,-62,45,-97,24,-39,35,-82,-4,-63,1,-93,42,44,1,-75,-25,-87,-16,9,-59,20,5,-95,-41,4,-30,47,46,78,52,74,93,-3,53,17,34,-34,34,-69,-21,-87,-86,-79,56,-9,-55,-69,3,5,16,21,-75,-79,2,-39,25,72,84,-52,27,36,98,20,-90,52,-85,44,94,25,51,-27,37,41,-6,-30,-68,15,-23,11,-79,93,-68,-78,90,11,-41,-8,-17,-56,17,86,56,15,7,66,-56,-2,-13,-62,-77,-62,-12,37,55,81,-93,86,-27,-39,-3,-30,-46,6,-8,-79,-83,50,-10,-24,70,-93,-38,27,-2,45,-7,42,-57,79,56,-57,93,-56,79,48,-98,62,11,-48,-77,84,21,-47,-10,-87,-49,-17,40,40,35,10,23,97,-63,-79,19,6,39,62,-38,-27,81,-68,-7,60,79,-28,-1,-33,23,22,-48,-79,51,18,-66,-98,-98,50,41,13,-63,-59,10,-49,-38,-70,56,77,68,95,-73,26,-73,20,-14,83,91,61,-50,-9,-40,1,11,-88,-80,21,89,97,-29,8,10,-15,48,97,35,86,-96,-9,64,48,-37,90,-26,-10,-13,36,-27,-45,-3,-1,45,34,77,-66,22,73,54,11,70,-97,-81,-43,-13,44,-69,-78,30,-66,-11,-29,58,52,-61,-68,-81,25,44,-32,57,-81,66,2,52,43,35,-26,16,-33,61,-37,-54,80,-3,32,24,27,30,-69,38,-81,2,-4,47,17,5,42,-58,-51,-90,98,-33,76,-22,95,-4,89,-31,-87,-44,-69,-48,1,87,48,-90,-12,-24,39,18,-86,35,96,-14,-41,13,90,-98,32,-83,-89,7,-17,63,84,-21,-40,51,24,-51,83,31,0,-38,-5,-74,-29,59,1,87,-22,-9,-1,-49,76,57,41,44,35,-27,60,23,56,-80,-14,41,-2,22,-31,99,47,-48,7,-75,13,-97,-50,61,61,27,48,-84,94,-76,-56,70,57,84,-9,-7,-66,-49,-84,89,-29,-22,7,45,-99,75,21,24,-95,-71,48,17,-92,74,-22,45,1,-97,61,-5,-74,81,-57,83,42,33,-47,75,61,-55,41,-68,22,-51,53,-1,-99,-25,-76,-95,3,48,-1,-13,23,53,-68,-76,33,92,-4,35,50,38,18,-8,-52,47,-33,-91,91,85,-60,14,-89,93,89,-89,-55,89,92,47,38,-9,-66,-39,-79,-58,-39,53,-65,56,-11,61,-29,83,-46,19,31,-3,27,-1,-18,67,-87,-8,37,79,-20,58,68,-28,-18,-17,39,-8,43,59,33,81,13,44,37,-98,6,85,84,59,4,-8,-44,-69,91,15,74,80,83,-12,59,-37,-54,5,34,27,87,-50,-81,8,-90,52,-11,-1,-4,-97,0,78,87,-39,37,-32,30,70,-1,21,-38,-50,-22,-55,15,-85,8,60,19,-81,-35,-17,-31,-40,90,-45,-88,-44,53,-15,-41,-70,-37,-77,-33,77,-9,96,24,66,-6,85,92,72,-70,7,86,14,-32,-18,33,9,64,78,68,32,-90,57,87,62,-58,-77,68,-19,-54,-65,-42,13,-68,58,-44,25,43,-52,-26,73,55,-63,-13,-77,18,96,31,-40,51,-1,91,60,-44,55,22,-26,78,-10,32,-99,2,66,13,33,25,68,-65,-32,-84,-14,-82,70,22,5,69,-59,-22,-23,0,-70,53,-32,89,85,-77,-11,-40,77,55,68,77,-43,34,-33,66,-41,-88,-98,27,-72,-13,21,74,85,-74,21,-74,-19,97,2,10,50,46,-1,13,69,87,72,23,20,40,1,76,-49,67,43,10,79,21,-86,83,84,34,34,69,37,-45,72,-82,-70,-26,27,56,97,-97,-31,66,67,-82,-11,-13,57,66,-37,85,11,82,-5,-33,3,-15,-50,-13,95,60,-66,9,-84,-94,26,-78,-44,-70,77,-47,-90,-53,95,76,-36,-38,-60,98,-72,-21,83,15,-38,-45,81,41,16,-69,-94,11,91,-84,-79,83,-79,23,-95,-24,30,58,6,39,-95,1,-8,-54,62,31,-56,67,86,-96,-18,-75,-42,-36,66,73,-29,48,-39,-61,63,-42,98,60,81,-97,-64,11,61,18,-73,42,-80,18,87,58,-51,-69,2,-88,-66,84,-63,-32,-75,79,-82,-28,27,-21,11,-33,13,9,-73,-6,-11,-61,81,-73,57,-92,45,53,25,33,11,50,40,90,62,51,74,75,-81,75,54,-86,-53,-42,-8,34,1,-95,-79,27,-24,-14,42,-66,12,-24,-58,-66,-71,43,66,17,-29,-16,7,-90,-65,-42,84,-70,-90,15,-57,-67,49,11,67,-50,-7,64,53,68,-50,-5,78,38,71,96,71,76,40,15,-7,87,98,76,96,-90,-66,57,-61,-57,-51,-41,-47,97,69,-80,-53,-61,83,76,83,-90,-29,62,47,-81,58,18,95,-2,-67,-12,-38,-92,-35,-65,-83,-25,91,-44,-5,-83,-9,47,-86,-40,43,-63,-1,3,-87,-18,12,-39,-79,-41,-21,79,53,-26,-46,63,39,16,70,80,50,87,-45,19,-80,26,35,10,-27,26,46,92,62,-55,-5,52,4,-93,-87,1,-58,-9,-20,95,42,34,58,-19,-73,5,-39,53,-31,-8,-28,-12,95,84,97,-55,10,44,-62,-51,65,32,-99,-54,16,89,47,57,-42,-96,52,99,14,-13,-43,40,69,-6,-6,-62,85,42,26,80,26,0,-74,-87,-79,-60,-38,63,71,-61,85,-13,-71,9,-78,-14,13,50,-38,-73,-85,18,44,83,-88,-85,-79,73,56,23,31,-40,-99,33,-51,97,72,-13,60,20,26,46,84,31,-45,-94,93,67,55,-45,71,69,49,15,52,37,29,50,-13,-38,-50,-82,-2,-73,27,47,-75,-24,-66,84,96,36,7,80,-56,62,62,-63,6,17,-32,-46,-13,93,45,-84,30,-26,42,-82,13,92,-88,-89,-81,16,34,-57,91,45,-95,87,-42,11,44,2,-50,6,15,33,-76,83,86,-13,76,32,-21,-16,82,-78,-22,-28,90,-34,-40,-91,81,93,-71,73,15,-90,37,73,-3,-41,-48,47,64,66,-43,64,49,-57,-72,3,51,7,63,11,28,-82,82,18,-17,-58,3,-58,-87,8,-85,27,17,28,-23,-85,86,28,38,28,-5,94,-31,-79,-86,-3,0,65,80,-60,-24,8,-43,-65,-97,40,-23,-18,81,-11,90,72,92,-16,0,-30,-25,-36,97,-87,68,-31,83,-63,-33,97,10,66,39,-10,-93,91,74,-37,-74,53,79,-21,-64,37,67,-74,9,60,9,86,-70,84,-73,-96,73,94,-50,57,-69,16,31,18,-18,-53,-92,-35,-62,59,5,-60,12,-16,19,47,-78,-14,49,7,-77,-64,-7,-71,96,19,-67,69,-10,-18,3,-2,97,-89,-84,-44,-43,99,-2,-6,58,-97,11,-29,-14,-70,94,-16,-8,44,91,15,79,-39,20,75,57,52,21,-53,-89,-98,44,84,-88,36,-82,-31,36,15,39,-29,17,-50,41,79,-21,13,-36,71,-66,-68,-37,89,-8,82,41,-74,12,-38,-50,-1,-37,70,-39,-48,7,-22,20,-57,69,-41,13,-14,-14,-68,-58,64,21,5,12,54,13,51,43,-94,11,-16,-92,99,22,-43,-2,62,-72,58,-86,11,-87,33,53,81,68,-57,-56,-46,-49,-14,95,71,67,-16,2,-19,-87,-78,-37,0,-18,-30,-1,-95,4,96,66,31,32,79,-81,44,-11,48,3,-66,90,46,-12,-81,-91,-40,66,76,20,-54,-43,9,-33,19,-91,49,88,7,30,-8,-19,-4,99,-87,-48,-82,33,40,65,-64,73,33,59,-62,28,67,-26,-29,43,71,16,99,-20,83,18,-11,9,-16,72,-61,52,-47,34,29,-58,85,23,75,2,-34,87,-48,75,46,-33,3,-9,40,73,-66,-12,-10,-89,68,-50,5,-66,58,88,82,96,18,-64,7,-53,-23,-31,69,-71,47,-88,-83,98,86,39,-35,-34,-70,82,-60,-36,-30,6,-26,-85,55,55,-75,-10,44,84,-37,-38,-80,69,-15,-27,-85,-69,-21,61,-57,-5,59,-71,-66,-98,-5,-59,60,11,4,-93,93,54,98,48,9,99,-85,-70,83,-23,-32,79,-77,52,-47,-63,60,8,97,-97,-97,33,-92,-87,11,-21,-47,-29,66,33,-45,59,-36,-47,-16,50,-48,-2,79,-64,51,-75,-85,73,76,-56,-90,13,51,83,-8,30,17,-23,20,-72,55,49,-24,-1,-17,7,-42,23,59,42,-27,87,-83,-47,99,68,-46,91,18,-93,-88,28,20,40,-12,-88,-30,-95,-12,66,-90,-79,16,-38,19,75,68,76,-2,27,-5,71,-9,12,-99,-32,-43,-46,-41,74,-40,-53,-21,79,86,67,68,-66,48,-67,99,57,-47,15,-81,71,-33,86,25,65,-10,96,36,58,-15,13,-74,41,66,-39,-7,-97,7,71,59,-6,15,27,4,-36,59,3,-79,89,95,-83,37,-38,79,-38,-96,-53,-41,39,-95,43,-71,-93,-38,71,-33,54,74,50,2,10,-79,-82,-86,24,-19,49,-95,1,38,99,-6,-24,-62,-26,14,-58,20,49,57,1,-7,63,-16,31,34,50,-15,-15,-23,86,94,-2,-96,-92,98,-39,34,-97,62,-28,78,-67,24,93,6,-61,-65,-97,87,68,-20,-43,31,63,87,-57,-10,-51,27,67,-87,-1,-35,-84,-17,-60,-23,-83,-57,-84,-34,-79,-52,89,-86,31,-95,-75,10,69,70,90,-97,1,53,67,43,-56,-84,-52,87,-72,46,-71,-79,-71,-32,-26,-77,10,-34,-12,8,-10,-46,-2,-79,-41,0,8,-95,-30,-2,83,47,-72,50,-9,-29,43,15,-65,70,-39,-37,67,-34,31,-59,-12,-82,6,75,25,96,-70,-99,93,-35,0,1,-54,69,75,-71,16,-96,56,83,-49,-1,-2,-14,-31,35,48,-86,-98,-21,-46,-34,-3,37,-58,98,10,-52,98,3,-11,-2,81,11,-33,56,16,60,36,-28,43,87,47,-81,-50,93,53,97,-93,31,-46,-40,97,27,73,-84,25,-17,-60,1,63,5,98,44,-84,-57,-23,8,79,90,57,22,54,4,17,-96,-3,-29,-99,3,78,-69,40,52,57,13,67,-40,73,83,60,36,-12,35,-43,-20,54,10,88,33,0,45,-67,-46,-51,49,-43,23,96,-65,-74,52,-35,42,4,99,-67,-28,-41,-94,-45,-81,18,43,53,74,99,-15,-39,87,-82,61,9,-73,91,58,76,-74,-19,49,-63,-17,1,1,-97,-94,-23,-65,-46,35,-83,8,53,34,-72,-16,-15,-95,68,45,91,62,-17,1,89,-48,-64,42,-46,-7,-9,-10,52,69,67,54,74,-55,65,-72,79,58,12,10,-31,17,70,53,21,38,-24,-11,-23,35,89,-34,86,-98,-92,-60,-6,-24,6,-53,-55,-26,77,-81,18,20,-77,-26,-22,11,60,47,-72,30,-23,25,-55,52,-85,22,-12,80,87,-49,59,72,-32,-47,-52,73,-24,-8,-76,-69,-13,18,50,9,92,-95,96,52,51,-98,-40,-71,26,4,57,17,-74,-78,-25,90,-50,-66,39,17,-37,86,-33,39,-45,-9,69,41,-91,-4,-73,77,0,-77,7,-48,-76,66,-43,50,-30,90,-56,-27,-87,-5,-37,-38,28,-98,55,91,64,-78,7,-81,12,-47,36,-2,48,62,-25,-75,84,81,-47,-91,24,-14,35,94,-23,78,-56,-34,-49,-17,27,78,-16,-18,46,-75,-20,-70,-80,92,-18,55,-10,-93,17,41,-68,1,0,-39,-14,-76,47,-79,94,-76,76,-62,-11,-73,20,92,81,80,-49,28,-95,30,34,-99,22,-83,55,88,99,-28,7,-69,50,-93,-8,-64,-93,-61,-66,-98,-61,86,-61,27,-87,59,-4,70,16,46,-25,-2,-24,-90,-2,75,-74,-46,40,-98,2,-53,-67,-48,-70,1,-35,-63,16,-2,-62,31,-39,-47,-65,-27,88,30,-80,5,-24,-5,-97,51,4,0,26,6,30,-33,7,-67,-10,16,-39,20,93,25,56,-14,99,70,-83,-40,-77,-49,9,-88,80,29,16,-67,-99,-5,84,-19,71,-13,86,2,30,-30,11,-79,63,71,17,33,-26,-27,-80,-27,-57,-87,10,-35,-36,95,-47,-79,1,45,-69,1,-60,-85,81,-88,-22,44,-10,85,91,-99,-94,31,48,-1,-36,-78,71,-40,-28,90,-27,58,-68,13,53,-15,10,-45,-70,40,32,-30,31,-9,-42,86,-65,24,71,-97,24,53,33,-51,-48,97,-29,99,-66,42,89,6,0,-79,95,-70,5,6,-39,12,-54,93,58,54,-16,92,40,-5,16,11,-25,-83,-59,-92,-35,-8,81,35,-9,-84,-46,-43,-2,30,-23,-6,60,59,99,97,-29,-78,90,-94,52,-49,97,-8,23,13,79,97,6,-80,-95,70,-12,63,-17,55,55,36,-88,-47,-56,-34,23,-96,-98,22,-99,-28,21,68,-46,-50,95,-49,42,18,40,-2,15,-54,-5,-3,-84,82,-63,-25,15,91,-88,3,-56,-68,68,67,-88,69,-34,88,-82,63,56,-29,-86,52,-2,32,-53,-62,-70,62,-17,1,-64,-24,-39,-28,50,75,-37,38,-22,-17,69,-53,-73,80,92,-30,69,-89,-67,2,-42,-77,-69,56,31,-22,93,61,-83,-46,-61,-48,6,-1,23,-67,-26,62,48,29,-55,17,52,-51,-25,44,18,-79,31,27,22,89,50,53,22,-42,-92,-8,-81,-76,22,-65,-25,-72,33,74,-62,84,13,85,13,57,2,-58,82,53,62,0,73,-6,-72,-27,-40,54,-74,58,-88,-90,-50,-92,-67,72,-81,-16,76,51,-65,-86,35,47,98,-75,-19,-22,-57,-36,-69,-94,40,-95,-24,67,-46,35,-2,-44,-7,-13,-35,19,-29,-3,-9,-11,57,-55,-83,91,-42,29,38,-43,53,95,34,73,-41,41,78,99,22,-46,43,75,65,-81,-69,-65,-18,-5,53,29,68,-78,-82,25,-34,-89,-7,23,39,-69,56,-30,-96,-33,-57,-38,-91,97,-39,30,-49,81,6,92,99,36,-73,-42,-68,56,86,76,54,80,2,96,90,94,20,7,-97,-47,76,-94,20,-81,-56,28,-84,-18,-42,-57,-37,40,-88,-61,-23,-62,-4,-15,70,-18,-39,2,-61,39,-2,-71,34,94,35,13,-52,-12,18,67,-17,38,-28,-25,-80,6,17,-18,-53,5,-3,0,42,92,61,-10,-49,-78,91,-11,61,-11,-5,-28,-16,-93,84,8,-5,-21,-48,54,-83,0,-70,-86,-94,23,-5,-71,-71,92,5,47,61,-34,-63,89,-35,-95,-22,-74,-29,49,-26,31,33,-42,-61,-95,13,-10,58,6,89,87,19,71,-12,91,77,16,60,-18,-37,21,25,-23,10,89,-42,65,91,28,-9,-35,-41,-76,-1,-26,-72,88,40,63,-6,6,50,90,-45,-62,81,-68,30,41,-10,93,-61,-85,-53,26,80,4,-9,71,-90,58,-64,-55,82,11,19,86,-1,-64,49,70,42,-23,60,96,-9,18,-72,-78,-41,-6,91,-26,9,-62,99,-11,41,-33,-62,50,-74,-27,95,84,61,-9,70,-40,26,-3,-93,-55,73,66,-59,-59,-16,-55,-38,19,39,-47,93,-52,-10,69,13,-91,-63,50,35,-38,-99,7,-54,61,74,92,97,-22,-11,-95,22,-61,47,63,-20,-91,-92,18,27,23,71,-3,47,-62,-33,-39,-77,-20,87,35,41,87,-81,63,25,93,32,23,-29,98,4,92,-63,-72,32,-7,-64,17,-88,40,-60,59,-86,87,73,-43,-75,73,36,-88,8,-46,99,3,-83,1,-4,26,-99,43,24,-19,13,60,9,-55,-69,44,61,-81,-39,78,54,-25,65,4,31,89,-23,-55,77,61,-2,53,-35,-8,-45,37,-82,-45,-19,41,36,93,-22,-78,-85,8,65,76,3,-96,54,-43,-45,-4,61,62,-38,-62,-93,-61,76,-18,69,-82,73,-76,54,67,-45,-88,8,67,81,62,88,96,-52,54,49,50,34,-20,84,88,52,45,50,-86,59,57,-71,35,-84,97,29,88,97,-16,55,-47,-28,-60,-80,-46,78,-91,-73,-74,39,52,53,-50,-68,37,-62,60,-18,64,73,-82,-2,78,30,13,53,-41,-22,50,19,-90,79,91,-51,76,-78,-95,61,-75,-70,-23,76,59,26,84,-4,40,44,54,-19,-6,72,79,-51,2,-8,-98,37,47,29,-43,56,-15,-75,-94,-39,-77,86,98,-53,-84,-25,99,75,77,60,-52,-6,-19,-97,75,74,74,54,-77,-47,-77,-98,66,69,30,-77,26,-85,-76,8,-47,-54,-6,-49,-31,-14,3,-55,-62,-20,-95,-14,51,-15,-35,26,-64,-84,-43,-41,-32,-44,-63,-89,-97,66,-89,28,57,-66,-87,-90,-43,-17,-39,2,45,40,47,83,96,51,-54,47,-86,10,-50,-51,2,6,-16,46,62,20,56,64,-14,66,-31,-56,77,-42,-70,-66,17,-33,12,-38,-93,-41,-78,-96,87,-56,27,-99,30,77,-51,-68,-40,33,77,98,-70,34,39,16,0,-92,36,-23,-58,65,-13,35,-67,99,97,-84,-65,95,-81,-78,-60,23,98,69,0,-52,-98,59,57,78,58,86,-11,-3,-21,89,-18,91,-57,0,57,7,-64,66,-17,-90,81,17,-95,77,16,-79,0,14,90,99,38,68,35,-28,23,-30,-64,-87,67,14,-98,-74,6,-79,25,-60,4,37,82,86,46,63,-19,28,40,96,48,-60,-13,15,-84,-74,-17,28,-3,-93,97,9,95,41,-99,96,66,6,93,-31,22,-2,82,4,-16,29,-56,41,-66,84,37,58,-99,-75,-26,93,-73,33,21,0,16,18,-90,11,-63,-90,-16,-97,-8,-45,-52,-86,52,-69,-6,-87,36,37,54,69};

        int x;
        long st, en;
        st = System.nanoTime();
        x = s.maxSubArray(nums3);
        en = System.nanoTime();
        System.out.println("\nOne time " + (en - st)/1000000.d + " msc");  //5267 msc
        System.out.println(x); //4853

        Solution2 s2 = new Solution2();
        x = s2.maxSubArray(nums3);
        System.out.println(x);

//----------------------------------------------
        int[] nums4 = {7,1,5,3,6,4,2};
//        int[] nums4 = {4,1,2};
        Solution3 s3 = new Solution3();
        x = s3.maxProfit(nums4);
        System.out.println(x);


//----------------------------------------------
        int[] nums5 = {6,3,10,8,2,10,3,5,10,5,3};
        Solution4 s4 = new Solution4();
        x = s4.rob(nums5);
        System.out.println(Arrays.toString(nums5));
        System.out.println(x);
        x = s4.rob1(nums5);
        System.out.println(x);


//----------------------------------------------
        int nnn = 11;
        Solution6 s6 = new Solution6();
        x = s6.hammingWeight(nnn);
        System.out.println("В числе " + nnn + " кол-во единиц: ");
        System.out.println(x);
        System.out.println(Integer.bitCount(nnn));


//----------------------------------------------
        String st7 = "{}[]()";
        Solution7 s7 = new Solution7();
        boolean b7 = s7.isValid(st7);
        System.out.println(st7 + " - " + b7);
        System.out.println(st7.replaceAll("\\(\\)|\\{\\}", ""));
        st7 = "{{()[()]}}";
        b7 = s7.isValid2(st7);


//----------------------------------------------
        Solution8 s8 = new Solution8();
        int xx = 0b1000101;
        int yy = 0b1011111;
        x = s8.hammingDistance(xx, yy);
        System.out.println(x);


//----------------------------------------------
        Solution9 s9 = new Solution9();
        xx = 0b0111;
        xx = 43261596;
        x = s9.reverseBits(xx);
        System.out.println(x);


//----------------------------------------------
        Solution10 s10 = new Solution10();
        xx = 5;
        System.out.println(s10.generate(xx).toString());


        List<List<Integer>> list2 = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        temp.add(2);
        list2.add(temp);
        temp = new ArrayList();
        temp.add(4);
        temp.add(5);
        temp.add(6);
        list2.add(temp);
        temp = new ArrayList();
        temp.add(7);
        temp.add(8);
        temp.add(9);
        list2.add(temp);
        System.out.println(list2);


//----------------------------------------------
        Solution11 s11 = new Solution11();
        int[] nums = {2,0};
        x = s11.missingNumber(nums);
        System.out.println(Arrays.toString(nums) + ": " + x);

//----------------------------------------------
        Solution14 s14 = new Solution14();
//        int[] arr14 = {8,4,5,0,0,0,0,7};
        int[] arr14 = {1,0,2,3,0,4,5,0};
        s14.duplicateZeros(arr14);
        
//----------------------------------------------
        System.out.println("--- Solution 15 ---");
        Solution15 s15 = new Solution15();
        int[] arr15 = {0,1,2,2,3,0,4,2};
        int val15 = 2;
        System.out.println("Array: " + Arrays.toString(arr15));
        x = s15.removeElement(arr15, val15);
        System.out.println("Array: " + Arrays.toString(arr15) + "; val: " + val15 + "; new length: " + x);

        
//----------------------------------------------
        System.out.println("--- Solution 16 ---");
        Solution16 s16 = new Solution16();
        int[] arr16 = {14,82,89,84,79,70,70,68,67,66,63,60,58,54,44,43,32,28,26,25,22,15,13,12,10,8,7,5,4,3};
        System.out.println("Array: " + Arrays.toString(arr16));
        System.out.println("Array mountain: " + s16.validMountainArray(arr16));


//----------------------------------------------
        System.out.println("--- Solution 17 ---");
        Solution17 s17 = new Solution17();
        int[] arr17 = {1, 2, 4, 5, 5, 8, 9};
        System.out.println("Array: " + Arrays.toString(arr17));
        int[] x17 = new int[2];
        x17 = s17.searchRange(arr17, 6);
        System.out.println(Arrays.toString(x17));
                

//----------------------------------------------
        System.out.println("--- Solution 18 ---");
        Solution18 s18 = new Solution18();
        double x18 = 0.001;
        int y18 = 1800000000;
        st = System.nanoTime();
        double res18 = s18.myPow(x18, y18);
        en = System.nanoTime();
        System.out.println(x18 + " ** " + y18 + " = " + res18 + "; TIME: " + (en - st)/1000000.d + " msc");


//----------------------------------------------
        System.out.println("--- Solution 19 ---");
        Solution19 s19 = new Solution19();
        int[] arr19 = {5,2,6,1};
        List<Integer> x19 = s19.countSmaller(arr19);
        System.out.println(Arrays.toString(arr19));
        System.out.println(x19.toString());
        
//----------------------------------------------
        System.out.println("--- Solution 20 ---");
        Solution20 s20 = new Solution20();
        String st20s = "ADOBECODEBANC";
        String st20t = "ABC";
        st = System.nanoTime();
        String st20res = s20.minWindow(st20s, st20t);
        en = System.nanoTime();
        System.out.println(st20s + " - " + st20t + " : " + st20res);
        System.out.println(en - st);
        
        
//----------------------------------------------
        System.out.println("--- Solution 21 ---");
        Solution21 s21 = new Solution21();
        String st21 = "AAX";
        System.out.println(st21 + " - " + s21.RunLenEncoding(st21));
        st21 = "13AC2B9XS12V";
        System.out.println(st21 + " - " + s21.RunLenDecode(st21));
        
//----------------------------------------------
        System.out.println();
        System.out.println("--- Solution1BitAnd2BitCharacters ---");
        Solution1BitAnd2BitCharacters s22 = new Solution1BitAnd2BitCharacters();
        System.out.println(s22.isOneBitCharacter(new int[]{1,0,1,0,0,0,1,1,0}));

        
//----------------------------------------------
        System.out.println();
        System.out.println("--- Solution 23 ---");
        Solution23 s23 = new Solution23();
        String st23 = "the sky is blue";
        System.out.println(st23 + " - " + s23.reverseWords(st23));
        st23 = "  Bob    Loves  Alice   ";
        System.out.println(st23 + " - " + s23.reverseWords(st23));

//----------------------------------------------
        System.out.println();
        System.out.println("--- Solution 24 ---");
        Solution24 s24 = new Solution24();
        System.out.print("---Ugly Number from 10, 2, 3, 5: ");
        System.out.println(s24.nthUglyNumber(10, 2, 3, 5));
        

//----------------------------------------------
        System.out.println();
        System.out.println("--- Solution 25 ---");
        Solution25 s25 = new Solution25();
        int num25 = 8;
        System.out.println("sqrt and truncate " + num25 + ": " + s25.mySqrt(num25));


//----------------------------------------------
        System.out.println();
        System.out.println("--- Solution 26 ---");
        Solution26 s26 = new Solution26();
        int num26 = 125;
        System.out.println("Number of trailing zeroes in " + num26 + "!: " + s26.trailingZeroes(num26));

        
//----------------------------------------------
        System.out.println();
        System.out.println("--- Solution 27 ---");
        Solution27 s27 = new Solution27();
        int[] arr27 = {-2147483648};
        System.out.println("Majority Element: " + s27.majorityElement(arr27));

        
//----------------------------------------------
        System.out.println();
        System.out.println("--- Solution 28 ---");
        Solution28 s28 = new Solution28();
        System.out.println("Day of week: " + s28.dayOfTheWeek(31, 12, 2021));
        System.out.println("--- Solution 28 manual ---");
        Solution28_manual s28_manual = new Solution28_manual();
        System.out.println("Day of week: " + s28_manual.dayOfTheWeek(31, 12, 2021));


//----------------------------------------------
        System.out.println("--- Solution 29 ---");
        Solution29 s29 = new Solution29();
        int[] arr29 = {1,0,0,0,1,0};
        s29.sortColors(arr29);
        
    }
}




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