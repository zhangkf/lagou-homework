package rules;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ThirdNumberMultipleRuleTest {

    @Test
    public void should_return_Whizz_if_current_number_is_multiple_of_third_number(){
        ThirdNumberMultipleRule thirdNumberMultipleRule = new ThirdNumberMultipleRule(3, 5, 7);
        String ret = thirdNumberMultipleRule.cal(7);

        assertThat(ret, is("Whizz"));
    }

}
