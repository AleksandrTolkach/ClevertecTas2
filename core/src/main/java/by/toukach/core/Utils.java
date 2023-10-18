package by.toukach.core;

import by.toukach.checker.StringUtils;
import java.util.Arrays;

public class Utils {

  private static final String WRONG_ARRAY = "Массив содержит некорректный символ - %s %n";

  private Utils() {
  }

  public static boolean isAllPositiveNumbers(String... str) {
    try {

      return Arrays.stream(str)
          .map(Utils::check)
          .map(StringUtils::isPositiveNumber)
          .filter(i -> !i)
          .findFirst()
          .orElse(true);

    } catch (NumberFormatException e) {
      System.out.printf(WRONG_ARRAY, e.getMessage());
      throw new RuntimeException(e);
    }
  }

  private static String check(String value) {
    return String.valueOf(Long.parseLong(value));
  }
}
