package lesson1.timecomplexity;

/**
 * This scored 80% in 16 minutes (100% correct, 60% performance).
 * <p/>
 * Quickly looking the problems come from the large range.  I think this is either from the initial total calc or the
 * return casting the result to int.
 */
public class PermMissingElem
{
    public int solution(int[] A)
    {
        // write your code in Java SE 8
        int N = A.length + 1;

        long total = (N * (N + 1)) / 2;// N = 100000 can overflow int.

        for (int i : A)
        {
            total -= i;
        }

        return (int) total;
    }
}
