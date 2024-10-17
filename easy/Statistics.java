import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Statistics 
{
    public static void main(String[] args)
    {
        int[] arr = {16, 18, 27, 16, 23, 21, 19};
        double mean = calculateMean(arr);
        System.out.println("Mean = " + mean);
        double median = calculateMedian(arr);
        System.out.println("Median = " + median);
        int mode = calculateMode(arr);
        System.out.println("Mode = " + mode);
    }
    public static double calculateMean(int[] arr) 
    {
        int sum = 0;
        for (int num : arr) 
        {
            sum += num;
        }
        return (double) sum / arr.length;
    }
    public static double calculateMedian(int[] arr) 
    {
        Arrays.sort(arr); 
        int n = arr.length;
        if (n % 2 != 0) 
        {
            return arr[n / 2];
        } else 
        
            return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        }
    }
    public static int calculateMode(int[] arr) 
    {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) 
        {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        int mode = arr[0];
        int maxCount = 0;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) 
        {
            if (entry.getValue() > maxCount) 
            {
                maxCount = entry.getValue();
                mode = entry.getKey();
            }
        }

        return mode;
    }
}
