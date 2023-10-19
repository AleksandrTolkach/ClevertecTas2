package by.toukach.core;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class UtilsTest {

  @ParameterizedTest
  @MethodSource("argumentProvider")
  @DisplayName("Тест для проверки корректности определения числа из массива строк")
  public void isAllPositiveNumberTest(String[] numberArray, boolean expectedResult) {
    boolean actualResult = Utils.isAllPositiveNumbers(numberArray);

    assertThat(actualResult).isEqualTo(expectedResult);
  }

  public static Stream<Arguments> argumentProvider() {
    return Stream.of(
        arguments(new String[] {"1", "2", "3"}, true),
        arguments(new String[] {"1", "-2", "3"}, false),
        arguments(new String[] {"-1", "-2", "-3"}, false)
    );
  }
}
