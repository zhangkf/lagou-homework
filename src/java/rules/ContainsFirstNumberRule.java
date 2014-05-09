package rules;


public class ContainsFirstNumberRule extends NumberRule {

    public ContainsFirstNumberRule(int firstNumber, int secondNumber, int thirdNumber) {
        super(firstNumber, secondNumber, thirdNumber);
    }

    protected String cal(int currentNumber) {
        String currentNumberChars = Integer.toString(currentNumber);
        String firstNumberChar = Integer.toString(firstNumber);
        if(currentNumberChars.contains(firstNumberChar)){
            return "Fizz";
        }
        return null;
    }
}
