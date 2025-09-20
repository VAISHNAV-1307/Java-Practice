import streams.StreamsPractice;

import java.util.Map;

public class Main {
    public static void main(String[] args) {

        StreamsPractice streamsPractice = new StreamsPractice();

        int[] array = {2, 1, 1, 2, 3, 4, 5};
        Map<Integer, Long> result = streamsPractice.getDuplicateInt(array);
        System.out.println(result);
    }
}