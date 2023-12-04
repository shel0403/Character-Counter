package com.example.charoccurrence.util;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public final class StringProcessor {

    private StringProcessor() {
    }

    public static String getSortedDistinctByValueAsStringCharOccurrences(final String s) {
        if (s == null) {
            throw new IllegalArgumentException("No string");
        }

        return countCharOccurrences(s).entrySet().stream()
                .sorted((entry1, entry2) -> Math.toIntExact(entry2.getValue() - entry1.getValue()))
                .map(entry -> String.format("\"%s\": %d", entry.getKey(), entry.getValue()))
                .collect(Collectors.joining(", "));
    }

    private static Map<Character, Long> countCharOccurrences(final String s) {
        return s.chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
