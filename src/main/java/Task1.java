import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
 * и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
 * вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */

public class Task1 {
    public static void main(String[] args) {
        float number = inputFromUser();
        System.out.println("Вы ввели " + number);
    }

    private static float inputFromUser() {
        float result = -1;
        System.out.println("Введите дробное или целое число (ввод дробного числа осуществить через точку):");
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        while (!flag) {
            try {
                result = scanner.nextFloat();
                flag = true;
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Не верный ввод. Повторите еще раз:");
            }
        }
        scanner.close();
        return result;
    }
}