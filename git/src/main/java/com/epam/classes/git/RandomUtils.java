package com.epam.classes.git;

import java.util.Random;

/**
 * Random utility methods suit.
 */
public final class RandomUtils {

    private static final long SEED;
    private static final Random random;

    static {
        SEED = System.nanoTime();
        random = new Random(SEED);
    }

    private RandomUtils() {
    }

    /**
     * This method randomly shuffles elements of a given array. Non-threadsafe.
     *
     * @param a an array to be shuffled
     */
    public static void shuffle(int[] a) {
        if (a == null) {
            throw new NullPointerException("argument array is null");
        }
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int r = i + randomInt(n - i);     // between i and n-1
            int temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }

    /**
     * Generates an integer value on the interval [0, n) using uniform distribution.
     *
     * @param n upper bound
     * @return random integer
     */
    public static int randomInt(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Parameter N must be positive");
        }
        return random.nextInt(n);
    }

}
