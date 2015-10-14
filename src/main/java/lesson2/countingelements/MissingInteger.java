package lesson2.countingelements;

/**
 * This scored 22% in 29 minutes.
 * Second attempt: 88% in 9 minutes (80% correctness, 100% performance).
 *
 * I botched this one pretty badly and had to take it again.
 *
 * I got fooled by the upper limit always being 100,000 and not Integer.MAX_VALUE.
 *
 * In the end it was pretty easy but i did need that clue to get by it.
 *
 * The only wrong part of this answer was for single value entries like [-1],[0],[1].
 *
 */
public class MissingInteger
{
    public int solution(int[] A) {
        // write your code in Java SE 8
        int N = A.length;
        int[] seen = new int[ N + 1];

        for (int k = 0; k < N; k++)
        {
            int val = A[k];

            if (val > 0 && val <= N)
            {
                seen[val]++;
            }
        }

        for (int i = 1; i < N; i++)
        {
            if (seen[i] == 0)
            {
                return i;
            }
        }

        return N + 1;
    }
}
