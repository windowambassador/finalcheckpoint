package org.example;

import java.util.*;

public class Task3 {
    public static void solve(int[] items) {
        if (items == null || items.length == 0) {
            System.out.println(0);
            return;
        }

        Map<Integer, Integer> count = new HashMap<>();
        int left = 0, best = 0;

        for (int right = 0; right < items.length; right++) {
            count.merge(items[right], 1, Integer::sum);

            while (count.size() > 2) {
                int lv = items[left];
                int c = count.get(lv) - 1;
                if (c == 0) count.remove(lv);
                else count.put(lv, c);
                left++;
            }

            best = Math.max(best, right - left + 1);
        }
        System.out.println(best);
    }
}