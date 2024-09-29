package com.rvfs.javachallenges.hackerrank.challenges.strings;

import com.rvfs.javachallenges.hackerrank.challenges.strings.SherlockAndValidString;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://www.hackerrank.com/challenges/ctci-making-anagrams/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings
 */
public class SherlockAndValidStringTest {

    @ParameterizedTest
    @MethodSource
    void solution(String s, String expected) {
        String result = SherlockAndValidString.isValid(s);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> solution() {
        List<Arguments> arguments = new ArrayList<>();

        arguments.add(Arguments.of("abcdee", "YES"));
        arguments.add(Arguments.of("abcdefghhgfedecba", "YES"));
        arguments.add(Arguments.of("aabbcd", "NO"));

        return arguments.stream();
    }
}
