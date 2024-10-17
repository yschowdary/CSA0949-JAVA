import java.util.ArrayList;
import java.util.Collections;

public class Mergesort 
{
    public static void main(String[] args) 
    {
        int[] arr1 = {1, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8};
        ArrayList<Integer> mergedList = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) 
        {
            mergedList.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) 
        {
            mergedList.add(arr2[i]);
        }
        Collections.sort(mergedList);
        System.out.print("Merged array: ");
        for (int num : mergedList) {
            System.out.print(num + " ");
        }
    }
}
