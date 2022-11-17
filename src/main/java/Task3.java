import java.io.FileNotFoundException;

/*
 * Посмотреть и исправить код при необходимости:
 * Исключение Throwable (родитель исключений) указано самым первым,
 * т.к. из-за него остальные никогда не будут достигнуты,
 * то его стоит перенести в самый конец.
 * Можно добавить ArithmeticException, чтобы избежать падения при делении на 0.
 */
public class Task3 {

    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (ArithmeticException e) {
            System.out.println("Попытка деления на 0");
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }
}