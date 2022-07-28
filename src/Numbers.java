import java.util.SplittableRandom;

public class Numbers {
    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 1; i < array.length; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
