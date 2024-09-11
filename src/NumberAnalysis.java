import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите трёхзначное число: ");
        int number = scanner.nextInt();
        int units = number % 10;
        int tens = (number / 10) % 10;
        System.out.println("Десятки: " + tens + ", Единицы: " + units);
        scanner.close();
    }
}

