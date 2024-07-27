/**
 * This class roll a die 60 times, and display the frequencies of the faces
 * at first
 * @author--Zheng Wang
 */
import java.security.SecureRandom;

public class RollDieFrequency {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();

        int[] frequencies = new int[6];

        for (int i = 0; i < 60; i++) {
            frequencies[random.nextInt(6)]++;
        }

        for (int i = 0; i < 6; i++) {
            System.out.printf("%nYou rolled (face)%d %3d times",i + 1,frequencies[i]);
        }
        System.out.println();
    }
}
