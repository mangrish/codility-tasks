package lesson4.sorting;

import java.util.Arrays;

/**
 * This scored 93% in 27 minutes.
 *
 * There is a trick here with 0 <= P < Q < R < N.  As all the conditions below are reflexive we can assume that this
 * condition always holds and we don't have to trac the indexes moving.
 *
 * The error was with extreme overflow (passing in Integer.MAX_VALUE three times).
 */
public class Triangle
{
    public int solution(int[] A)
    {
        // write your code in Java SE 8
        int N = A.length; // max 100000

        Arrays.sort(A);

        for (int i = 0; i < N - 2; i++)
        {
            int p = A[i];
            int q = A[i + 1];
            int r = A[i + 2];

            if (p + q > r && q + r > p && r + p > q)
            {
                return 1;
            }
        }
        return 0;

    }
}
