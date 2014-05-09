package rules;

public abstract class NumberRule {
    private NumberRule nextRule;
    protected int firstNumber;
    protected int secondNumber;
    protected int thirdNumber;

    protected NumberRule(int firstNumber, int secondNumber, int thirdNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.thirdNumber = thirdNumber;
    }

    public void setNext(NumberRule nextRule){
        this.nextRule = nextRule;
    }

    public String output(int currentNumber){
        String ret = cal(currentNumber);
        if(ret == null){
            if(nextRule != null){
                return nextRule.output(currentNumber);
            }
        }

        return ret;

    }

    protected abstract String cal(int currentNumber);
}
