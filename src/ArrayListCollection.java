/**
 * This class plays with the ArrayList Collection
 * 声明一个ArrayList 的list，则这个list的长度不用length，是list.size（）
 * @author--Zheng Wang
 */
import java.util.ArrayList;

public class ArrayListCollection {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        System.out.println(list.toString());// This list is empty
        System.out.println(list.size());//size is 0

        list.add("A");
        list.add(1,"B");
        System.out.println(list.toString());//print   [A, B]

        list.remove("A");
        System.out.println(list.toString());//就剩[B]了

        System.out.println("Does list contain A? " + list.contains("A"));


    }
}
