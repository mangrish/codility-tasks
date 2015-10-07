package lesson1.timecomplexity;

/**
 * This scored 100% in 11 minutes.
 */
class FrogJump
{
    public int solution(int X, int Y, int D)
    {

        int jumpDistance = Y - X;
        double jumps = (double) jumpDistance / D;
        return (int) Math.ceil(jumps);
    }
}
