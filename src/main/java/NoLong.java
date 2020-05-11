import java.util.List;
import java.util.stream.Collectors;

public class NoLong {
    /***
     *
     *  Given a list of strings, return a list of the strings, omitting any string length 4 or more.
     *
     * oLong(["this", "not", "too", "long"]) → ["not", "too"]
     * noLong(["a", "bbb", "cccc"]) → ["a", "bbb"]
     * noLong(["cccc", "cccc", "cccc"]) → []
     * @param strings
     * @return
     */

    public static List<String> noLong(List<String> strings) {
        return strings.stream()
                .filter(s -> s.length() < 4)
                .collect(Collectors.toList());
    }

}
