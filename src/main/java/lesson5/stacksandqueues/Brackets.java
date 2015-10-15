package lesson5.stacksandqueues;

import java.util.Stack;

/**
 * This scored 100% in 31 minutes.
 */
public class Brackets
{
    public int solution(String S)
    {
        // write your code in Java SE 8
        char[] string = S.toCharArray();
        int N = string.length;

        if (N == 0)
        {
            return 1;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < N; i++)
        {
            char c = string[i];

            if (c == '(' || c == '{' || c == '[')
            {
                stack.push(c);
            }
            else
            {
                char oppChar;

                if (c == ']') {
                    oppChar = '[';
                }
                else if (c == '}') {
                    oppChar = '{';
                }
                else {
                    oppChar = '(';
                }

                if (stack.lastIndexOf(oppChar) != stack.size() - 1) {
                    return 0;
                }
                else if (stack.peek() == oppChar) {
                    stack.pop();
                }
            }
        }

        if (stack.empty()) {
            return 1;
        }

        return 0;
    }
}
