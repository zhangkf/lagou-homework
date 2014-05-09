package rules;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SecondNumberMultipleRuleTest {

    @Test
    public void should_return_Buzz_if_current_number_is_multiple_of_second_number(){
        SecondNumberMultipleRule secondNumberMultipleRule = new SecondNumberMultipleRule(3, 5, 7);
        String ret = secondNumberMultipleRule.cal(5);
        assertThat(ret, is("Buzz"));
    }
}
