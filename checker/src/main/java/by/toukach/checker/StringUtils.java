package by.toukach.checker;

import java.util.Scanner;

public class StringUtils {

  private StringUtils() {
  }

  private static final String WRONG_SYMBOL =
      "Введено неверное значение. Необходимо ввести целое число.";

  public static boolean isPositiveNumber(String str) {
    try {
      return Long.parseLong(str) > 0;
    } catch (NumberFormatException e) {
        System.err.println(WRONG_SYMBOL);
        Scanner answer = new Scanner(System.in);
        return isPositiveNumber(answer.nextLine());
    }
  }
}
