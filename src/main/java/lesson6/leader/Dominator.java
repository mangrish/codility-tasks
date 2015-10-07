package lesson6.leader;

/**
 * This scored 100% in 12 minutes.
 * <p/>
 * Quite similar to the lesson material only they call that the "leader".
 */
public class Dominator
{
    public int solution(int[] A) {
        int n = A.length;

        int size = 0;
        int value = -1;

        for (int k = 0; k < n; k++)
        {
            if (size == 0)
            {
                size++;
                value = A[k];
            }
            else
            {
                if (value != A[k])
                {
                    size--;
                }
                else
                {
                    size++;
                }
            }
        }

        int candidate = -1;

        if (size > 0)
        {
            candidate = value;
        }

        int leader = -1;
        int count = 0;

        for (int k = 0; k < n; k++)
        {
            if (A[k] == candidate)
            {
                count++;
            }
        }

        if (count > (n/2))
        {
            leader = candidate;
        }

        for (int k = 0; k < n; k++)
        {
            if (A[k] == leader)
            {
                return k;
            }
        }

        return -1;
    }
}
