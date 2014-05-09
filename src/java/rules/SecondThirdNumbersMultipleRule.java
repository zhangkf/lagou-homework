package rules;

public class SecondThirdNumbersMultipleRule extends NumberRule {
    public SecondThirdNumbersMultipleRule(int firstNumber, int secondNumber, int thirdNumber) {
        super(firstNumber, secondNumber, thirdNumber);
    }

    protected String cal(int currentNumber) {
        if(currentNumber % firstNumber != 0 && currentNumber % secondNumber == 0 && currentNumber % thirdNumber == 0){
            return "BuzzWhizz";
        }
        return null;
    }
}
