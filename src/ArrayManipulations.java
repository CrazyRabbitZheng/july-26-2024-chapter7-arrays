import java.util.Arrays;

/**
 * This class plays with class Array's static methods
 * including - sort(),binarySearch(),equals(),fill()，copyOf()
 * @author--Zheng Wang
 */
public class ArrayManipulations {
    public static void main(String[] args) {
        double[] array = {8.4, 9.3, 0.2, 7.9, 3.4};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));//显示[0.2, 3.4, 7.9, 8.4, 9.3]

        int[] array2 = new int[10];
        Arrays.fill(array2, 7);
        System.out.println(Arrays.toString(array2));//显示[7, 7, 7, 7, 7, 7, 7, 7, 7, 7]

        int[] originalArray = {1,2,3,4,5,6,};
        int[] copyArray = Arrays.copyOf(originalArray, originalArray.length);
        System.out.println(Arrays.toString(copyArray));//显示[1, 2, 3, 4, 5, 6]

        int[] secondCopyArray = Arrays.copyOf(originalArray, originalArray.length - 2);
        System.out.println(Arrays.toString(secondCopyArray));//抄原来的array,但是长度比原来少2，于是原来array最后面两个element删掉了。

        Boolean b = Arrays.equals(originalArray, copyArray);
        System.out.println(b);
        int index = Arrays.binarySearch(originalArray, 4);//找array里有没有数字4， 返回数字4的index. 没有数字4的话就return一个负值。
        System.out.println(index);
    }
}

