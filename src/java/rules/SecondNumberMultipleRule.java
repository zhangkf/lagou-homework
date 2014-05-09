package rules;

public class SecondNumberMultipleRule extends NumberRule {
    public SecondNumberMultipleRule(int firstNumber, int secondNumber, int thirdNumber) {
        super(firstNumber, secondNumber, thirdNumber);

    }

    protected String cal(int currentNumber) {
        if(currentNumber % secondNumber == 0){
            return "Buzz";
        }
        return null;
    }
}
