

//using Hashing Technique
import java.util.*;

public class Main1 {
    public static int missingNumber(int []a, int N) {

        int hash[] = new int[N + 1]; //hash array

        // storing the frequencies
        for (int i = 0; i < N - 1; i++)
            hash[a[i]]++;

        //checking the freqencies for numbers 1 to N:
        for (int i = 1; i <= N; i++) {
            if (hash[i] == 0) {
                return i;
            }
        }

        // The following line will never execute.
        
        return -1;
    }

    public static void main(String args[]) {
        int N = 5;
        int a[] = {1, 2, 4, 5};

        int ans = missingNumber(a, N);
        System.out.println("The missing number is: " + ans);
    }

}
