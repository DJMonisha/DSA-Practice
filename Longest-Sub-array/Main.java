


import java.util.*;

public class Main {
    public static int getLongestSubarray(int []a, int k) {
        int n = a.length; 

        int len = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) { 
                // add all the elements of subarray = a[i...j]
                
                int s = 0;
                for (int K = i; K <= j; K++) {
                    s += a[K];
                }

                if (s == k)
                    len = Math.max(len, j - i + 1);
            }
        }
        return len;
    }

    public static void main(String[] args) {
        int[] a = { -1, 1, 1};
        int k = 1;
        int len = getLongestSubarray(a, k);
        System.out.println("The length of the longest subarray is: " + len);
    }
}
