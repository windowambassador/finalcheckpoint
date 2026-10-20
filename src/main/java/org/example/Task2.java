package org.example;

import java.util.*;

public class Task2 {
    public static void solve(int[] nums) {
        int n = nums.length;
        int[] a = nums.clone();
        Arrays.sort(a);

        List<int[]> res = new ArrayList<>();

        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && a[i] == a[i - 1]) continue; // пропуск дублей первого элемента
            if (a[i] > 0) break; // дальше все положительные — сумма не будет 0

            int lo = i + 1, hi = n - 1;
            while (lo < hi) {
                long sum = (long) a[i] + a[lo] + a[hi];
                if (sum == 0) {
                    res.add(new int[]{a[i], a[lo], a[hi]});
                    // пропускаем дубли
                    int lv = a[lo], hv = a[hi];
                    while (lo < hi && a[lo] == lv) lo++;
                    while (lo < hi && a[hi] == hv) hi--;
                } else if (sum < 0) {
                    lo++;
                } else {
                    hi--;
                }
            }
        }

        // вывод
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < res.size(); i++) {
            if (i > 0) sb.append(", ");
            int[] t = res.get(i);
            sb.append('[').append(t[0]).append(", ").append(t[1]).append(", ").append(t[2]).append(']');
        }
        sb.append(']');
        System.out.println(sb);
    }
}