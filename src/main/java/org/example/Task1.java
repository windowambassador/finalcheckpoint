package org.example;

import java.util.*;

public class Task1 {
    public static void solve(int[] nums) {
        if (nums == null || nums.length == 0) {
            System.out.println(0);
            return;
        }

        Set<Integer> set = new HashSet<>();
        for (int x : nums) set.add(x);

        int best = 0;
        for (int x : set) {
            // начинаем только с «начала» последовательности
            if (!set.contains(x - 1)) {
                int cur = x;
                int len = 1;
                while (set.contains(cur + 1)) {
                    cur++;
                    len++;
                }
                if (len > best) best = len;
            }
        }
        System.out.println(best);
    }
}