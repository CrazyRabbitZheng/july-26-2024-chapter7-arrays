/**
 * This class sums every element in an array and print the total
 * @author--Zheng Wang
 */
public class SumArray {
    public static void main(String[] args) {
        int[] arr = { 87,68,94,100,83,78,85,91,76,87};
        int total = 0;
//below is traditional for loop
//        for (int i = 0; i < arr.length; i++) {
//            total += arr[i];
//        }

        //below is enhanced for loop -- for each
        for(int score : arr){
            total += score;
        }

        System.out.println("The sum of the array is: " + total);
    }
}
