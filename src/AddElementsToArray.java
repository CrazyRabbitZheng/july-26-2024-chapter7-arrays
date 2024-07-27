/**
 * This class adds elements to an empty array
 * @author--Zheng Wang
 */
public class AddElementsToArray {
    public static void main(String[] args) {
        final int ARRAY_SIZE = 10;//这个叫named constant

        int[] array = new int[ARRAY_SIZE];

        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = 2 + 2 * i;
        }

        System.out.printf("%s%8s%n%n","index", "value");
        for (int i = 0; i < ARRAY_SIZE; i++) {
            System.out.printf("%4d%8d%n", i, array[i]);
        }
    }
}
