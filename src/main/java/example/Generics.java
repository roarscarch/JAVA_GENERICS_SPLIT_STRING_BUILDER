package example;

public class Generics {
    public static <T extends Number> T add(T val1, T val2) {
        if (val1 instanceof Integer) {
            return (T) Integer.valueOf(val1.intValue() + val2.intValue());
        } else if (val1 instanceof Double) {
            return (T) Double.valueOf(val1.doubleValue() + val2.doubleValue());
        } else{
            throw new UnsupportedOperationException("Unsupported numeric type");
        }
    }

    public static void main(String[] args) {
        Integer result1 = add(1, 2);
        System.out.println("Integer result: " + result1);

        Double result2 = add(1.5, 2.5);
        System.out.println("Double result: " + result2);
    }
}
