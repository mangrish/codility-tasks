package lesson1.timecomplexity;

/**
 * This scored 91% in 26 minutes.
 *
 * The only wrong answer seems to be due to the initial value of minDiff. Setting this initially to MAX_VAL or doing
 * a special case with an initialising value would have fixed this.
 *
 * Response from the site:
 * "For example, for the input [-1000, 1000] the solution returned a wrong answer (got 1000 expected 2000)."
 *
 */
class TapeEquilibrium
{
    public int solution(int[] A)
    {

        // size of A between 2 and 100000
        int N = A.length;

        int[] deltaArray = new int[N];

        int lhs = 0;

        for (int i = 0; i < N; i++)
        {
            lhs += A[i];
            deltaArray[i] = lhs;
        }

        int rhs = 0;
        int minDiff = 1000; // the int max value

        for (int j = N - 1; j > 0; j--)
        {
            rhs += A[j];
            int difference = Math.abs(deltaArray[j - 1] - rhs);

            if (minDiff > difference)
            {
                minDiff = difference;
            }

        }
        return minDiff;
    }
}
