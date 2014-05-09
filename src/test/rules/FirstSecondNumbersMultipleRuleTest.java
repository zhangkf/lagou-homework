package rules;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FirstSecondNumbersMultipleRuleTest {

    @Test
    public void should_return_FizzBuzz_if_current_number_is_multiple_of_first_and_second_nubmers(){
        FirstSecondNumbersMultipleRule firstSecondNumbersMultipleRule = new FirstSecondNumbersMultipleRule(3, 5, 7);
        String ret = firstSecondNumbersMultipleRule.cal(15);
        assertThat(ret, is("FizzBuzz"));
    }
}
