import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SumTest {

    @ParameterizedTest
    @MethodSource("validData")
    void sumOfTwoNumbersValidDataPositive(int expectedResult,int a, int b) {
        Sum sum = new Sum();
        assertEquals(expectedResult, sum.sumOfTwoNumbers(a,b),
                "Actual result doesn't match to expected");
    }
    static Stream<Arguments> validData(){
        return Stream.of(
                arguments(7, 5, 2),
                arguments(-9, -5, -4),
                arguments(-8, -2, -6),
                arguments(3, 10, -7)
        );
    }

    @ParameterizedTest
    @MethodSource("invalidData")
    void sumOfTwoNumbersInvalidData(int expectedResult,int a, int b) {
        Sum sum = new Sum();
        assertNotEquals(expectedResult, sum.sumOfTwoNumbers(a,b),
                "Actual result doesn't match to expected");
    }

    static Stream<Arguments> invalidData(){
        return Stream.of(
                arguments(9, 5, 2),
                arguments(-100, -5, -4),
                arguments(10, -2, -6),
                arguments(-3, 10, -7)
        );
    }
}