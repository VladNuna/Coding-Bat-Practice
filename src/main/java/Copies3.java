import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Copies3 {

    /*
    *  Given a list of strings, return a list where each string is
    *  replaced by 3 copies of the string concatenated together.
    *
    *  copies3(["a", "bb", "ccc"]) → ["aaa", "bbbbbb", "ccccccccc"]
    *  copies3(["24", "a", ""]) → ["242424", "aaa", ""]
    *  copies3(["hello", "there"]) → ["hellohellohello", "theretherethere"]
    */
    public static List<String> copies3UsingFor(List<String> strings) {
        ArrayList<String> result = new ArrayList<String>();
        for (String string: strings) {
            result.add(string + string + string);
        }
        return  result;
    }

    public static List<String> copies3UsingReplaceAll(List<String> strings) {
        strings.replaceAll( string -> string + string + string);
        return strings;
    }

    public static List<String> copies3UsingMap(List<String> nums) {
        return nums.stream().map(string -> string + string + string).collect(Collectors.toList());
    }
}
