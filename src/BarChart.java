/**
 * This class displays students' grade frequencies as *'s
 * i.e., 1 student has mark between 60-69 will show one * in the bar chart
 */
public class BarChart {
    public static void main(String[] args) {

        int[] arr = { 0, 0, 0, 0, 0, 0, 1, 4, 5, 2, 1 };

        System.out.println("Grade distrabution:");
        for (int i = 0; i < arr.length; i++) {
            if(i == 10){
                System.out.printf("%n%5d: ",100);
            }else {
                System.out.printf("%n%2d-%2d: ",10 * i, 9 + 10 * i);
            }

            for (int star = 0; star < arr[i]; star++) {
                System.out.print("*");
            }
        }
        System.out.println();//a blank line
    }
}
