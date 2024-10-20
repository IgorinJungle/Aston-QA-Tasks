import java.io.PrintStream;
import java.util.Scanner;

public class FirstTask {
   public static int getInt(String mainStr) {
      Scanner scanner = new Scanner(System.in);

      while(true) {
         System.out.print(mainStr);
         String str = scanner.nextLine();

         try {
            return Integer.parseInt(str);
         } catch (Exception var4) {
            System.out.println("Введено не целое число. Попробуйте снова.");
         }
      }
   }

   public static String printComparison(int a, int b) {
      if (a > b) {
         return "a > b";
      } else {
         return a < b ? "a < b" : "a = b";
      }
   }

   public static String printRes(int a, int b) {
      if (b == 0) {
         return "Деление на 0 не возможно";
      } else {
         return a % b == 0 ? Integer.toString(a / b) : Float.toString((float)a / (float)b);
      }
   }

   public static void main(String[] args) {
      int a = getInt("Введите целое число a: ");
      int b = getInt("Введите целое число b: ");
      PrintStream var10000 = System.out;
      String var10001 = printComparison(a, b);
      var10000.println("Результат сравнения: " + var10001);
      System.out.println(a + " + " + b + " = " + (a + b));
      System.out.println(a + " - " + b + " = " + (a - b));
      System.out.println(a + " / " + b + " = " + printRes(a, b));
      System.out.println(a + " * " + b + " = " + a * b);
   }
}
