import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Введите Ваше число:");
        double num = 0;

        while (num <= 7) {
            num = keyboard.nextDouble();
            if (num <= 7) {
                System.out.println("Попробуйте ещё раз:");
            }
        }
        System.out.println("Привет");
    }
}