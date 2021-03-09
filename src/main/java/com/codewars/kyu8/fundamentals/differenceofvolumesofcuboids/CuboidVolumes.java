package com.codewars.kyu8.fundamentals.differenceofvolumesofcuboids;

/**
 * @author Iuriy Gaydarzhi.
 * @since 09.03.2021
 */
public class CuboidVolumes {

    public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
        int fc = 1, sc = 1;
        for (int i = 0; i < 3; i++) {
            fc *= firstCuboid[i];
            sc *= secondCuboid[i];
        }
        return fc > sc ? fc - sc : sc - fc;
    }
}
