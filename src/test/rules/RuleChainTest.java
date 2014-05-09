package rules;


import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RuleChainTest {
    private static int firstNumber = 3;
    private static int secondNumber = 5;
    private static int thirdNumber = 7;

    private static NumberRule numberRuleChain;

    @BeforeClass
    public static void buildRuleChain(){

        numberRuleChain = new ContainsFirstNumberRule(firstNumber, secondNumber, thirdNumber);

        FirstSecondThirdNumbersMultipleRule firstSecondThirdNumbersMultipleRule = new FirstSecondThirdNumbersMultipleRule(firstNumber, secondNumber, thirdNumber);
        FirstSecondNumbersMultipleRule firstSecondNumbersMultipleRule = new FirstSecondNumbersMultipleRule(firstNumber, secondNumber, thirdNumber);
        SecondThirdNumbersMultipleRule secondThirdNumbersMultipleRule = new SecondThirdNumbersMultipleRule(firstNumber, secondNumber, thirdNumber);
        FirstThirdNumbersMultipleRule firstThirdNumbersMultipleRule = new FirstThirdNumbersMultipleRule(firstNumber, secondNumber, thirdNumber);

        FirstNumberMultipleRule firstNumberMultipleRule = new FirstNumberMultipleRule(firstNumber, secondNumber, thirdNumber);
        SecondNumberMultipleRule secondNumberMultipleRule = new SecondNumberMultipleRule(firstNumber, secondNumber, thirdNumber);
        ThirdNumberMultipleRule thirdNumberMultipleRule = new ThirdNumberMultipleRule(firstNumber, secondNumber, thirdNumber);

        ReturnOriginalNumberRule returnOriginalNumberRule = new ReturnOriginalNumberRule(firstNumber, secondNumber, thirdNumber);

        numberRuleChain.setNext(firstSecondThirdNumbersMultipleRule);
        firstSecondThirdNumbersMultipleRule.setNext(firstSecondNumbersMultipleRule);
        firstSecondNumbersMultipleRule.setNext(secondThirdNumbersMultipleRule);
        secondThirdNumbersMultipleRule.setNext(firstThirdNumbersMultipleRule);

        firstThirdNumbersMultipleRule.setNext(firstNumberMultipleRule);
        firstNumberMultipleRule.setNext(secondNumberMultipleRule);
        secondNumberMultipleRule.setNext(thirdNumberMultipleRule);

        thirdNumberMultipleRule.setNext(returnOriginalNumberRule);

    }

    @Test
    public void should_return_Fizz_Buzz_Whizz_properly(){
        assertThat(numberRuleChain.output(1), is("1"));
        assertThat(numberRuleChain.output(4), is("4"));

        assertThat(numberRuleChain.output(33), is("Fizz"));
        assertThat(numberRuleChain.output(25), is("Buzz"));
        assertThat(numberRuleChain.output(14), is("Whizz"));

        assertThat(numberRuleChain.output(15), is("FizzBuzz"));
        assertThat(numberRuleChain.output(70), is("BuzzWhizz"));
        assertThat(numberRuleChain.output(21), is("FizzWhizz"));

        assertThat(numberRuleChain.output(105), is("FizzBuzzWhizz"));

        assertThat(numberRuleChain.output(35), is("Fizz"));


    }

    @Test
    public void should_run(){
        for (int i = 1; i < 101; i++) {
            System.out.println(numberRuleChain.output(i));

        }
    }
}
