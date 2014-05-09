package rules;


public class FirstThirdNumbersMultipleRule extends NumberRule {

    public FirstThirdNumbersMultipleRule(int firstNumber, int secondNumber, int thirdNumber) {
        super(firstNumber, secondNumber, thirdNumber);
    }

    protected String cal(int currentNumber) {
        if(currentNumber % firstNumber == 0 && currentNumber % secondNumber != 0 && currentNumber % thirdNumber == 0){
            return "FizzWhizz";
        }
        return null;
    }
}
