package lesson2.countingelements;

import java.util.Arrays;

/**
 * This scored 77% in 15 minutes. (100% correctness, 60% performance).
 * <p/>
 * This was conceptually pretty easy. Way easier than the "painless" ones. Not sure why the performance was so bad on
 * this one. it was complaining about the large random tests in performance.
 */
public class MaxCounters
{
    public int[] solution(int N, int[] A)
    {
        // write your code in Java SE 8
        int M = A.length;

        int[] counters = new int[N];

        int maxCounter = 0;

        for (int K = 0; K < M; K++)
        {
            int X = A[K];

            if (X >= 1 && X <= N)
            {
                counters[X - 1]++;

                if (counters[X - 1] > maxCounter)
                {
                    maxCounter = counters[X - 1];
                }

            }
            else if (X == N + 1)
            {
                Arrays.fill(counters, maxCounter);
            }
        }

        return counters;
    }
}
