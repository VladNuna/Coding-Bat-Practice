import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ElementDouble {

    public static List<Integer> doublingUsingFor(List<Integer> nums) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (Integer number: nums) {
            result.add(number * 2);
        }
        return  result;
    }

    public static List<Integer> doublingUsingReplaceAll(List<Integer> nums) {
        nums.replaceAll( number -> number * 2);
        return nums;
    }

    public static List<Integer> doublingUsingMap(List<Integer> nums) {
        return nums.stream().map(number -> number * 2).collect(Collectors.toList());
    }
}