package rules;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SecondThirdNumbersMultipleRuleTest {
    @Test
    public void should_return_BuzzWhizz_if_current_number_is_multiple_of_second_and_third_numbers(){
        SecondThirdNumbersMultipleRule secondThirdNumbersMultipleRule = new SecondThirdNumbersMultipleRule(3, 5, 7);
        String ret = secondThirdNumbersMultipleRule.cal(35);
        assertThat(ret, is("BuzzWhizz"));
    }
}
