
import com.proj.Calculator;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void shouldReturnZero_onEmptyString() {
        assertEquals(0, Calculator.add(""));
    }

    @Test
    public void shouldReturnOne_onStringValue() {
        assertEquals(1, Calculator.add("1"));
    }
    @Test
    public void shouldReturnAdditionValue_onStringValue() {
        assertEquals(6, Calculator.add("1,5"));
    }
    @Test
    public void shouldReturnSumValue_onMultipleStringValue() {
        assertEquals(6, Calculator.add("1,2,3"));
    }
    @Test
    public void shouldReturnSumValue_withTwoDelimiter_onMultipleStringValue() {
        assertEquals(6, Calculator.add("1\n2,3"));
    }
    @Test
    public void shouldReturnSumValue_withCustomDelimiter_onMultipleStringValue() {
        assertEquals(6, Calculator.add("//,\n1,2,3"));
    }
}