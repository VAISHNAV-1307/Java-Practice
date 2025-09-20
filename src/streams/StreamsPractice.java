package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsPractice {

    /*
    1. Find Duplicate Elements
    Given a array of integers, find all the elements that appear more than once.
     */

    public Map<Integer, Long> getDuplicateInt(int[] array) {
        // {2, 1, 1, 2, 3, 4, 5}
        return Arrays.stream(array)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    /*
    2. Find the first non-repeated character in a string using Streams.
     */

    public Character findFirstNonRepeatingChar(String str) {
        // "Vaishnav"
        return str.toLowerCase().chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream().filter(entry -> entry.getValue() == 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (c1, c2) -> c1, LinkedHashMap::new))
                .firstEntry()
                .getKey();
    }
}
