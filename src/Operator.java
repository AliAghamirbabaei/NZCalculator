public enum Operator {
    ADDITION(1, "+"),
    SUBTRACTION(2, "-"),
    MULTIPLICATION(3, "*"),
    DIVISION(4, "/"),
    POW(5, "*");

    public final int id;
    public final String sign;

    Operator(int id, String sign) {
        this.id = id;
        this.sign = sign;
    }

    @Override
    public String toString() {
        return id + ". " + sign;
    }

    public static Operator findById(int id) {
        for (Operator item : values()) {
            if (item.id == id) return item;
        }
        return null;
    }

    public static void printItems() {
        Operator[] items = Operator.values();
        for (Operator item : items) {
            System.out.println(item);
        }
    }
}
