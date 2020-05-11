import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RightDigit {
    /***
     * Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)
     *
     * rightDigit([1, 22, 93]) → [1, 2, 3]
     * rightDigit([16, 8, 886, 8, 1]) → [6, 8, 6, 8, 1]
     * rightDigit([10, 0]) → [0, 0]
     *
     * @param nums The list of intiger numbers that needs to be processed
     * @return The actual list based on the given contex (right most digit)
     */


    public static List<Integer> rightDigitUsingFor(List<Integer> nums) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (Integer number: nums) {
            result.add(number % 10);
        }
        return  result;
    }

    public static List<Integer> rightDigitUsingReplaceAll(List<Integer> nums) {
        nums.replaceAll( number -> number % 10);
        return nums;
    }

    public static List<Integer> rightDigitUsingMap(List<Integer> nums) {
        return nums.stream().map(number -> number % 10).collect(Collectors.toList());
    }
}
