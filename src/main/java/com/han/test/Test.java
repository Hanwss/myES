package com.han.test;

import java.util.ArrayList;

/**
 * @ClassName Test
 * @Description 测试equals方法 TODO
 * @Author hws
 * @Date 2021/4/6 15:28
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        String a = "";
        String b = "";
        System.out.println("两个空字符比较" + a.equals(b));
        int[] ints = {1, 2, 1, 3, 2, 2, 4, 5, 3, 6};
        Test test = new Test();
        System.out.println(test.removeDuplicates(ints));
    }

    /**
     * @return
     * @Author hws
     * @Description //TODO
     * @Date
     * @Param
     **/
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

}
