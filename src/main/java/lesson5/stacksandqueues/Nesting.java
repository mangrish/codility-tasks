package lesson5.stacksandqueues;

import java.util.Stack;

/**
 * This scored 100% in 11 minutes.
 * <p/>
 * I thought about implementing my own stack but I thought that would be a waste of time.
 */
public class Nesting
{
    public int solution(String S) {
        // write your code in Java SE 8

        char[] charArray = S.toCharArray();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < charArray.length; i++)
        {
            char c = charArray[i];

            if (c == '(')
            {
                stack.push(c);
            }
            else
            {
                if (stack.isEmpty())
                {
                    return 0;
                }
                stack.pop();
            }
        }

        return stack.isEmpty() ? 1: 0;
    }
}
