package lesson5.stacksandqueues;

import java.util.Stack;

/**
 * This scored 100% in 50 minutes.
 * <p/>
 * Harder than it looks
 */
public class StoneWall
{
    public int solution(int[] H)
    {
        // write your code in Java SE 8
        int N = H.length;

        int numShapes = 0;

        Stack<Integer> heights = new Stack<>();
        heights.push(0);

        for (int i = 0; i < N; i++)
        {
            int height = H[i];
            int currHeight = heights.peek();

            if (height > currHeight)
            {
                heights.push(height);
            }

            if (height < currHeight)
            {
                while (height < currHeight)
                {
                    heights.pop();
                    numShapes++;
                    currHeight = heights.peek();
                }

                if (height > currHeight)
                {
                    heights.push(height);
                }
            }
        }

        return numShapes + heights.size() - 1;
    }
}
