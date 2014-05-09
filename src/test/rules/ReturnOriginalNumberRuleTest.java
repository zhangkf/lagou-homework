package rules;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ReturnOriginalNumberRuleTest {
    @Test
    public void should_return_original_number(){
        ReturnOriginalNumberRule returnOriginalNumberRule = new ReturnOriginalNumberRule(3, 5, 7);
        String ret = returnOriginalNumberRule.cal(16);
        assertThat(ret, is("16"));
    }
}
