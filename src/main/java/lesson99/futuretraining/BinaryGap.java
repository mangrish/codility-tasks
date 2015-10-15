package lesson99.futuretraining;

/**
 * This scored 100% in 22 minutes.
 * <p/>
 */
public class BinaryGap
{
    public int solution(int N)
    {
        // write your code in Java SE 8
        char[] binaryN = Integer.toBinaryString(N).toCharArray();

        int maxGap = 0;
        int currGap = 0;

        for (int j = 0; j < binaryN.length; j++)
        {
            char c = binaryN[j];

            if (c == '1')
            {
                if (currGap > maxGap)
                {
                    maxGap = currGap;
                }
                currGap = 0;
            }
            else
            {
                currGap++;
            }
        }

        return maxGap;
    }
}
