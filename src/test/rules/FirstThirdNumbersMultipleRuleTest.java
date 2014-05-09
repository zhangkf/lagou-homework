package rules;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FirstThirdNumbersMultipleRuleTest {
    @Test
    public void should_return_FizzWhizz_if_currrent_number_is_multiple_of_first_and_third_numbers(){
        FirstThirdNumbersMultipleRule firstThirdNumbersMultipleRule = new FirstThirdNumbersMultipleRule(3, 5, 7);
        String ret = firstThirdNumbersMultipleRule.cal(21);
        assertThat(ret, is("FizzWhizz"));

    }
}
