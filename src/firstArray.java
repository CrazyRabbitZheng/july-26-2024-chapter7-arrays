/**
 * This class practice arrays
 * @author--Zheng Wang
 */
public class firstArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.printf("%s%8s%n%n", "Index", "Value");

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d%8d%n", i, arr[i]);
        }

        int[] arr2 = {32,27,64,18,95,14,90,70,60,37};

        System.out.printf("%s%28s%n%n", "Index of 2nd array", "Value of 2nd array");
        for (int i = 0; i < arr2.length; i++) {
            System.out.printf("%d%30d%n", i, arr2[i]);
        }
    }
}
