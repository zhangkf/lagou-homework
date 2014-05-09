package rules;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FirstNumberMultipleRuleTest {

    @Test
    public void should_return_Fizz_if_nubmer_is_multiple_of_first_number(){
        FirstNumberMultipleRule firstNumberMultipleRule = new FirstNumberMultipleRule(3, 5, 7);
        String ret = firstNumberMultipleRule.cal(3);

        assertThat(ret, is("Fizz"));

    }
}
