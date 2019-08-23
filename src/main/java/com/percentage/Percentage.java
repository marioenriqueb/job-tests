package com.percentage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Percentage {

    /**
     * Pre condition:
     *      - two lists with same length, the first contains the tests names and the second the tests results.
     *      - test names: "<test><group-number><subgroup-number>".
     * Objetive: how percentage of testes were passed per group?
     * Example:
     *      ["test1a", "test2", "test1b", "test1c", "test3"]
     *      ["Wrong answer", "OK", "Runtime error", "OK", "Time limit exceeded"]
     *      Percentage: 33
     * */

    private static final String TEST_OK = "OK";

    public Integer check(String[] tests, String[] results) {

        Map<Integer, Boolean> mapa = new HashMap<>();

        Integer[] groups = Arrays.stream(tests)
                .map(str -> Integer.valueOf(str.replaceAll("\\D+", "")))
                .toArray(Integer[]::new);

        Boolean[] boolResults = Arrays.stream(results)
                .map(result -> TEST_OK.equalsIgnoreCase(result))
                .toArray(Boolean[]::new);

        IntStream.range(0, results.length).forEach(index -> {
            Integer key = groups[index];
            Boolean value = boolResults[index];
            mapa.put(key, mapa.get(key) == null ? value : mapa.get(key) && value);
        });

        Double value = (mapa.keySet().stream().mapToDouble(key -> mapa.get(key) ? 1.0 : 0.0).sum() / mapa.size()) * 100;
        return (int) Math.round(value);
    }

}
