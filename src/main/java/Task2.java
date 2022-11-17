/*
Посмотреть и изменить код:
   try {
      int d = 0;
      double catchedRes1 = intArray[8] / d;
      System.out.println("catchedRes1 = " + catchedRes1);
   } catch (ArithmeticException e) {
      System.out.println("Catching exception: " + e);
   }
* Создан массив и блок, чтобы не было выхода за пределы массива.
 */
public class Task2 {
    public static void main(String[] args) {
        int[] intArray = {1, 0, 3};
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (IndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
