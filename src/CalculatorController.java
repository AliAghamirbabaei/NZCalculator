import Helper.Operator;
import Model.Calculate;
import IO.*;

public class CalculatorController {

    public static void main(String[] args) {
        Input input = new Input("Please enter a number: ");
        double number = input.getNumber();

        Operator.printItems();
        Operator selectedOperator = selectOperator();
        if (selectedOperator != null) {
            double result = calculate(selectedOperator, number);
            Output.println("Result: " + result);
        }
    }

    private static Operator selectOperator() {
        Input input = new Input("Please select a operator: ");
        return Operator.findById((int) input.getNumber());
    }

    private static double calculate(Operator selectedOperator, double numberA) {
        switch (selectedOperator) {
            case ADDITION -> {
                Input input = new Input("Please enter second number: ");
                double numberB = input.getNumber();
                return Calculate.sum(numberA, numberB);
            }
            case SUBTRACTION -> {
                Input input = new Input("Please enter second number: ");
                double numberB = input.getNumber();
                return Calculate.minus(numberA, numberB);
            }
            case MULTIPLICATION -> {
                Input input = new Input("Please enter second number: ");
                double numberB = input.getNumber();
                return Calculate.multiple(numberA, numberB);
            }
            case DIVISION -> {
                Input input = new Input("Please enter second number: ");
                double numberB = input.getNumber();
                return Calculate.division(numberA, numberB);
            }
            case POW -> {
                Input input = new Input("Please enter second number: ");
                double numberB = input.getNumber();
                return Calculate.pow(numberA, numberB);
            }
            case SIN -> {
                return Calculate.sin(numberA);
            }
            case COS -> {
                return Calculate.cos(numberA);
            }
            case TAN -> {
                return Calculate.tan(numberA);
            }
            case DEGREE_TO_RADIAN -> {
                return Calculate.degreeToRadians(numberA);
            }
        }
        return Double.NaN;
    }
}
