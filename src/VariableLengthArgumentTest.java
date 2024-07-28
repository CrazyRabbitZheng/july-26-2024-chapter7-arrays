/**
 * This class practises variable-length argument list
 * Why use variable-length argument list?
 * Say if you wanna calculate the average of numbers. 3 numebr, 5 numebrs. you can all use the same method
 * @author--Zheng Wang
 */
public class VariableLengthArgumentTest {
    public static void main(String[] args) {
        double number1 = 10.0;
        double number2 = 20.0;
        double number3 = 30.0;
        double number4 = 40.0;

        System.out.printf("number1 = %.1f%nnumber2 = %.1f%nnumber3 = %.1f%nnumber4 = %.1f%n%n", number1, number2, number3, number4);

        System.out.println("The average of number1 and number2 is " + average(number1, number2));
        System.out.println("The average of number3 and number4 is " + average(number3, number4));
        System.out.println("The average of all the 4 numbers is  " + average(number1,number2,number3,number4));

    }

    public static double average(double... numbers) {//这里自动把这些numbers看作一个double 的array
        double sum = 0.0;
        for (double number : numbers) {
            sum += number;
        }
        return sum/numbers.length;
    }
}
