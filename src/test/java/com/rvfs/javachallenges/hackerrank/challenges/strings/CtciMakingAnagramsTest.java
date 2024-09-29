package com.rvfs.javachallenges.hackerrank.challenges.strings;

import com.rvfs.javachallenges.hackerrank.challenges.strings.CtciMakingAnagrams;
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
public class CtciMakingAnagramsTest {

    @ParameterizedTest
    @MethodSource
    void solution(String a, String b, int expected) {
        int result = new CtciMakingAnagrams().makeAnagram(a, b);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> solution() {
        List<Arguments> arguments = new ArrayList<>();

        arguments.add(Arguments.of("cde", "abc", 4));
        arguments.add(Arguments.of("xab", "abc", 2));

        return arguments.stream();
    }
}
