package com.han.test.algorithm;

/**
 * @ClassName TwoNumEqualSum
 * @Description 给定一个数组和一个目标和，从数组中找两个数相加等于目标和，输出这两个数字的下标。
 *              可以假设每种输入只会对应一个答案,但是，你不能重复利用这个数组中同样的元素
 *             example：
 *             give：nums = [2,7,11,15],target = 9;
 *             because：num[0] + num[1] = 9;
 *             return: [0,1]
 * @Author hws
 * @Date 2021/4/25 14:47
 * @Version 1.0
 **/
public class TwoNumEqualSum {
    public static void main(String[] args) {
        TwoNumEqualSum twoNumEqualSum = new TwoNumEqualSum();
        int[] ints1 = new int[]{2,2,3,4,5,6,7};
        int target=5;
        int[] ints = twoNumEqualSum.towSum(ints1,target);
        System.out.println("下标为"+Integer.toString(ints[0])+","+Integer.toString(ints[1]));
    }
    //思路1：两重循环，循环遍历，相加，输出结果
    private int[] towSum(int[] nums,int target){
        int[] ans=new int[2];
        for (int i = 0; i < nums.length ; i++) {
            for (int j =(i+1); j < nums.length; j++) {
                if(nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
        }
        return null;
    }
}
