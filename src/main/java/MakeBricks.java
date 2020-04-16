public class MakeBricks {


    /*We want to make a row of bricks that is goal inches long. We have a number of small
     * bricks (1 inch each) and big bricks (5 inches each). Return true if it is possible
     * to make the goal by choosing from the given bricks. This is a little harder than it
     * looks and can be done without any loops.
     */
    public static boolean makeBricks(int small, int big, int goal) {
        int wall = 0;
        if(goal % 5 >= 0 && big != 0 && goal/5 >= big) {
            wall += big*5;
        } else if(goal % 5 >= 0 && big != 0) {
            wall += (goal / 5) * 5;
        }
        if(wall<goal && goal-wall <= small) {
            wall += (goal-wall) * 1;
        }
        return wall == goal;
    }
}
