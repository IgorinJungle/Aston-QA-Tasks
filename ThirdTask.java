import java.io.PrintStream;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ThirdTask {
   public static String printArr(int[] arr) {
      StringBuilder result = new StringBuilder("[");

      for(int i = 0; i < arr.length; ++i) {
         result.append(arr[i] + ", ");
      }

      return result.length() > 1 ? result.replace(result.length() - 2, result.length(), "]").toString() : "[]";
   }

   public static String streamPrintArr(int[] arr) {
      return (String)Arrays.stream(arr).mapToObj(String::valueOf).collect(Collectors.joining(", ", "[", "]"));
   }

   public static String printOdd(int[] arr) {
      StringBuilder result = new StringBuilder();

      for(int i = 0; i < arr.length; ++i) {
         if (arr[i] % 2 == 0) {
            result.append(arr[i] + ", ");
         }
      }

      if (result.length() > 0) {
         return result.substring(0, result.length() - 2).toString();
      } else {
         return "нет";
      }
   }

   public static void main(String[] args) {
      int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      PrintStream var10000 = System.out;
      String var10001 = streamPrintArr(a);
      var10000.println("Заданный массив " + var10001 + " имеет четные числа: " + printOdd(a));
   }
}
