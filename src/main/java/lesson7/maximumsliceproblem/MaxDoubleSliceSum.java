package lesson7.maximumsliceproblem;

/**
 * This scored 100% in 18 minutes.
 * <p/>
 * I was completely out of my depth with this one. Understanding how the theory worked for a single slice was ok but
 * adding the extra complexity of the moving value in the middle did my head in!
 * <p/>
 * I went to google to find out more about the Slice Sum algo and came across Kadane's Theorem
 * (https://en.wikipedia.org/wiki/Maximum_subarray_problem).
 * <p/>
 * Using this i looked for the approach to solving the double slice and i have to admit this was a little more headfucky
 * then I was expecting.
 */
public class MaxDoubleSliceSum
{
    public int solution(int[] A)
    {
        // write your code in Java SE 8

        int n = A.length;

        int[] forward = new int[n];
        int[] reverse = new int[n];

        for (int i = 1; i < n - 1; i++)
        {
            forward[i] = Math.max(forward[i - 1] + A[i], 0);
        }

        for (int j = n - 2; j > 0; j--)
        {
            reverse[j] = Math.max(reverse[j + 1] + A[j], 0);
        }

        int max = 0;

        for (int i = 1; i < n - 1; i++)
        {
            max = Math.max(max, forward[i - 1] + reverse[i + 1]);
        }

        return max;
    }
}
