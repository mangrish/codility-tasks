package lesson2.countingelements;

/**
 * This scored 72% in 37 minutes. (83% correctness, 60% performance).
 * <p/>
 * I struggled on this one a little bit. The idea was to remember the time the leaf was in position and then to get the
 * max of that to know when the frog could cross the river (unless if contained 0's meaning it was uncrossable).
 * <p/>
 * There is a wrong answer for a low edge case. My low edge case was (2,[2,1,2]) but i should have done the actual
 * equivalence class.
 * <p/>
 * Response from the site: "For example, for the input (1, [1]) the solution returned a wrong answer (got -1 expected
 * 0)."
 * <p/>
 * Performance wise I was fine in terms of time but I got some answers wrong on large permutations and large ranges (X =
 * 30000)
 */
public class FrogRiverOne
{
    public int solution(int X, int[] A)
    {
        int N = A.length;

        int[] crossing = new int[X + 1];

        for (int K = 0; K < N; K++)
        {
            int position = A[K];

            if (crossing[position] == 0)
            {
                crossing[position] = K;
            }
        }

        int result = -1;

        for (int i = 1; i < X + 1; i++)
        {
            int pos = crossing[i];

            if (pos == 0)
            {
                return -1;
            }
            if (pos > result)
            {
                result = crossing[i];
            }
        }

        return result;
    }
}
