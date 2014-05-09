package rules;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ContainsFirstNumberRuleTest {

    @Test
    public void should_return_Fizz_if_current_number_contains_first_number(){
        ContainsFirstNumberRule containsFirstNumberRule = new ContainsFirstNumberRule(3, 5, 7);
        String ret = containsFirstNumberRule.cal(13);
        assertThat(ret, is("Fizz"));
    }

    @Test
    public void should_return_Fizz_if_current_number_contains_first_and_second_numbers(){
        ContainsFirstNumberRule containsFirstNumberRule = new ContainsFirstNumberRule(3, 5, 7);
        String ret = containsFirstNumberRule.cal(35);
        assertThat(ret, is("Fizz"));
    }
}
