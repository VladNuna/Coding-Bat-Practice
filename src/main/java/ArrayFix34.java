public class ArrayFix34 {
    /**
     * Method that returns an array that contains the same numbers as provided
     * but every 3 is imidiatly followed by a 4
     * @param nums list of integers provided
     * @return list of integers based on the above rule
     */
    public static int[] fix34(int[] nums) {
        for(int i = 0; i< nums.length; i++) {
            if(nums[i] == 3 && nums[i+1] != 4) {
                for(int e = 0; e < nums.length; e++) {
                    if (nums[e] == 4 && nums[e-1] != 3) {
                        int toMove = nums[i+1];
                        int index = e;
                        nums[i+1] = nums[e];
                        nums[index] = toMove;
                        break;
                    }
                }
            }
        }
        System.out.println(nums);
        return nums;
    }

}
