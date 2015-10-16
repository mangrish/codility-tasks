import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Answers to one of my codility questions. I needed to get the encode working.
 */
public class Test1
{
    public int[] solution(int[] A)
    {
        // write your code in Java SE 8
        int M = A.length;
        int aAsInt = decode(A, M);
        System.out.println("Input " + Arrays.toString(A) + " is [" + aAsInt + "]");
        int answerAsInt = aAsInt * -1;
        return encode(answerAsInt);
    }

    int decode(int[] A, int m)
    {
        int result = 0;

        for (int i = 0; i < m; i++)
        {
            result += A[i] * (int) Math.pow(-2, i);
        }
        return result;
    }


    int[] encode(int num)
    {
        List<Integer> result = new ArrayList<>();
        while (num != 0)
        {
            int rem = num % -2;
            result.add(Math.abs(rem));
            num = (int) Math.ceil(num / -2.0);
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
