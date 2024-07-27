/**
 * This class is a typical array-processing application
 * 10 people rated the store of 1-5 star, two people managed to enter invalid rating -- 50 and 11
 * This class shows the rating frequencies as bar chart.
 * displaying the bar chart with horizontal asterisks
 * @author--Zheng Wang
 */
public class StoreGoogleReview {
    public static void main(String[] args) {

        int[] ratings = {5, 2, 50, 3, 3, 5, 2, 11, 3};

        int[] frequencies = new int[5];

        int total = 0;
        int count = 0;

        for (int i = 0; i < ratings.length; i++) {
            try {
                frequencies[ratings[i] - 1]++;
                total += ratings[i];
                count++;
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println();
                System.out.println(e);
                System.out.printf("The %dth's rating %d is not a valid rating%n%n",i + 1, ratings[i]);
            }
        }

        for (int i = 0; i < frequencies.length; i++) {
            System.out.printf("%n%d star rating: ",i+1);
            for (int star = 0; star < frequencies[i]; star++) {
                System.out.print("*");
            }
        }
        System.out.printf("%n%nThe average rating is %.1f star.", (double)total/count);
    }
}
