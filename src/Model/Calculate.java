package Model;

public class Calculate {
   public static double sum(double numberA, double numberB) {
       return numberA + numberB;
   }

    public static double minus(double numberA, double numberB) {
        return numberA - numberB;
    }

    public static double multiple(double numberA, double numberB) {
        return numberA * numberB;
    }

    public static double division(double numberA, double numberB) {
        return numberA / numberB;
    }

    public static double pow(double numberA, double numberB) {
        return Math.pow(numberA, numberB);
    }

    public static double sin(double numberA) {
       return Math.sin(Math.toRadians(numberA));
    }

    public static double cos(double numberA) {
        return Math.cos(Math.toRadians(numberA));
    }

    public static double tan(double numberA) {
        return Math.tan(Math.toRadians(numberA));
    }

    public static double degreeToRadians(double numberA) {
        return Math.toRadians(numberA);
    }
}
