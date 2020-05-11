public class NextSmallestElement {

    static int [] nextSmallestNumOrder(int numberList[])
    {
        int size = numberList.length;
        int minFromRight =  numberList[size-1];
        numberList[size-1] = -1;

        for (int i = size-2; i >= 0; i--)
        {
            int temp = numberList[i];
            numberList[i] = minFromRight;
            if(temp < minFromRight)
                minFromRight = temp;
        }
        return numberList;
    }
}
