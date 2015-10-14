package lesson2.countingelements;

/**
 * This scored 80% in 16 minutes. (60% correctness, 100% performance).
 *
 * Silly mistake with duplicate inputs. Should have written one more test to detect that.
 *
 * Response from the site: "For example, for the input [1, 1] the solution returned a wrong answer (got 1 expected 0)."
 * <p/>
 */
public class PermCheck
{
    public int solution(int[] A) {
        // write your code in Java SE 8
        int N = A.length;

        int[] exists = new int[N + 1];

        for (int k = 0; k < N; k++) {

            int val = A[k];

            if (val > N) {
                return 0;
            }
            exists[val]++;
        }

        for (int i = 1; i < N; i++) {
            if (exists[i] == 0) { // needed to add || exists[i] > 1
                return 0;
            }
        }

        return 1;
    }
}
