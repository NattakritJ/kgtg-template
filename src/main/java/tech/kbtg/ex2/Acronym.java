package tech.kbtg.ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Acronym {
    public String abbreviate(String input) {
        List<String> s = splitAny(input.toUpperCase(), new String[]{" ", "-", ":"});

        return s
                .stream()
                .map(it -> it.substring(0, 1))
                .collect(Collectors.joining(""));
    }

    public static List<String> splitAny(String input, String[] separators) {
        for (int i = 1; i < separators.length; i++) {
            input = input.replaceAll(separators[i], separators[0]);
        }

        return Arrays.asList(input.split(separators[0]));
    }}
