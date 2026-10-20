package org.example;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("=== Задача 1 ===");
        Task1.solve(new int[]{100, 4, 200, 1, 3, 2});
        Task1.solve(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1});
        Task1.solve(new int[]{});
        System.out.println();

        System.out.println("=== Задача 2 ===");
        Task2.solve(new int[]{-1, 0, 1, 2, -1, -4});
        Task2.solve(new int[]{0, 0, 0, 0});
        Task2.solve(new int[]{1, 2, -2, -1});
        System.out.println();

        System.out.println("=== Задача 3 ===");
        Task3.solve(new int[]{1, 2, 1});
        Task3.solve(new int[]{0, 1, 2, 2});
        Task3.solve(new int[]{1, 2, 3, 2, 2});
        System.out.println();

        System.out.println("=== Задача 4 ===");
        Task4.solve(new int[]{1, 1, 1}, 2);
        Task4.solve(new int[]{1, -1, 0}, 0);
        System.out.println();

        System.out.println("=== Задача 5 ===");
        Task5.solve(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
        Task5.solve(new int[]{1, 1});
        System.out.println();

        System.out.println("=== Задача 6 ===");
        Task6.solve("ADOBECODEBANC", "ABC");
        Task6.solve("a", "aa");
        Task6.solve("AAABBC", "AABC");
    }
}