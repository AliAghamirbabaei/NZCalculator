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
}
