package rules;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FirstSecondThirdNumbersMultipleRuleTest {
    @Test
    public void should_return_FizzBuzzWhizz_if_current_number_is_multiple_of_first_second_and_third_numbers(){
        FirstSecondThirdNumbersMultipleRule firstSecondThirdNumbersMultipleRule = new FirstSecondThirdNumbersMultipleRule(3, 5, 7);
        String ret = firstSecondThirdNumbersMultipleRule.cal(105);
        assertThat(ret, is("FizzBuzzWhizz"));
    }
}
