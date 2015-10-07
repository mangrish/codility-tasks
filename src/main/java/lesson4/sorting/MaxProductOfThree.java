package lesson4.sorting;

import java.util.Arrays;

/**
 * This scored 100% in 24 minutes.
 * <p/>
 * Originally i didn't have the three tiers of answer. It broke one of my tests [-5,-5,4,5] which prompted me to have a
 * closer look.
 */
public class MaxProductOfThree
{
    public int solution(int[] A)
    {
        int size = A.length;
        Arrays.sort(A);

        int highEnd = A[size - 1] * A[size - 2] * A[size - 3];
        int lowEnd = A[0] * A[1] * A[2];
        int extra = A[0] * A[1] * A[size - 1];

        return Math.max(highEnd, Math.max(lowEnd, extra));
    }
}
