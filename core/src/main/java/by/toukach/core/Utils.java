package by.toukach.core;

import by.toukach.checker.StringUtils;
import java.util.Arrays;

public class Utils {

  private static final String WRONG_ARRAY = "Массив содержит некорректный символ - %s %n";
  private static final String EMPTY_ARRAY = "Передан пустой массив";

  private Utils() {
  }

  public static boolean isAllPositiveNumbers(String... str) {
    if (str == null || str.length == 0) {
      throw new RuntimeException(EMPTY_ARRAY);
    }
    try {

      return Arrays.stream(str)
          .map(Utils::check)
          .map(StringUtils::isPositiveNumber)
          .filter(i -> !i)
          .findFirst()
          .orElse(true);

    } catch (NumberFormatException e) {
      String errorMessage = String.format(WRONG_ARRAY, e.getMessage());
      System.out.printf(errorMessage);
      throw new RuntimeException(errorMessage);
    }
  }

  private static String check(String value) {
    return String.valueOf(Long.parseLong(value));
  }
}
