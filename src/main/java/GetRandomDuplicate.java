import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GetRandomDuplicate {
    /***
     * Build a program that uses Random to choose and item from a list.
     * The chosen item should be the first choice that is a duplicate.
     *
     * @param nums The actual list of integers contaigning the duplicate numbers
     * @return a random Integer duplicate number or -1 if no duplicates are found
     */
    public static int getRandomDuplicateNumberUsingForLoop(List<Integer> nums) {
        List<Integer> duplicate = new ArrayList<Integer>();
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i+1; j < nums.size(); j++) {
                if (nums.get(i).equals(nums.get(j))) {
                    // got the duplicate element
                    duplicate.add(nums.get(i));
                }
            }
        }

        if(duplicate.size() > 0){
            // Give a random duplicate
            int length = duplicate.size();
            return duplicate.get(getRandomIndexBetweenRange(0, length));
        }else{
            return -1;
        }
    }

    public static int getRandomDuplicateNumberUsingHashSet(List<Integer> nums) {

        HashSet unique = new HashSet();
        List<Integer> duplicate = new ArrayList<Integer>();

        for (Integer dupe : nums) {
            if(!unique.add(dupe)){
                duplicate.add(dupe);
            }
        }

        if(duplicate.size() > 0){
            // Give a random duplicate
            int length = duplicate.size();
            return duplicate.get(getRandomIndexBetweenRange(0, length));
        }else{
            return -1;
        }
    }

    public static Integer getRandomDuplicateNumberUsingGroupBy(List<Integer> nums) {

        Map<Integer , Long> hmap = nums.stream().collect(Collectors.groupingBy( Function.identity(), Collectors.counting()));
        List<Integer> duplicate = hmap.entrySet().stream().filter(duplicates -> duplicates.getValue() > 1).map(d -> d.getKey()).collect(Collectors.toList());

        duplicate.get(0);
        if(duplicate.size() > 0){
            // Give a random duplicate
            int length = duplicate.size();
            return duplicate.get(getRandomIndexBetweenRange(0, length)); // cast from long to int
        }else{
            return -1;
        }
    }



    private static int getRandomIndexBetweenRange(int start, int end){
        Random random = new Random();
        int randomNumber = random.nextInt(end - start) + start;
        return randomNumber;
    }
}