package by.toukach.checker;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class StringUtilsTest {

  @ParameterizedTest
  @MethodSource("argumentProvider")
  @DisplayName("Тест для проверки корректности определения числа из строки")
  public void isPositiveNumberTest(String number, boolean expectedResult) {
    boolean actualResult = StringUtils.isPositiveNumber(number);

    assertThat(actualResult).isEqualTo(expectedResult);
  }

  public static Stream<Arguments> argumentProvider() {
    return Stream.of(
        arguments("2", true),
        arguments("-2", false),
        arguments("3", true)
    );
  }
}
