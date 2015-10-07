package lesson3.prefixsums;

/**
 * This scored 100% in 43 minutes.
 *
 * It took me ~5 minutes to get the first solution right but unfortunately it is O(n) and broke my
 * codility test when supplied with a small and large number (i.e. a wide gap).
 *
 * I think took to the prefix sums documentation in the lessons and it showed slices being able to be
 * calculated with mathematics.
 *
 * I then looked on the internet for mathematical solutions to prefix sums involving calculating if
 * numbers are divisible between two. It was technically a little bit of cheating but my maths isn't that
 * strong these days!
 */
public class CountDiv
{
    public int solution(int A, int B, int K) {

        //   int result = 0;

        //   for (int i = A; i <= B; i++)
        //   {
        //       if (i % K == 0)
        //       {
        //           result++;
        //       }
        //   }

        //   return result;

        int upper = B;

        if (B % K != 0)
        {
            upper = B - B % K;
        }

        int lower = A;

        if (A % K != 0)
        {
            lower = A + (K - A%K);
        }

        return (upper - lower)/K + 1;
    }
}
