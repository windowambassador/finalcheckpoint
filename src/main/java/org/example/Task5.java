package org.example;

public class Task5 {
    public static void solve(int[] height) {
        int left = 0, right = height.length - 1;
        long best = 0;

        while (left < right) {
            long h = Math.min(height[left], height[right]);
            long area = h * (right - left);
            if (area > best) best = area;

            if (height[left] < height[right]) left++;
            else right--;
        }
        System.out.println(best);
    }
}