import java.util.Scanner;

public class Calculator {

    private static Operator selectedOperator;
    private static float firstNumber;
    public static void main(String[] args) {
        firstNumber = getNumber();
        selectOperator();
    }

    private static float getNumber() {
        System.out.print("Please enter a number: ");
        return new Scanner(System.in).nextFloat();
    }

    private static void selectOperator() {
        System.out.println("Please select operator: ");
        Operator.printItems();

        Scanner scanner = new Scanner(System.in);
        selectedOperator = Operator.findById(scanner.nextInt());
        switch (selectedOperator) {
            case ADDITION -> {
                System.out.println(firstNumber + getNumber());
            }
            case SUBTRACTION -> {
                System.out.println(firstNumber - getNumber());
            }
            case MULTIPLICATION -> {
                System.out.println(firstNumber * getNumber());
            }
            case DIVISION -> {
                System.out.println(firstNumber / getNumber());
            }
            case POW -> {
                System.out.println(Math.pow(firstNumber, getNumber()));
            }
        }
    }
}
