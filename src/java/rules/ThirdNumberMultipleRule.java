package rules;

public class ThirdNumberMultipleRule extends NumberRule {

    public ThirdNumberMultipleRule(int firstNumber, int secondNumber, int thirdNumber) {
        super(firstNumber, secondNumber, thirdNumber);
    }

    protected String cal(int currentNumber) {
        if(currentNumber % thirdNumber == 0){
            return "Whizz";
        }
        return null;
    }
}
