package org.example;

import java.util.*;

public class Task4 {
    public static void solve(int[] nums, long k) {
        Map<Long, Integer> map = new HashMap<>();
        map.put(0L, 1); // пустой префикс

        long prefix = 0;
        long count = 0;

        for (int x : nums) {
            prefix += x;
            count += map.getOrDefault(prefix - k, 0);
            map.merge(prefix, 1, Integer::sum);
        }
        System.out.println(count);
    }
}