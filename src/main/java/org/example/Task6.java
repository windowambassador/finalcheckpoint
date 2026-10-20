package org.example;

public class Task6 {
    public static void solve(String source, String target) {
        if (target.length() > source.length()) {
            System.out.println("\"\"");
            return;
        }

        int[] need = new int[128];
        for (char c : target.toCharArray()) need[c]++;

        int[] have = new int[128];
        int required = 0;
        for (int c = 0; c < 128; c++) if (need[c] > 0) required++;
        int satisfied = 0; // сколько символов уже покрыто в нужном количестве

        int left = 0, bestLen = Integer.MAX_VALUE, bestL = 0;
        int n = source.length();

        for (int right = 0; right < n; right++) {
            char rc = source.charAt(right);
            have[rc]++;
            if (need[rc] > 0 && have[rc] == need[rc]) satisfied++;

            // сжимаем окно, пока все требования выполнены
            while (satisfied == required) {
                if (right - left + 1 < bestLen) {
                    bestLen = right - left + 1;
                    bestL = left;
                }
                char lc = source.charAt(left);
                if (need[lc] > 0 && have[lc] == need[lc]) satisfied--;
                have[lc]--;
                left++;
            }
        }

        if (bestLen == Integer.MAX_VALUE) {
            System.out.println("\"\"");
        } else {
            System.out.println("\"" + source.substring(bestL, bestL + bestLen) + "\"");
        }
    }
}