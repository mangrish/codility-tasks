package lesson3.prefixsums;

/**
 * This scored 100% in 37 minutes.
 * <p/>
 * This one was a bit hard. First I counted east and west but the problem only states you need to know who is _passing_
 * only so you only need to keep a counter of how many cars travelling east you have passed before you encountered the
 * next car travelling west.hirteenththirteent
 */
public class PassingCars
{
    public int solution(int[] A)
    {
        // write your code in Java SE 8
        int N = A.length;

        int east = 0;
        int passing = 0;

        for (int k = 0; k < N; k++)
        {

            int val = A[k];

            if (val == 1)
            {
                passing += east;
                if (passing > 1000000000)
                {
                    return -1;
                }
            }
            else
            {
                east++;
            }
        }

        return passing;
    }
}
