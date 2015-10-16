/**
 * Answer to one of my codility questions.
 */
public class Test2
{
    public int solution(int X, int[] A)
    {
        // write your code in Java SE 8
        int N = A.length;
        int rIdx = N - 1;
        int rCount = 0;

        int lIdx = 0;
        int lCount = 0;

        // handle 0th elem && N -1th elem
        if (A[rIdx] != X)
        {
            rCount++;
        }
        if (A[lIdx] == X)
        {
            lCount++;
        }

        // converge indexes
        while (lIdx != rIdx)
        {
            if (lCount > rCount)
            {
                rIdx--;
                if (A[rIdx] != X)
                {
                    rCount++;
                }
            }
            else
            {
                lIdx++;
                if (A[lIdx] == X)
                {
                    lCount++;
                }
            }
        }

        if (rIdx > 0)
        {
            return rIdx;
        }
        return 0;
    }
}
