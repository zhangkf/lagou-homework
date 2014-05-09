package rules;

public class ReturnOriginalNumberRule extends NumberRule {
    public ReturnOriginalNumberRule(int firstNumber, int secondNumber, int thirdNumber) {
        super(firstNumber, secondNumber, thirdNumber);
    }

    protected String cal(int currentNumber) {
        return Integer.toString(currentNumber);
    }
}
