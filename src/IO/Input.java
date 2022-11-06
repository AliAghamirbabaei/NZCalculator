package IO;
import java.util.Scanner;

public class Input {
    private final String message;

    public Input(String message) {
        this.message = message;
    }

    public double getNumber() {
        Scanner scanner = new Scanner(System.in);
        if (message != null) {
            Output.print(message);
        }

        return scanner.nextDouble();
    }
}
