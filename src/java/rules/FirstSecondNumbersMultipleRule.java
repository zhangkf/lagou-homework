package rules;


public class FirstSecondNumbersMultipleRule extends NumberRule {

    public FirstSecondNumbersMultipleRule(int firstNumber, int secondNumber, int thirdNumber) {
        super(firstNumber, secondNumber, thirdNumber);
    }

    protected String cal(int currentNumber) {
        if(currentNumber % firstNumber == 0 && currentNumber % secondNumber == 0 && currentNumber % thirdNumber != 0 ){
            return "FizzBuzz";
        }
        return null;
    }
}
