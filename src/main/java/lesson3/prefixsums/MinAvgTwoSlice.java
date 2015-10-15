package lesson3.prefixsums;

/**
 * This scored 50% in 46 minutes (Correctness 40%, Performance 60%).
 * <p/>
 * I thought the smallest minimal slice will always be length 2 but it seems it could be length 2 or 3.
 *
 * Maybe holding another prefix sum array for 3's and then iterating through that as well as the 2's would find the smallest
 * one.
 */
public class MinAvgTwoSlice
{
    public int solution(int[] A) {
        // write your code in Java SE 8
        int N = A.length;
        double[] P = prefixSums(A);

        double minVal = 10001;
        int idx = 0;

        for (int k = 0; k < P.length; k++) {

            if (P[k] < minVal)
            {
                minVal = P[k];
                idx = k;
            }
        }

        return idx;
    }

    double[] prefixSums(int[] A) {
        int n = A.length;
        double[] P = new double[n -1];

        for (int k = 1; k < n ; k++) {
            P[k - 1] = ((double)A[k - 1] + A[k]) / 2.0;
        }

        return P;
    }
}
