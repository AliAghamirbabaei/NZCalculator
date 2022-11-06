import Helper.Operator;
import IO.Input;
import IO.Output;
import Model.Calculate;

public class CalculatorController {

    public static void main(String[] args) {
        Operator selectedOperator = selectOperator();
        if (selectedOperator != null) {
            double result = calculate(selectedOperator);
            Output.println(result);
        }
    }

    private static Operator selectOperator() {
        Input input = new Input("Please select a operator: ");
        return Operator.findById((int) input.getNumber());
    }

    private static double calculate(Operator selectedOperator) {
        switch (selectedOperator) {
            case ADDITION -> {
                Input input = new Input("Please enter second number: ");
                double numberA = input.getNumber();
                double numberB = input.getNumber();
                return Calculate.sum(numberA , numberB);
            }
            case SUBTRACTION -> {
                Input input = new Input("Please enter second number: ");
                double numberA = input.getNumber();
                double numberB = input.getNumber();
                return Calculate.minus(numberA , numberB);
            }
            case MULTIPLICATION -> {
                Input input = new Input("Please enter second number: ");
                double numberA = input.getNumber();
                double numberB = input.getNumber();
                return Calculate.multiple(numberA , numberB);
            }
            case DIVISION -> {
                Input input = new Input("Please enter second number: ");
                double numberA = input.getNumber();
                double numberB = input.getNumber();
                return Calculate.division(numberA , numberB);
            }
            case POW -> {
                Input input = new Input("Please enter second number: ");
                double numberA = input.getNumber();
                double numberB = input.getNumber();
                return Calculate.pow(numberA , numberB);
            }
        }
        return 0;
    }
}
