/**
 * This class demonstrates passing an entire array (passing the reference)
 * and passing an integer array element (passing the integer)
 * @author--Zheng Wang
 */
public class PassingArrayAndArrayElements {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5};

        System.out.println("The original array is: ");
        for (int number : arr) {
            System.out.printf("%d\t",number);
        }
        System.out.println();

        modifyWholeArray(arr);
        System.out.printf("After modified the original array, arr[0] is: %d", arr[0]);
        System.out.println("\nThe whole array after modification is: ");
        for (int number : arr) {
            System.out.printf("%d\t",number);
        }
        System.out.println();
        System.out.println("So, passing an whole array is passing the reference. When it gets to the reference, it modifies the original array.");

        modifyIntegerElement(arr[0]);
        System.out.println("After modified the element, The original array stays as it is: ");
        for (int number : arr) {
            System.out.printf("%d\t",number);
        }
        System.out.println();
        System.out.println("So, passing an integer element is passing the actual value\n" +
                "When it gets to the value, it has nothing to do with the original array.");

    }

    public static void modifyWholeArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 3;
        }
    }

    public static void modifyIntegerElement(int number){
        number += 5;
        System.out.println("In the element modification, the modified element now is: " + number);
    }
}
