/**
 * This class sums every element in an array and print the total
 * @author--Zheng Wang
 */
public class SumArray {
    public static void main(String[] args) {
        int[] arr = { 87,68,94,100,83,78,85,91,76,87};
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }

        System.out.println("The sum of the array is: " + total);
    }
}
