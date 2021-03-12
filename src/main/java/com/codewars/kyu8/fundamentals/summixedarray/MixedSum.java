package com.codewars.kyu8.fundamentals.summixedarray;

import java.util.List;

/**
 * @author Iuriy Gaydarzhi.
 * @since 12.03.2021
 */
public class MixedSum {

    public int sum(List<Object> mixed) {
        int count = 0;
        for (Object o : mixed) {
            if (o.equals(o.toString())) {
                count += (Integer.parseInt(o.toString()));
            } else {
                count += (Integer) o;
            }
        }
        return count;
    }
}
