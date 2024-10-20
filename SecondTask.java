import java.util.Scanner;

public class SecondTask {
   public static String getStr(String mainStr) {
      Scanner scanner = new Scanner(System.in);
      System.out.print(mainStr);
      String str = scanner.nextLine();
      return str;
   }

   public static void main(String[] args) {
      String a = getStr("Введите строку a: ");
      String b = getStr("Введите строку b: ");
      if (a.equals(b)) {
         System.out.println("Строки идентичны");
      } else {
         System.out.println("Строки неидентичны");
      }

   }
}
