package lesson8.primeandcompositenumbers;

/**
 * This scored 92% in 19 minutes (100% correctness, 92% performance).
 *
 * Error when handling large values of N (2147483647 exceeded time limit).
 *
 * Taken straight from notes.
 */
public class CountFactors
{
    public int solution(int N) {
        // write your code in Java SE 8
        int i = 1;
        int result = 0;

        while (i * i < N) {

            if (N % i == 0)
            {
                result += 2;
            }
            i++;
        }

        if (i * i == N) {
            result++;
        }
        return result;
    }
}
