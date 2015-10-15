package lesson4.sorting;

import java.util.HashSet;
import java.util.Set;

/**
 * This scored 100% in 5 minutes.
 * <p/>
 * A little too easy if you don't have to create your own Set!
 */
public class Distinct
{
    public int solution(int[] A) {
        // write your code in Java SE 8
        Set<Integer> unique = new HashSet<>();

        for (int a: A)
        {
            unique.add(a);
        }

        return unique.size();
    }
}
