package lesson3.prefixsums;

/**
 * This scored 62% in 25 minutes (Correctness 100%, Performance 0%).
 *
 * I knew this was n^2 with the solution requiring n+m. There must be a way to use a prefix sum to hold the min slices.
 * for each sequence.
 *
 */
public class GenomicRangeQuery
{
    public int[] solution(String S, int[] P, int[] Q) {
        int M = P.length;
        int[] result = new int[M];

        for (int k = 0; k < M; k++)
        {
            int p = P[k];
            int q = Q[k];

            String sequence = S.substring(p,q + 1);

            int lowest = 4;

            for (char c: sequence.toCharArray())
            {
                if (c == 'A')
                {
                    lowest = 1;
                    break;
                }
                else if (c == 'C')
                {
                    lowest = 2;
                }
                else if (c == 'G')
                {
                    lowest = 3;
                }
            }
            result[k] = lowest;
        }

        return result;
    }
}
