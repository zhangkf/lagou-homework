package rules;


public class FirstSecondThirdNumbersMultipleRule extends NumberRule {

    public FirstSecondThirdNumbersMultipleRule(int firstNumber, int secondNumber, int thirdNumber) {
        super(firstNumber, secondNumber, thirdNumber);
    }

    protected String cal(int currentNumber) {

        if(currentNumber % firstNumber ==0 && currentNumber % secondNumber ==0 && currentNumber % thirdNumber ==0){
            return "FizzBuzzWhizz";
        }
        return null;

    }
}
