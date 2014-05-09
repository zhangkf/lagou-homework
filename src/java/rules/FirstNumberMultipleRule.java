package rules;

public class FirstNumberMultipleRule extends NumberRule{

    public FirstNumberMultipleRule(int firstNumber, int secondNumber, int thirdNumber) {
        super(firstNumber, secondNumber, thirdNumber);
    }

    protected String cal(int currentNumber) {
        if(currentNumber % firstNumber == 0){
            return "Fizz";
        }
        return null;
    }
}
